package com.biz.ex;

public class ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		int intSum = 0;
		int intAvg = 0;
		for(index = 0; index < 16 ;index++) {
			int intNum = (int)(Math.random() * (100-50+1)) + 50;
			// intSum = (int)(Math.random() * (100-50+1)) + 50;
			intSum += intNum;
			// intAvg += intSum / 16;
			System.out.println(intNum);
		}
		System.out.println("------------------");
		System.out.println("�հ�:" + intSum);
		intAvg = intSum / index;
		System.out.println("���:" + intAvg);
	}
}