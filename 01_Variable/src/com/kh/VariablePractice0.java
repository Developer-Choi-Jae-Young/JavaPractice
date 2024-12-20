package com.kh;

import java.util.Scanner;

public class VariablePractice0 {

	public static void main(String[] args) {
		
		/*
		 * 예제 1) 변수를 사용하여 아래 코드를 이해하기쉽도록 변경해보기.
		 - 연도에 해당하는 값을 정수형(int) 타입의 year 이름의 변수로 선언
		 -현재 연도를 yer 변수에 대입
		 
		 - 나이에 해당하는 값을 정수형(int) 타입의 age 이름의 변수로 선언 및 대입
		 변수를 사용하지 않은 경우
		 */
		int year;
		year = 2024;
		int age;
		age = 25;
		System.out.println("현재는 " + year + "년이고 나이는 " + age +"살 입니다.");
		System.out.printf("현재는 %d년이고 나이는 %d살 입니다.", year, age);
		//변수명 명명규칙!
		//카멜케이스 : 소문자로 시작하고 다음단어의 첫 글자를 대문자로 작성
		//숫자로 시작하면 안된다
		//특수문자는 _,$만 사용가능
		//예약어는 사용할 수 없음 ex)int, 
		//대소문자 구분이 가능합니다
		//상수 : 변하지 않는 값을 저장하는 공간 - final 예약어를 사용.
		//몸무게가 80kg 이상인 경우 탑승을 못합니다.
		final int limit;
		limit = 80;
		System.out.printf("몸무게가 %dkg 이상인 경우 탑승을 못합니다.", limit);
	}

}
