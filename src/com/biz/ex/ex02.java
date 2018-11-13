package com.biz.ex;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor;
		int intEng;
		int intMath;
		int intSci;
		
		intKor = 90;
		intEng = 88;
		intMath = 77;	
		intSci = 67;
		
		float floatAvg = gradeSum(intKor, intEng, intMath, intSci);
		System.out.println(floatAvg);

	}
	
	public static float gradeSum(int intKor,
			int intEng, int intMath, int intSci) {
		
		float floatAvg 
		= (intKor + intEng + intMath + intSci) /4;
		
		return floatAvg;
	}

}