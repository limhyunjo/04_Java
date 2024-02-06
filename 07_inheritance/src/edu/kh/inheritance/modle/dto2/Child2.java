package edu.kh.inheritance.modle.dto2;

import edu.kh.inheritance.modle.dto.Parent;

public class Child2 extends Parent {
	//다른 패키지에서 가져오기 때문에 import 해야함
	//public과 protected 사용 가능
	
	private String smartPhone;
	
	public Child2() {
		super();
		//super생성자 미 작성 시 컴파일러가 
		//자동으로 super구문을 추가해준다
		// 상속 받았으면 부모 구문을 만들어야 하니까...
		
		System.out.println("Child2 기본 생성자");
		
	}
	
	//매개 변수 생성자 (부모 필드 + 자식 필드)
	// 부모랑 자식 동시에 다른 변수로 초기화
	
	public Child2(String lastName, String address, int money,
			String car, String smartPhone) {
		//전달 받은 매개 변수 5개 중 4개는 
		//Child2 내부에 생성된 Parent에 초기화 되어야 되는 값
		//->Parent의 매개 변수 생성자 호출
		super(lastName, address, money, car);
		//4개 초기화 시킴
		this.smartPhone = smartPhone;
		// 자식 것도 초기화 시킴
		System.out.println("Child2 매개 변수 생성자로 객체 생성");
		
	}
    // alt + s + r 누르면 getter/ setter 자동완성
	public String getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	public String informChild2() {
	// return String.format("%s / %s / %d / %s / %s", 
		//  lastName, address, getMoney(), getCar(), smartPhone);
	 //부모에서 inform에 앞의 4개를 썼던 것에서 맨 뒤만 smartPhone으로 바꿈
	 // 코드 중복
		
		// 부모 메서드 inform + 자식 필드 내용
		// 중복되는 코드를 제거해서 코드 길이를 감소 시킴
		//== 코드의 재사용성 증가
		return inform()+ "/" + smartPhone;
	}
	
	//부모로부터 상속 받은 introduce() 메서드
	//오버라이딩(재정의)하기
	//+오버라이딩 코드를 잘 작성하고 있는 지
	//컴파일러한테 검사해달라고 하기 ( @Override )
	//( @ == Annotation (어노테이션))
	
	@Override 
	public /*int*/String introduce() {
	 // The return type is incompatible with Parent.introduce()
     //-> 반환형을 int로 쓰니까 부모 코드랑 다르다고 오류 발생
	
	 // super. : 부모 부분 참조 변수/ super 참조 변수
		return "Child2 입니다 +" + super.introduce();
		// Child2로 재정의한 게 나오게 됨 
	}
	
	//toString()오버라이딩
	@Override
	public String toString() {
		return super.toString()+"\nChild2 :"+smartPhone;
	}
   
}
