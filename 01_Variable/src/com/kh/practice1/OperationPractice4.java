package com.kh.practice1;

public class OperationPractice4 {

	public static void main(String[] args) {
		/*
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 - (iNum2 * 2)); // 2
		System.out.println((int)dNum); // 2
		
		System.out.println(iNum2 * dNum); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		
		System.out.println( (double)iNum1/iNum2); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println((int)fNum ); // 3
		System.out.println( (int)(iNum1 / fNum) ); // 3
		
		System.out.println( iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println( (char)(ch + iNum1) ); // 'K'
		*/
		
		String str;
		
		if(true) {
			str = "±âº»";
			if(true) {
				str += "Ãß°¡!!!";
			}
		}
		
		System.out.println(str);
		
		
		int a = 3;
		
		String str1 = (a % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";

		
		System.out.println(str1);
		
		int n = 2;
		switch (n) {
		case 1:
			
		case 2:
			
		case 3:
			System.out.print("°Ü¿ï");
			break;
		case 4:
			
		case 5:
			
		case 6:
			System.out.print("º½");
			break;
		default:
			System.out.print(4);
		}
	}

}
