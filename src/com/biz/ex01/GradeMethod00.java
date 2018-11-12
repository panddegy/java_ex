package com.biz.ex01;

import java.util.Scanner;

public class GradeMethod00 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("과목의 개수를 입력하세요 : ");
		int num1=sc.nextInt();
		int[] ar=new int[num1];
		for(int i=0; i<num1; i++) {
			System.out.print("점수를 입력해주세요 : ");
			ar[i]=sc.nextInt();
		}
		System.out.printf("총점은 %d점 입니다.",gradeSum(ar));
		sc.close();
	}
	
	public static int gradeSum(int[] ar) {
		int sum=0;
		
		for(int i=0; i<ar.length; i++) {
			sum+=ar[i];
		}
		return sum;
	}

}
