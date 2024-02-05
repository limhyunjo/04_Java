package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {

  //필드 ( 객체의 속성 == 객체가 가지고 있는 값 / 변수)
	// ->클래스 바로 아래에 만드는 변수가 필드
	
	// ctrl+ space 로 자동완성 하면 위에 import가 바로 생김
	Scanner sc = new Scanner(System.in);
  /**
 * 나이를 입력 받아
 * 19세 이상은 성인, 미만은 "성인이 아닙니다"
 */
public void method1() {
	  System.out.print("나이 입력 :");
	  int age =sc.nextInt();
	  
	  if(age>= 19) {
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
	
	 System.out.print( "나이 :");
	 int age= sc.nextInt();
	 
	 String result;// 결과를 저장하기 위한 문자열 변수 선언 result 값들이 저장됨ㄴ
	 
	 if(age <= 13) 	 result = "어린이";
	else if(age <= 18) result = "청소년";
	else 	 result = "성인";
		
		System.out.println(result);
	 
	//일반 if 문
	// if(age<=13) {
	//	 System.out.println("어린이");
	// }else if (age > 13 && age <= 18) {
	//	 System.out.println("청소년");
	// }else {
	//	 System.out.println("성인");
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
	 System.out.println("월 :");
	 
	 int month =sc.nextInt();
	 String result;
	 
		if(month >= 3 && month <= 5) result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else if(month == 12 || month == 1 || month == 2) result = "겨울";
		else result ="잘못 입력";
				System.out.println(result);
				
		
		//순서 바꿔서 생각
		//if(month < 1 || month > 12)  result = "잘못 입력";
		//else if(month >= 3 && month <= 5) 	result = "봄";
		//else if(month >= 6 && month <= 8) 	result = "여름";
		//else if(month >= 9 && month <= 11) 	result = "가을";
		//else result = "겨울";
  }
  
  //유지 보수하기 좋은 코드
  
   /**
 * 잘못된 경우에 메서드를 중간에 종료
 */
public void method3b() {
		System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return; // 메서드를 종료하고 호출한 곳으로 돌아감
		}
		
		String result;
		if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result);
   
   }

    public void method3c() {
	System.out.print("달(월) 입력 : ");
	int month = sc.nextInt();
	
	String result;
	
	switch(month) {
//	case 3:  case 4: case 5: result="봄"; break;
	case 3, 4, 5: result="봄"; break;
	case 6, 7, 8: result="여름"; break;
	case 9, 10, 11: result="가을"; break;
	case 12, 1, 2: result="겨울"; break;
	default : result = "잘못 입력";
   }

   System.out.println(result);
   }
   
   /**P/F 판별하기
    * 
    * 중간고사, 기말고사, 과제 점수를 입력 받아
    * 총점 60점 이상일 경우 PASS, 아니면  Fail
    * -중간고사(40%), 기말고사(50%), 과제(10%)
    * -각각 100점 만점
    * 
    * +pass인 경우
    * 90점 이상 :A
    * 80점 이상 :B
    * 70점 이상 :C
    * 60점 이상 :D
    * 
 * 
 */
   public void method4() {
	   System.out.print("중간고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int report = sc.nextInt();
		
		// 비율이 적용된 점수들의 합
		double total = (mid * 0.4) + (fin * 0.5) + (report * 0.1);
		
	   
		//변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		//해결1) 모든 경우에 변수에 값을 대입
		//해결2) 변수 선언 시 특정한 값으로 초기화 진행
		//		-> 숫자는 0
		//         string은 null/""
		// 		   boolean은 false
		//		   이외의 객체는 null
	  // String result = null;// 변수 선언-> 비어있는 공간
	   String result = "";
		
		if(total >= 60) {
			//result = "PASS";
			//if문 써도 되고 switch문 써도 됨
			
			//switch문 매개변수로는 정수, 문자열, 문자만 가능
			// switch문에서는 객체나 실수, boolean 안됨
			switch((int)(total/10)) {
			
			case 10: case 9: result ="A";break;
			case 8: result ="B";break;
			case 7: result ="C";break;
			case 6: result ="D";break;
			}
			
		}
		else 						result = "FAIL";
		
		System.out.println(result);
	  
	   
  }
   
  /**<pre>
   * 
   * 국어,영어, 수학, 사탐, 과탐 점수를 입력 받아
   * 40점 미만 과목이 있으면 FAIL
   * 평균이 60점 미만인 경우도 FAIL
   * 
   * 모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
   * 
   * [출력 예시]
   * 
   * 1) 40점 미만 과목이 존재하는 경우
   * FAIL [40점 미만 과목이 : 국어 영어 ]
   * 
   * 2) 평균 60점 미만인 경우
   * 
   * FAIL[점수 : 50.4(평균 미달)]
   * 
   * 3) PASS[ 점수 : 83.4/100]
 * </pre>
 */
public void method5() {
	 
	System.out.println("국어 :");
	int Kor =sc.nextInt();
	
	System.out.println("영어 :");
	int Eng =sc.nextInt();
			
	System.out.println("수학 :");
	int Math =sc.nextInt();
	
	System.out.println("사탐 :");
	int Soc =sc.nextInt();
	
	System.out.println("과탐 :");
	int Sci =sc.nextInt();
	
	double total = (Kor + Eng + Math + Soc + Sci)/5;
	
	String result;
	
	if(total<60) { 
		
		result="(FAIL[점수 : " + total +" (평균 미달)]";
	
	    
	 
	
	 }else result="(PASS[점수 : " + total +" /100]";
	
			System.out.println(result);
	
	 
	
 }
    // 강사님 풀이
    public void method6() {
	System.out.print("점수 입력(국어 영어 수학 사회 과학) : ");
	int kor = sc.nextInt();
	int eng = sc.nextInt();
	int mat = sc.nextInt();
	int soc = sc.nextInt();
	int sci = sc.nextInt();
	
	//true : 40점 미만이 있을 경우
	//flase  : 40점 미만이 없는 경우
	boolean flag = false;//자신만의 신호체계를 만들어 사용
	String result = "";
	
	if(kor < 40) { result += "국어 "; flag = true; }
	if(eng < 40) { result += "영어 "; flag = true; }
	if(mat < 40) { result += "수학 "; flag = true; }
	if(soc < 40) { result += "사회 "; flag = true; }
	if(sci < 40) { result += "과학 "; flag = true; }
	
	if(flag) {
		System.out.printf("FAIL [40점 미만 과목 : %s] \n", result);
		return;
	}
	
	int sum = kor + mat + eng + soc + sci;
	double avg = sum / 5.0;
	
	if(avg < 60.0) {
		System.out.printf("FAIL [점수 : %.1f (평균 미달)] \n", avg);
		return; //-> false인 경우 아래가 실행
	}
	
	System.out.printf("PASS [점수 : %.1f / 100] \n", avg);
}


}
