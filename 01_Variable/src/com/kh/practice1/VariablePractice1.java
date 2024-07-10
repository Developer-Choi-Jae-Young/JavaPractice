package com.kh.practice1;

//Scanner 클래스 import : 외부 경로의 클래스를 사용 할 때 선언
import java.util.Scanner;

public class VariablePractice1 {
	//Q. 이름, 성별, 나이, 키를 사용자에게 입력받아
	//	 각각의 값을 변수에 담고 출력하세요.
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// "이름을 입력하세요 : " 값을 출력
		// 줄바꿈 처리하지 않기 위해 print 메소드 사용
		System.out.print("이름을 입력하세요 : ");
		
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		
		String gender = sc.nextLine();
		
        System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		
		double height = sc.nextDouble();
		
		//System.out.println("키가 " + height + "cm인 " + age + "살 " + gender + "자 " + name +"님 반갑습니다^^" );
		System.out.printf("키는 %.1fcm이고 %d살 \n%s자인 %s님 반갑습니다^^", height,age,gender,name);
		
		/* int a = 12;
		 double d = 3.3;
		 int result = a + (int)d;
		 System.out.println(result);*/
		

	}

}
