package edu.kh.op.run;

//import는 클래스 위에 써야함
import edu.kh.op.ex.OperatorEx;// OperatorEx 클래스 가져옴

/**
 * 실행용 클래스
 */
public class OperatorRun {
    // 메인 메서드
 public static void main (String[]args) {
  OperatorEx ex= new OperatorEx();// 가져온 클래스를 이용해 객체 생성
  
  // console 창에 (다른 클래스에 작성된 기능)이 가져와진다
  // ex.test();
  //ex.method1(); // 3의 배수 확인
	
	//콘솔창에 아래처럼 뜸
	// ex.test();
	//ex.method1(); // 3의 배수 확인
	
	//ex.method2();
	
	//ex.method3();
    
    ex.method4();
	
	
 }
}
