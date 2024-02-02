package edu.kh.oop.field.pack3;

public class Korean {
 
 /*필드*/
//static이 붙은 필드는 프로그램 실행 시 
//static 메모리 영역에 할당된다
//이미 할당되어서 따로 할당 안해도 쓸 수 있음	

/* static 필드 앞에 public을 작성하는 이유 
 * -> 어디서든지 누구든지 공유할 수 있도록하는게 목적이기 때문에
 * */
 public static int nationalCode =82;// 국가 코드
 
 //static+final ->절대로 변하면 안되는 것
 public final static String ANCESTOR ="단군 할아버지";
 // static과 final의 순서는 중요하지 않음
 private String name;// 이름
 private String id; // 주민등록번호
 
 
 /* 메서드(기능)*/
 						//전달 받아온 값 세팅
  public void setName(String name) {// private라 간접 접근
	  //매개 변수로 전달 받은 name을 
	  // 현재 객체의 name 필드에 대입하겠다는 코드
  }
  //전달 받아온 값 세팅
  public void setId(String id) {// private라 간접 접근
	  //매개 변수로 전달 받은 id를 
	  // 현재 객체의 id 필드에 대입하겠다는 코드
  }
  
  //-> 이제 외부에서 얻어갈 수 있게 해보자
  // 얻어갈 꺼라서 // 영상 복습하기
  //반환형 void :반환하는게 없다
  //반환형 String :메서드 종료 시 String 객체를 반환
  public String getName() {
     return name;
  }
  public String getId() {
	  return id;
  }
}
