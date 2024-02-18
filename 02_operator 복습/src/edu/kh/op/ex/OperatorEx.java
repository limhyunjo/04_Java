package edu.kh.op.ex;

import java.util.Scanner;

/* 기능용 (예제) 클래스 */

public class OperatorEx {
	
 public void test() {
 System.out.println("다른 클래스에 작성된 기능");
	
 }
 
 /**
 * 입력 받은 정수가 3의 배수가 맞는지 확인
 */
 // 입력 받은 -> Scanner
public void method1() {
	 //Scanner 객체 생성
	Scanner sc = new Scanner(System.in);
	
	System.err.print("정수 입력 : ");
	int input = sc.nextInt();
	
	// boolean 변수 이름 보통 앞에 is 단어 붙임
	boolean isTrue = input % 3 ==0;
	
	System.out.printf("%d는 3의 배수 : %b", input, isTrue);
	// 실행은 안되고 기능만 만들어짐 -> 기능용으로 이동해서 작성
	 
 }


  /**
 * 첫 번째 입력 받은 수가 두 번쨰 입력 받은 수의 배수가 맞는지 확인
 */
//alt + shift + j
public void method2() {
   //Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	// 변수명은 규칙만 맞으면 아무거나 해도 됨
	
	System.out.print("첫 번쩨 수 입력 : ");
	int input1 = scanner.nextInt();
	
	System.out.println("두 번째 수 입력 : ");
	int input2 =scanner.nextInt();
	
	boolean isTrue = input1 % input2 ==0;
	
    System.out.printf("%d는 %d의 배수가 맞는가? %b", input1, input2, isTrue);
	//Run으로 가서 기능 실행
    
	
  }



/**
 * 입력 받은 정수가 짝수인지 홀수인지 판별
 * 
 * <pre>
 * 	정수 입력 : {입력값}
 *  {입력값}은 짝수/홀수 입니다
 * </pre>
 */

public void method3() {
	
	//스캐너 객체 생성
	Scanner sc = new Scanner(System.in);
	//ctrl +sc -> Scanner 자동 완성
	System.out.println("정수 입력 :");
	int input = sc.nextInt();
	
	// 삼항 연산자 : 조선식 ? 참 : 거짓;
	
	boolean isTrue = input % 2 ==0;
	String result = isTrue ? "짝수":"홀수";
	
	// String result = input %2 ==0 ? "짝수" : "홀수";
	// String result = (input %2 ==0) ? "짝수" : "홀수";
	
	System.out.printf("%d은/는 %s 입니다.", input, result);
	
  }

/*
 * <p>입력 받은 정수가 홀수 또는 짝수 또는 0 인지 판별</p>
 * 
 * <pre> 정수 입력 : 0 0 입니다 -------------------- 정수 입력 : 4 짝수 입니다
 * -------------------- 정수 입력 : 7 홀수 입니다 </pre>
 * 
 */
public void method4() {

  Scanner sc =new Scanner(System.in);
  System.out.println("정수 입력 : ");
  int input = sc.nextInt();
  
  String result = input ==0? "0" : (input %2==0? "짝수" : "홀수");
  
  System.out.println(result + "입니다"); 
  
	
	
 }
}
