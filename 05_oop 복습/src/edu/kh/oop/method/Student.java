package edu.kh.oop.method;

public class Student {
  
	//필드
	
	public static String SchoolName="kh대학교";
	
	public static final int MIN_VALUE =0;   //스킬 역량 최소치
	public static final int MAX_VALUE =100; //스킬 역량 최대치
	//프라이빗 -> 간접 접근하도록 게터 세터 만들어야 함
	private String name;         //이름
	private String studentNumber;//학번
	private char gender;         //성별
	private int java;			 //java실력
	private int html;            //html실력
	//생성자
	//생성자는 반환값이 없고 클래스명과 똑같이 지어야 함
	public Student() {} //기본 생성자
	
	//매개 변수 생성자(오버 로딩)
	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
	
	} 
	
	
	//메서드
	
	//setter 전달 받은 매개 변수를 현재 객체의 필드에 대입
	/* this() 생성자 */
	//현재 클래스에 있는 다른 생성자를 호출
	public void setName(String name) {
		this.name = name;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public void setHhtml(int html) {
		this.html = html;
	}
	// getter : 현재 객체의 필드를 외부에서 얻어갈 수 있게 반환
     public String getName() {
			return name;
		} 
     public String getStudentNumber() {
    	 return studentNumber;
     }
     public char getGender() {
    	 return gender;
     }
     public int getJava() {
    	 return java;
     }
     public int getHtml() {
    	 return html;
     }
}

	
	
	
	
	
}
