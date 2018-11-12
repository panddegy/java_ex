package com.biz.ex01;

public class RndStar {
	
	public static void main(String[] args) {
		
		int intStars=(int)(Math.random()*(9-5+1))+5;
		System.out.println(intStars+" x "+intStars);
		makeStars(intStars);
		
	}
	
	public static void makeStars(int intStars) {
		
		for(int i=0; i<intStars; i++) {
			for(int j=0; j<intStars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
