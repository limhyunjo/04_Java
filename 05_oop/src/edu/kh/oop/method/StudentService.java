package edu.kh.oop.method;

import java.util.Scanner;

//기능 제공 클래스
public class StudentService {
            // 이 클래스의StudentService 객체가 생성되었을 때 
	        //아래 scanner 객체도 같이 생성된다
	//필드
	private Scanner sc= new Scanner(System.in);
	//(System.in)키보드 내용을 입력 받을 scanner 객체 생성
	
	/**
	 * 메인 메뉴 화면
	 */
	public void displayMenu() {
	 int input=0;//scanner로 입력받은 메뉴 번호를 저장할 변수
	 
	 //학생 객체를 참조할 참조형 변수 2개 선언;
	 //null : 참조하는 객체가 없다
	 //변수를 만들었는데 안에 아직 객체가 없음
	 Student std1 = null;
	 Student std2 = null;
	 
	 //do~while : 최소 1회 이상 반복 
	 do { 
		 System.out.println("""

======학생 관리 프로그램======
1.학생 등록
2.학생 정보 확인
3.학생 이름 수정
4.Java 공부하기
5.HTML 공부하기	 	
6.Java 역량 비교하기
7.HTML 역량 비교하기
0.프로그램 종료
		 		""");//-> 0이 입력 될 때 까지 무한 반복
		 
		 System.out.print("메뉴 선택 >>");
		 input =sc.nextInt();
				 
		  switch(input) {
		   
		  case 1: 
			  //누구를 등록할 지
		 System.out.print("학생을 등록할 변수를 선택(1:std1/ 2:std2 :");
		 int select =sc.nextInt();
		 
		 if(select ==1) std1= createStudent(); //1번에게 대입
		 else            std2= createStudent(); //2번에게 대입
		
			  break;
		  case 2: 
			 System.out.print("정보를 조회할 학생 선택(1:std1/ 2:std2 :");
			
			 String text =null; //학생 정보가 담긴 문자열을 저장할 변수
			
		if(sc.nextInt()==1) text = studentInform(std1);//std1은 참조변수
		else                  text = studentInform(std2);
			  
		System.out.println(text);//반환된 결과 출력
			 break;
		  case 3:
			  System.out.print("이름을 수정할 학생 선택(1:std1/ 2:std2 :");
			  
			  if(sc.nextInt()==1) updateStudentName(std1);
			  else                updateStudentName(std2);
			  
			  
			  break;
		  case 4:
			  System.out.print("Java 역량을 수정할 학생 선택(1:std1/ 2:std2 :");
			 // if(sc.nextInt()==1) updateJava(std1);
			 // else                updateHTML(std2);
			  break;
		  case 5:
			  System.out.print("HTML 역량을 수정할 학생 선택(1:std1/ 2:std2 :");
			 
			  
			  break;
		  case 6: break;
		  case 7: break;
		  case 0: System.out.println("===== 프로그램 종료====="); break;
		  default :
		  }
		  
	   }while(input !=0 );// input이 0이 아닐 때 반복

	}
	
	/**학생 정보를 입력받아 생성된 Student 객체를 반환
	 * @return 생성된 Student 객체 주소
	 */
	private Student createStudent() {
		
		System.out.print("이름 :");
		String name =sc.next();
				
		System.out.print("학번 :");
		String StudentNumber =sc.next();
		
		System.out.print("성별(남/여) :");
		char gender =sc.next().charAt(0);
		//sc.next()로 입력 받은 문자열 중
		//0 번 인덱스 번째 문자 하나를 반환 받아 gender 변수에 저장
		//""가 ''로 바뀌면서 한 글자만 저장
		
		//Student 자동완성으로 Student주소 반환
		return new Student(name, StudentNumber, gender);
		// Student 객체를 생성한 후 그 주소를 호출한 곳으로 반환
		//-> case1번에서 호출함 1번에서 하면 std1에 대입
		
		//return null;//아직 반환할 주소가 없어서 임시로 null
	}
	
	/**매개 변수로 전달 받은 학생 (객체의 주소) 정보를 문자열로 만들어서 반환
	 * @param s : std1 또는 std2 (학생 객체 참조 주소)
	 * @return 학생 정보가 작성된 문자열
	 */
	private String studentInform(Student s) {
		
	  //클래스 이름 쓴거면 아래 String.format("", 변수) static이라는 소리
	  //String.format("", 변수)
	  //-패턴 모양의 문자열을 반환하는 String 메서드
	  // printf는 모양 그대로 출력해줌
		                              //java /html
		//KH대학교 / 123123/ 남/ 홍길동 /0/0
		return String.format("%s / %s / %c / %s / %d / %d",
				Student.SchoolName, s.getStudentNumber(),
				s.getGender(), s.getName(), s.getJava(), s.getHtml());
		//만들어진 문자열을 return 해줌
	}
	
	 /**매개 변수로 전달 받은 학생 객체의 이름 수정
	 * @param s : std1 또는 std2(학생 객체 주소)
	 */
	private void updateStudentName(Student s) {
		 System.out.print("수정할 학생 이름 :");
		 String newName =sc.next();
		 
		 String beforeName =s.getName(); //이전 이름
		 s.setName(beforeName); //새 이름 세팅
		 //학생 이름이 수정되었습니다
		 // 홍길동-> 홍길길
		 
		 System.out.print("학생 이름이 수정 되었습니다");
		 System.out.printf("%s -> %s \n", beforeName, newName);
		 
		 
		 /** Java역량이 얼마나 증가 또는 감소했는지 정수로 입력 받고
		  * 학생의 Java 역량을 수정
		  * 단, 수정된 Java 역량은 최대값, 최소값 범위를 넘어가지 못하게 함
		  * 
		  * ex) Java 역량이 120인 경우 100(최대값)
		  *     Java 역량이 -30인 경우 100(최소값) 
		 * @param s
		 */
		//private void updateJava(Student s) {
			 
		 
			
			//결과 출력
			//Java 역량 수정 완료
			//70->80 (10)
		// }
		
		//private void updateHTML(Student s) {
			
			
			
			// [결과 출력 예시]
			// Java 역량 수정 완료 
			// 70 -> 80  (10)
			
			// [결과 출력 예시]
			// Java 역량 수정 완료 
			// 70 -> 30  (-40)
			
			// [결과 출력 예시]
			// Java 역량 수정 완료 
			// 50 -> 100  (100)        // 최대 값 범위 초과 X
			
			
			// [결과 출력 예시]
			// Java 역량 수정 완료 
			// 50 -> 0  (-100)          //최소 값 범위 초과 X
		
		 
	   // }
		 
		 
 }
	
}	

