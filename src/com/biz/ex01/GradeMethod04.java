package com.biz.ex01;

public class GradeMethod04 {
	
	public static void main(String[] args) {
		
		int intKor=(int)(Math.random()*(100-50+1))+50;
		int intEng=(int)(Math.random()*(100-50+1))+50;
		int intMat=(int)(Math.random()*(100-50+1))+50;
		int intSci=(int)(Math.random()*(100-50+1))+50;
		int intSum=gradeSum(intKor,intEng);
			intSum+=gradeSum(intMat,intSci);
		// int intSum=gradeSum(intKor+intEng,intMat+intSci);
		System.out.printf("Kor : %d\nEng : %d\nMat : %d\nSci : %d\nSum : %d\n",intKor,intEng,intMat,intSci,intSum);
		System.out.println("Avg : "+(intSum/4.0f));
	}
	
	public static int gradeSum(int intNum1, int intNum2) {
		return intNum1+intNum2;
	}

}
