package com.biz.ex01;

import java.util.Scanner;

public class GradeMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int kNum=sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int eNum=sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int mNum=sc.nextInt();
		System.out.print("성적 합계 : ");
		System.out.println(gradeSum(kNum,eNum,mNum));
		sc.close();
		
	}
	
	public static int gradeSum(int num1, int num2, int num3) {
		
		int sum=num1+num2+num3;
		
		return sum;
	}

}
