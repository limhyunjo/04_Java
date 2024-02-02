package edu.kh.oop.cls.pack2;

import edu.kh.oop.basic.Account;
import edu.kh.oop.basic.Nation;

//ClassTest1과 다른 패키지에 존재하는 클래스
public class OtherClassTestRun {
  public static void main(String[] args) {
	
	  //1.public class인 Nation과 Account클래스를 이용해서 객체 생성
	  Nation n1= new Nation();
	  Account a1= new Account();
	  //->문제 없음 (import도 잘됨)
	  
	  
	  // 2. (default) class인 ClassTest1클래스를 이용해 객체 생성
	  //ClassTest1 = new ClassTest1();
	  //-> 다른 패키지에 존재하기 때문에 import 불가능 외부 접근이 막혔다
	  //-> (default) 접근 제한자는 다른 패키지에서 접근 불가
 }
}
