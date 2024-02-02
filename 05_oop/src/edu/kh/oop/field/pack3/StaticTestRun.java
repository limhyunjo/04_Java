package edu.kh.oop.field.pack3;

public class StaticTestRun {
  public static void main(String[] args) {
	
	  //Korean 객체 생성
	  Korean k1 = new Korean();
	  Korean k2 = new Korean();
	  
	  //static 잘 보이는 곳에 써놓고 계속 붙여놓음
	  //서로 다른 객체 k1, k2 
	  //처음에 실행을 할 때 컴파일러가 모든걸 번역하고 static 영역을 먼저 채우고 시작
	  //자료형 Korean , 참조변수 k1, k2
	  //객체 안에 nationalCode와 name, id, getter, setter 생긴다
	  //메모리가 할당되면 주소가 생김 0x숫자
	  //Heap영역에 nationalCode에는 static의 주소가 들어간다
	  //== static의 주소가 nationalCode객체 안에 들어가서 참조된다
	  //k1.k2 두개의 참조변수가 static 메모리 영역의 주소를 공유한다
	  //static도 변경 가능하다
	  System.out.println("k1의 nationalCode"+ k1.nationalCode);
	  System.out.println("k2의 nationalCode"+ k2.nationalCode);
	  
	  //k1의 nationalCode82
	  //k2의 nationalCode82
	  
	  //k1을 이용해서 nationalCode 변경
	  k1.nationalCode=1;
	  
	  System.out.println("------nationalCode 변경 후--------");
	  
	  System.out.println("k1의 nationalCode"+ k1.nationalCode);
	  System.out.println("k2의 nationalCode"+ k2.nationalCode);
	  
	  //------nationalCode 변경 후--------
	 // k1의 nationalCode1
	 // k2의 nationalCode1

     // 왜 nationalCode에 경고(노란줄)가 발생하는가?
	 //The static field Korean.nationalCode
     //should be accessed in a static way
	 // 정적인 방법으로 엑세스 해야한다
	 // ->static 필드는 static 방법으로 접근해야한다
	 // == k1.nationalCode 처럼 객체의 필드명/메서드명으로
	 // 부르지 말고 
	 // static 영역에 할당된 이름으로 불러라
	 // 한 객체의 독립된 필드로 인식될 수 있기 때문에(사실은 공유되는 필드인데)
	  //헷갈리지 않게 정해져있는 이름으로만 부르자
	  
	  System.out.println("Korean.nationalCode :" +Korean.nationalCode);
	  // 이렇게 써야 경고가 안뜨는 좋은 방법
	  //자동완성에 떠 있는 s= static
	  //Korean.nationalCode :1
	  
	  System.out.println("우리의 조상님 :"+ Korean.ANCESTOR);
	  //static final 대표적 예시 :
	  //-Math.PI
	  //-Integer.MAX_VALUE /Integer.MIN_VALUE
	  
	  System.out.println(Math.PI); //3.141592653589793
	  //ctrl+클릭해보면 static final인 것을 확인 가능
	  System.out.println(Integer.MAX_VALUE);//int 최대값 2147483647
	  System.out.println(Integer.MIN_VALUE);//int 최소값 -2147483648
 }
}
