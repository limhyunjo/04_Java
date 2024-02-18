package edu.kh.javatest;

// : 한줄 주석
/* 범위 주석
 * -> 코드 설명 작성 시 사용
 */
public class JavaTest {

	// alt +shift +j :클래스/ 메서드 설명용 주석(html 방식으로 작성)
	/**main 메서드 
  * <p>
  * 자바 프로그램을 실행 시키기 위해서 반드시 필요한 구문(기능)
  * </p>
 * @param args
 * */

public static void main(String[]args) {

// class: -자바 코드를 작성하는 영역
//	  -객체의 내용(속성, 기능)을 정의함
//  (js 의 생성자 함수와 비슷한 형태)
	
	
	// 자바 코드 실행 방버
	// 1) 위에 Run 버튼 ( 재생 버튼 처럼 생긴 것) 클릭
	// 2) 실행 단축키 : ctrl + f11-> console 창에 내가 쓴게 실행됨
	
    //System.out.println();
	//-> () 안의 문자열을 console에 출력 후 줄바꿈하는 기능
	
	System.out.println("Hello world");
	
	System.out.println("Java는 코드 끝에 꼭 세미콜론(;) 붙여야 한다!");
	// ; 안붙이면 에러남
	System.out.println("println() 구문 자동완성은 syso + ctrl + space");
	System.out.println(100+200); //숫자 연산 가능 300
	System.out.println(100+30+"입니다"); //130입니다
	System.out.println("합계 :"+2222+333+"원");
	//사칙 연산 우선 순위에 따라서 앞에서부터 더해져서 합계 :2222333원으로 이어 써짐
	
	//사칙연산 우선순위 적용
	//먼저 연산하고 싶으면 소괄호()로 묶어서 써줘야 함
	//()가 1순위 .이 2순위 형변환이 3순위
	
	System.out.println("합계"+(2222+333)+"원"); //합계2555원
	
	/*
	 * Java API DOC 확인 : 궁금한 것 클릭 -> shift + f2 
	 * -> 중요! 
	 * Java API DOC == 자바 만들어서 제공하는 코드에 대한 설명 문서
	 */
 }
}