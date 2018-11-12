package com.biz.ex01;

public class Gugudan {
	
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			guguDan(i);
		}
	}
	
	public static void guguDan(int intNum) {
		for(int i=1; i<=9; i++) {
			System.out.println(intNum+" x "+i+" = "+(intNum*i));
		}
		System.out.println("----------");
	}

}
