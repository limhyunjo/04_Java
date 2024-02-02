package edu.kh.oop.field.pack1;

public class FieldRun1 {
 public static void main(String[] args) {
	// FieldTest1 객체 생성
	 FieldTest1 f1 = new FieldTest1();// 객체 생성
	 
	 System.out.println(f1.pubilcValue);// 어디서든 접근 가능
	 System.out.println(f1.protectedValue);// 같은 패키지 안이라 가능
	 System.out.println(f1.defaultValue);//같은 패키지 안이라 가능
	 
	 //private은 접근 불가 
	 // 다른 클래스에서 접근 불가
	// System.out.println(f1.privateValue);// 오류
}
}
