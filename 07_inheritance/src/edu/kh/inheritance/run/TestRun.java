package edu.kh.inheritance.run;

import edu.kh.inheritance.modle.dto.Child1;
import edu.kh.inheritance.modle.dto.Parent;
import edu.kh.inheritance.modle.dto2.Child2;

public class TestRun {
 
	public static void main(String[] args) {
		
	//부모 객체 Parent 생성
	Parent p1 = new Parent();// 기본 생성자
	Parent p2 = new Parent("김","서울시 어딘가", 2000,"G80");
		
	System.out.println("-------------------------------------");
	Child1 c1 = new Child1(); // 자식1 기본 생성자	
		
	// 실행하면 아래처럼 뜬다
	//기본 생성자로 부모 객체 생성됨 ->왜 이것도 같이 뜰까? 두개의 생성자 실행
	// 상속 시 자식 객체 내부에 자식과 부모 객체 2개가 생성됨
	// but 자식 객체만 사용해도 자식과 부모 둘 다 다룰 수 있다
	//Child1 기본 생성자로 생성
	
     //Child1 자식의 기능 (상속 활용 코드1)
	 c1.setComputer("삼성 갤럭시 북4");
	 
	 //child1 내부에 생성된 Parent의 기능 호출 가능
	 String str1 = c1.inform();// 부모의 코드
	 System.out.println("str1 : " + str1); //부모의 것을 자기 것처럼 씀
	
	 //Child1 자식의 기능 (상속 활용 코드2)
	 String str2 = c1.informChild1();
	 System.out.println("str2 :" + str2);
	 //자식의 기능이지만 부모 코드 사용중 
	 // 자식의 것이 추가됨 +삼성 갤럭시 북4
	 //str1 : 홍/서울 중구 남대문로 120/100000000/그랜져
	 //str2 :홍/서울 중구 남대문로 120/100000000/그랜져/삼성 갤럭시 북4
 
	 //Child1매개 변수 생성자를 이용해서 객체 생성
	 Child1 c2 = new Child1("2024 LC GRAM");
	 //자식 내부에 생성된 부모 객체로 작성됨
	 String str3 = c2.informChild1();
	 // 자식으로 부모 객체 이용하기
	 System.out.println("str3:"+str3);
	 
	 System.out.println("-----------------------------");
	 
	 //Child2 객체 생성(매개 변수 생성자 이용)
	 Child2 c3  //자동완성으로 써야 import됨 
	 =new Child2("최", "서울시 강남구", 999_999_999, "벤츠", "아이폰15");
	 
	 String str4 =c3.informChild2();
		 System.out.println("str4 :"+str4);
		 
		 
	 System.out.println("===================================");	 
	 System.out.println("===================================");	 
	 System.out.println("===================================");	
	 
	 System.out.println("\n[상속을 이용해서 공통된 규약 설정하기]\n");
	 //Parent - Child1
	 //       ㄴ Child2
	 
	 //Parent를 상속받은 Child1/2는 서로 비슷한 모양을 띄게 된다
	 //(같은 부모를 상속 받았으니까 but 형제는 아님
	 
	 //Parent에 코드를 추가하면 어떻게 될까?
	 
	 Child1 ch1 = new Child1();
	 Child2 ch2 = new Child2();
	 
	 ch1.testMethod();
	 ch2.testMethod(); 
	 // 부모에 코드 추가/수정 하면 모든 자식한테도 코드가 추가/수정된다
	 // 코드의 길이를 극단적으로 줄여줌
	 // 상속의 상속의... 계속 물려줄 수 있음
	 
	 
	 //오버라이딩 확인하기
	 System.out.println("----오버라이딩----");
	 System.out.println(ch1.introduce()); //자식이 재정의
	 System.out.println(ch2.introduce()); //부모로부터 물려받음

	 System.out.println("----toString() 오버라이딩()------");
	 
	 System.out.println(p1.toString());
	 System.out.println(ch1.toString());
	 System.out.println(ch2.toString());
	 
	 //오버라이딩 전
	//edu.kh.inheritance.modle.dto.Parent@67b64c45
	//edu.kh.inheritance.modle.dto.Child1@4411d970
	//edu.kh.inheritance.modle.dto.Child1@6442b0a6

	 
	// Parent 오버라이딩
	 //-> 오버라이딩된 Parent의 toString()을 Child1/2가 상속 받음
   //Parent.toString() : 홍 / 서울시 중구 남대문로 120 / 100000000 / 그랜져
   //Parent.toString() : 홍 / 서울시 중구 남대문로 120 / 100000000 / 그랜져
   //Parent.toString() : 홍 / 서울시 중구 남대문로 120 / 100000000 / 그랜져
	
	 
	} 
   
}
