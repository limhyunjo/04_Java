package edu.kh.oop.method;

public class StudentRun {
  
	public static void main(String[] args) {
		
	//생성된 StudentService /객체를 1회성으로 사용 .displayMenu()
		// 1회성이어도 do while 구문이어서 무한 반복함
		new StudentService().displayMenu();//새 객체 생성
		// 보통 주소를 참조형 변수에 넣지만 한번만 쓸 때 는 위처럼 함
	}
}
