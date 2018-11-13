package com.biz.ex;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2 ; i <= 9 ; i++) {
			guguDan(i);
		}
	}
	
	public static void guguDan(int intDan) {
		System.out.println(intDan + "´Ü");
		for(int i = 1;i <=9; i++) {
			System.out.printf("%d x %d = %d\n",
					intDan, i, intDan * i);
		}
		System.out.println("==================");
		
	}

}