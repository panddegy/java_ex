package com.biz.ex01;

public class GradeMethod02 {
	
	public static void main(String[] args) {
		
		int intKor=91;
		int intEng=98;
		int intMath=87;
		int intSci=93;
		float floatSum=gradeSum(intKor,intEng,intMath,intSci);
		float floatAvg=floatSum/4.0f;
		
		System.out.println("Sum : " + floatSum);
		System.out.println("Avg : " + floatAvg);
		
	}
	
	public static float gradeSum(int intNum1, int intNum2, int intNum3, int intNum4) {
		
		return intNum1+intNum2+intNum3+intNum4;
	}

}
