package edu.kh.poly.pack3.model.dto;

// Interface : 접점 (클래스간의 접점을 만드는 용도)


public interface Machine {

 //인터페이스는 상수형 필드(public static final)만 작성 가능!
//-> 작성하는 모든 필드가 public static final
//->public static final구문을 명시적으로 작성하지 않아도
//  묵시적으로 public static final로 인식된다!	
// == 눈에 보이게 안써도 자동으로 적용됨
	
  //public static final int VOLT =220;
  int VOLT = 220; // 위처럼 안써도 interface에서는 똑같이 인식됨
 
 // 인터페이스는 추상 메서드(public abstract)만 작성 가능!!!
  //->public abstract 생략 가능
  
  public abstract void powerOn();
  void powerOff();
 
  
 
}
