
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {

		/*
		 * 배열 객체의 초기화
		 *  - 대괄호(블록)를 쓰면됨
		 */

		System.out.println("----- 학생 데이터를 저장하기위한 배열 객체 생성 초기화 ------");
		int[] noArray = {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray = {"KIM", "LEE", "JANG", "LIM", "PARK","CHOI", "SIM", "KOO", "SEO", "SEOL"};
		int[] korArray =  {99,91,83,60,87,99,100,79,93,51};
		int[] engArray =  {98,98,63,71,83,88,100,89,73,61};
		int[] mathArray = {97,61,53,70,51,89,30,69,83,12};
		int[] totArray =  {0,0,0,0,0,0,0,0,0,0};
		double[] avgArray = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeArray = {'F','F','F','F','F','F','F','F','F','F'};				
		int[] rankArray = {1,1,1,1,1,1,1,1,1,1};
		
		
		// 총점, 평균, 평점 계산
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i]/3.0;
			if(avgArray[i]>=90) {
				gradeArray[i] = 'A';
			}else if(avgArray[i]>=80) {
				gradeArray[i] = 'B';				
			}else if(avgArray[i]>=70) {
				gradeArray[i] = 'C';				
			}else if(avgArray[i]>=60) {
				gradeArray[i] = 'D';				
			}else {
				gradeArray[i] = 'F';
			}
		}
		
		//[quiz] 석차계산		
		/* 0번 학생 석차 계산
		for (int j = 0; j < noArray.length; j++) {
			if(totArray[0]<totArray[j]) {
				rankArray[0]++;	
			} 
		}
		*/
		for (int j = 0; j < noArray.length; j++) {
			for(int i = 0; i < noArray.length; i++) {
				if(totArray[i]<totArray[j]) {
					rankArray[i]++;	
				}
			}
		}
			
		
		// 3번학생 찾아서 1명 정보 출력(학생번호는 중복x)
		System.out.println();
		System.out.println("---3번학생 찾아서 1명 정보출력---");
		for (int i = 0; i < noArray.length; i++) {
			if(noArray[i]==3) {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				break;
			}
		}
		
		
		// F학점 학생 모두 찾아 여러명 정보 출력
		System.out.println();
		System.out.println("--- F학점 학생 모두 찾아 정보 출력 ---");
		for (int i = 0; i < gradeArray.length; i++) {
			if(gradeArray[i]=='F') {
				System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
						noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
				break;
			}
		}
		
		
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
		}
		
		
		/*
		 * quiz 오름차순(내림차순) 정렬
		*/
		// bubble sort
		for(int i=0; i<noArray.length-1; i++ ) {
			for (int j = 0; j < noArray.length-1; j++) {
				if(totArray[j] < totArray[j+1]) {
					// 1번째 swap
					// 총점 교환
					int tempTot = totArray[j];
					totArray[j] = totArray[j+1];
					totArray[j+1] = tempTot;
					
					// 번호
					int tempNo = noArray[j];
					noArray[j] = noArray[j+1];
					noArray[j+1] = tempNo;
					
					// 이름
					String tempName = nameArray[j];
					nameArray[j] = nameArray[j+1];
					nameArray[j+1] = tempName;
					
					// 국어
					int tempKor = korArray[j];
					korArray[j] = korArray[j+1];
					korArray[j+1] = tempKor;
					
					// 영어
					int tempEng = engArray[j];
					engArray[j] = engArray[j+1];
					engArray[j+1] = tempEng;
					
					// 수학
					int tempMath = mathArray[j];
					mathArray[j] = mathArray[j+1];
					mathArray[j+1] = tempMath;
					
					// 평균
					double tempAvg = avgArray[j];
					avgArray[j] = avgArray[j+1];
					avgArray[j+1] = tempAvg;
					
					// 평점
					char tempGrade = gradeArray[j];
					gradeArray[j] = gradeArray[j+1];
					gradeArray[j+1] = tempGrade;
					
					// 석차
					int tempRank = rankArray[j];
					rankArray[j] = rankArray[j+1];
					rankArray[j+1] = tempRank;
					
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.printf("---------------학생 성적출력[정렬 후]-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
					noArray[i],nameArray[i],korArray[i],engArray[i],mathArray[i],totArray[i],avgArray[i],gradeArray[i],rankArray[i]);
		}		
		
	}

}
