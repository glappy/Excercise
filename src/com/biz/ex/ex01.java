package com.biz.ex;

public class ex01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int intKor = 60 ; // �����̸� ù���� �ҹ���
		int intEng = 90 ; // �����̸��� �ǹ��ִ� �ܾ�����
		int intMath = 90 ;
		
		intKor = 60;
		intEng = 90;
		intMath = 80;
		
		int intSum = gradeSum(intKor, intEng, intMath);
		System.out.println(intSum);
		System.out.println(gradeSum(intKor,intEng, intMath));
		
	}
	
	// method �̸��� ù���� �ҹ���
	// �ǹ��ִ� �ܾ� ����
	public static int gradeSum(int intKor, int intEng, int intMath) {

		int intSum = intKor + intEng + intMath;
		return intSum;
		
	}

}