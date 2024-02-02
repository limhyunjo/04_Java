package edu.kh.oop.field.pack2;

import edu.kh.oop.field.pack1.FieldTest1;
												
//다른 패키지 클래스          //상속 구문 extends FieldTest1
public class FieldRun2 extends FieldTest1{
  public static void main(String[] args) {
	//FieldTest1가 부모 FieldRun2가 자식이 됨
	  
	  //FieldTest1 객체 생성
	  FieldTest1 f1 = new FieldTest1();
	  // 다른 패키지는 다른 나라와 같아서 import를 꼭 해줘야 함
	  
	  System.out.println(f1.pubilcValue);//어디서든 접근 가능
	  //System.out.println(f1.protectedValue);//같은 패키지 + 상속 
	  //System.out.println(f1.defaultValue);//같은 패키지 
	  //System.out.println(f1.privateValue);//같은 클래스
 }
  
  public void method1() {
	  
	  //다른 패키지이지만 상속 상태이기 때문에 
	  //protected 접근 제한자를 작성한 필드에 접근 가능하다
	  System.out.println(protectedValue);
	  // 상속받은 것을 사용할 때는 부모로부터 코드를 받은것이 때문에 그대로 씀
  }
}
