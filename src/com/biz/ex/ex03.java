package com.biz.ex;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor = 99;
		int intEng = 88 ;
		int intMath = 100;
		int intSci = 100;

		// �������
		// int intSum = intKor + intEng + intMath + intSci;

		// main���� ����� ������ gradeSum() ����
		// ��� ��Ű��
		int intSum = gradeSum(intKor, intEng, intMath, intSci);
		float floatAvg = intSum / 4;
	
	}
	
	public static int gradeSum(int intKor, 
			int intEng, int intMath, int intSci) {
		
		int intS = intKor + intEng + intMath + intSci;
		return intS;
		
	}

}
