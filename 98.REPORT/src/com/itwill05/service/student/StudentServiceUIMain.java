package com.itwill05.service.student;

import java.util.Scanner;

public class StudentServiceUIMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		StudentService studentService=new StudentService();
		System.out.println("*****************************");
		System.out.println("     학생성적관리프로그램");
		System.out.println("*****************************");
		while (run) {
			System.out.println("------------메뉴-------------");
			System.out.println("0. 전체학생출력");
			System.out.println("1. 전체학생총점,평균,평점계산");
			System.out.println("2. 전체학생 총점으로 석차계산");
			System.out.println("3. 번호로   검색");
			System.out.println("4. 학점으로 검색");
			System.out.println("5. 이름으로 검색");
			System.out.println("6. 학생총점으로 오름차순정렬");
			System.out.println("7. 학생이름으로 오름차순정렬");
			System.out.println("8. 학생추가");
			System.out.println("9. 종료");
			System.out.println("----------------------------");
			System.out.print("메뉴번호선택> ");
			
			int menuNo =scanner.nextInt(); // 여기서 항상 대기함
			if(menuNo==0) {
				//0. 전체학생출력
				studentService.print();
				System.out.println();
				System.out.println();
			}else if(menuNo==1) {
				//1. 전체학생총점,평균,평점계산
				studentService.calculate();
				studentService.print();
				System.out.println();
				System.out.println();
			}else if(menuNo==2) {
				//2. 전체학생 총점으로 석차계산
				studentService.calculateRank();
				studentService.print();
				System.out.println();
				System.out.println();
			}else if(menuNo==3) {
				//3. 번호로   검색
				System.out.print(" >>번호입력: ");
				int no = scanner.nextInt();
				Student findStudent = studentService.findByNo(no);
				if(findStudent!=null) {
					Student.headerPrint();
					findStudent.print();
				}else {
					System.out.println(no+ "번 학생없다..");
				}
				System.out.println();
				System.out.println();
			}else if(menuNo==4) {
				//4. 학점으로 검색
				System.out.print(" >>학점입력: ");
				String gradeStr = scanner.next();
				char grade = gradeStr.charAt(0); // 스트링을 char로 바꾸려고 char의 첫번째 글자를 따오는 메소드
				Student[] findGrade = studentService.findByGrade(grade);
				if(findGrade!=null) {
					Student.headerPrint();
					for (int i = 0; i < findGrade.length; i++) {
						findGrade[i].print();
					}
				} else {
					System.out.println(grade+"학점 학생 없다..");
				}
				System.out.println();
				System.out.println();
				
			}else if(menuNo==5) {
				//5. 이름으로 검색
				System.out.print(" >>이름입력: ");
				String nameStr = scanner.next();
				Student[] findName = studentService.findByName(nameStr);
				if(findName!=null) {
					Student.headerPrint();
					for (int i = 0; i < findName.length; i++) {
						findName[i].print();
					} 
				} else {
					System.out.println("이름이 "+nameStr+"인 학생 없다..");
				}
				System.out.println();
				System.out.println();
					
			}else if(menuNo==6) {
				//6. 학생총점으로 오름차순정렬
				studentService.sortTotalAscend();
				studentService.print();
				System.out.println();
				System.out.println();
			}else if(menuNo==7) {
				//7. 학생이름으로 오름차순정렬
				studentService.sortNameAscend();
				studentService.print();
				System.out.println();
				System.out.println();
			}else if(menuNo==8) {
				//8. 학생추가
				System.out.print(" >>학생정보입력(번호 이름 국어 영어 수학: ");
			String noStr = scanner.next();
			String nameStr = scanner.next();
			String korStr = scanner.next();
			String engStr = scanner.next();
			String mathStr = scanner.next();
			System.out.println(noStr+", "+nameStr+", "+korStr+", "+engStr+", "+mathStr);
			
			int no = Integer.parseInt(noStr);
			int kor = Integer.parseInt(korStr);
			int eng = Integer.parseInt(engStr);
			int math = Integer.parseInt(mathStr);
			Student newStudent = new Student(no, nameStr, kor, eng, math);
			
			studentService.addStudent(newStudent); // 아직 구현 안되어있데
			
			System.out.println();
			System.out.println();
			
			}else if(menuNo==9) {
				run=false;
				System.out.println("학생성적관리프로그램을 종료합니다.");
			}
		}

	}

}