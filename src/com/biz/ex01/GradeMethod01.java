package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		
		int kNum=80;
		int eNum=90;
		int mNum=80;
		
		System.out.println("합계 : " + gradeSum(kNum,eNum,mNum));
		System.out.println("평균 : " + gradeAvg(kNum,eNum,mNum));

	}
	public static int gradeSum(int num1, int num2, int num3) {
		
		int sum=num1+num2+num3;
		
		return sum;
	}
	
	public static int gradeAvg(int num1, int num2, int num3) {
		
		int avg=(num1+num2+num3)/3;
		
		return avg;
	}


}
