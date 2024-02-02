package edu.kh.oop.field.constructor;

/*오버로딩 (Over Loading: 과정)
 * -한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 기법
 * 
 * -같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나 
 * 전달 받은 매개 변수에 따라 조금씩 동작이 달라야 하는 경우
 * 상황별로 정의
 * 
 * -오버로딩의 조건
 * 1) 메서드 이름은 똑같아야 한다
 * 2) 매개 변수는 개수, 타입, 순서가 하나라도 달라야 한다
 * 
 */
public class MemberRun {
 public static void main(String[] args) {
	
	 //회원 객체 생성
	 //->기본 생성자를 이용해서 
	Member member1 = new Member();
	
	//null == 참조하는 객체가 없다를 나타내는 값
	// 널       (저장된 주소가 없다 / 아무것도 참조하지 않고 있다)
	member1.inform();// 객체를 처음 생성하니 아무것도 없음
	
	//member1이 참조하는 Member 객체의 필드값을 세팅
	member1.setMemberId("member01");
	member1.setMemberPw("pass01");
	member1.setMemberName("김회원");
	member1.setMemberAge(27);
	
	//새로운 Member 객체 생성 후 필드 값 세팅
	Member member2 =new Member(); // 기본 생성자 이용
	
	member2.setMemberId("qwerasdf");
	member2.setMemberPw("1q2w3e4r");
	member2.setMemberName("최회원");
	member2.setMemberAge(30);
	
	System.out.println("[member1]");
	System.out.println("[member2]");
	
	//---------------------------------
	// 매개 변수 생성자를 이용해서 Member 객체 생성
	//->코드 길이 감소
	Member member3 = new Member("test3","pwpw3", "김테스트",20);
	System.out.println("[member3]");
	member3.inform();
	
	Member member4 = new Member("test4", "4444333", "김이박", 40);
	System.out.println("[member4]");
	member4.inform();
	
	
	//생성자도 메서드/ 보통 중복이 허용되지 않는데 오버로딩 떄문에 가능
	// ** 프로그래밍 언어에서 변수명, 함수명, 메서드명 중복 허용 X **
	
	//변수명 중복
	int a =10;
	//int a=20;
			
 }
 
    //메서드명 중복
    public void test() {}
    //public void test() {}
}
