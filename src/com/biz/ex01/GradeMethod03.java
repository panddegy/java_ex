package com.biz.ex01;

public class GradeMethod03 {
	
	public static void main(String[] args) {
	
		int korNum=90;
		int engNum=95;
		int mathNum=80;
		int sciNum=90;
		
		System.out.println(gradeSum(korNum,engNum,mathNum,sciNum));
		
		
	}
	
	public static float gradeSum(int intNum1, int intNum2, int intNum3, int intNum4) {

		return (intNum1+intNum2+intNum3+intNum4)/4.0f;
	}
	
	

}
