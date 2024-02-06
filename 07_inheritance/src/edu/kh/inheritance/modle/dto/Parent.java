package edu.kh.inheritance.modle.dto;

public class Parent /* extends Object */ {
	
//Object 클래스
//-모든 클래스의 최상위 부모(super)
//-class 선언부에 상속 구문이 하나도 작성되지 않으면
// 컴파일러가 extends Object 구문을 추가해준다!
  
	public String lastName ="홍"; //성
	protected String address = "서울 중구 남대문로 120";//주소
	//같은 패키지와 상속까지 가능
	private int money = 100_000_000; // 1억
	private String car = "그랜져"; // 차
	
	//기본 생성자
	public Parent(){
		System.out.println("기본 생성자로 부모 객체 생성됨");
	}
	
	//매개 변수 생성자
	public Parent(String lastName, String address, int money, String car) {
		
		this.lastName =lastName;
		this.address =address;
		this.money =money;
		this.car = car;
		
		System.out.println("매개 변수 생성자로 부모 객체 생성됨");
	}
	
	//money의 getter/setter
	//외부로 얻어갈 수 있게 getter
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money= money;
	}
	
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	// 현재 객체의 필드를 문자열로 반환하는 메서드
	public String inform() {
		return String.format("%s/%s/%d/%s", lastName, address, money, car);
	}
	
	
	//공통된 규약(코드) 추가/수정
	public void testMethod() {
		System.out.println("부모에게 메서드 추가함");
		
	}
	
	/* Overriding (오버라이딩) : 위에 올라탐 
	 * 부모 메서드(코드) 위에 자식 메서드가 올라탐
	 *  == 부모 메서드를 자식이 덮어 씌움
	 *  == 재정의 */
	
	//Over : 위에 있다, 넘어서다
	//riding : 타다
	// super 참조 변수 확인 하기
	public String introduce() {
		return "Parent 입니다";
		
	}
	
	// 반환명 클래스명.메서드명()
	
	//String Object.toString()
	//-객체의 필드를 문자열로 표현하기 위해서 사용하는 메서드
	//-Object에 정의된 toString()을 오버라이딩해서 사용
	
	 @Override
	 public String toString() {
	  return String.format("Parent.toString() : %s / %s / %d / %s", lastName, address, money, car);
	
	
  }
}
