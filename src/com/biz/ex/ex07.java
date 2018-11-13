package com.biz.ex;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retNum = retSum(50);
		System.out.println(retNum);

	}
	
	public static int retSum(int intNum) {
		intNum = intNum + 100;
		intNum += 100;
//		System.out.println(intNum);
		return intNum;
	}

}