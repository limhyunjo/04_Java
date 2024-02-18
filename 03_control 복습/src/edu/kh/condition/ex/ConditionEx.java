package edu.kh.condition.ex;

import java.util.Scanner;


/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {

	
 //필드 (객체의 속성 == 객체가 가지고 있는 값 / 변수)
 //-> 클래스 바로 아래에 만드는 변수가 필드
	
// ctrl + space 롤 자동완성 하면 위에 import가 바로 생김
  Scanner sc = new Scanner(System.in);
  
  /**
 * 나이를 입력 받아
 * 19세 이상은 성인, 미만은 "성인이 아닙니다"
 */
public void method1() {
	
	System.out.print("나이 입력 : ");
	int age = sc.nextInt();
	
	if(age>=19) {
		System.out.println("성인");
	}else {
		System.out.println("성인이 아닙니다");
	}
	
	
  }
	

/**
 * 나이를 입력 받아
 * 13세 이하면 "어린이"
 * 13세 초과 19세 미만 "청소년"
 * 18세 초과 "성인"
 */
public void method2() {
	 System.out.print("나이 : ");
	 int age = sc.nextInt();
	 
	 String result; // 결과를 저장하기 위한 문자열 변수 선언 result값들이 저장됨
	 
	 if(age<=13) result="어린이";
	 else if(age<=18) result = "청소년";
	 else result="성인";
	 
	 System.out.println(result);
	 
 }

/**
	 * 달(월)을 입력 받아 해당 계절 출력하기
	 * <ul>
	 * 	<li>봄   : 3,4,5</li>
	 * 	<li>여름 : 6,7,8</li>
	 * 	<li>가을 : 9,10,11</li>
	 * 	<li>겨울 : 12,1,2</li>
	 * 	<li>그 외 : 잘못 입력</li>
	 * </ul>
	 */
 public void method3() {
	 System.out.print("월 :");
	 int month = sc.nextInt();
	 String result;
	 
	 if(month >=3&& month <=5) result="봄";
	else if(month >= 6 && month <= 8) 	result = "여름";
	else if(month >= 9 && month <= 11) 	result = "가을";
	else if(month==12 || month==1 || month ==2) result ="겨울";
	else result ="잘못 입력";
	 System.out.println(result);
	 
	 
	 
 }
}
