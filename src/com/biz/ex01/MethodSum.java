package com.biz.ex01;

public class MethodSum {
	
	public static void main(String[] args) {
		
		System.out.printf("retSum : %d\n",retSum(50));
	}
	
	public static int retSum(int intNum) {
		
		intNum+=100;
		return intNum;
	}

}
