package com.itwill01.method;

/*
 * 4개의 멤버메쏘드를 가짐
 */

public class Calculator {

	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 */
	
	public int add(int i, int j) {
		return i + j;
	}
	
	public int sub(int i, int j) {
		return i - j;
	}
	
	public int div(int i, int j) {
		return i / j;
	}
	
	public int mul(int i, int j) {
		return i * j;
	}
}
