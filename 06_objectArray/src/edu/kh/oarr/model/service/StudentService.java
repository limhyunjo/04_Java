package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

// Service 클래스 : 기능 제공 클래스
// -> 입력, 출력 빼고 나머지
// ex) 로직(if, for)을 이용한 데이터 가공, 저장

public class StudentService {

	// 필드
	private Student[] students = new Student[10];
	// 학생 객체 참조 변수 10개 묶음인 Student[] 생성(할당)하고
	// 그 주소를 students 참조 변수에 대입
	
	
	// 기본 생성자 ( 클래스명과 같고 매개 변수가 없음
	public StudentService() {
		
		// 학생 객체 배열 (students)에 샘플 학생 3명 추가
		
		// students    의 자료형 : Student[] 
		// students[0] 의 자료형 : Student
		
		students[0] = new Student("24001", "최미영", 'F');
		students[1] = new Student("24002", "홍길동", 'M');
		students[2] = new Student("24003", "신짱구", 'M');
				
		// students[3~9] == null
		
		
		// 자바에서 제공하는 난수 생성 객체
		Random random = new Random();
		
		// 샘플 학생 점수 초기화
		for(int i=0 ; i<students.length ; i++) { // 10바퀴
			
			// i번째 인덱스에 참조하는 학생이 없으면 반복 종료
			if(students[i] == null) break;
			
			// random.nextInt(101) : 0 이상 101 미만 정수형 난수 생성
			
			students[i].setHtml( random.nextInt(101) );
			students[i].setCss( random.nextInt(101) );
			students[i].setJs( random.nextInt(101) );
			students[i].setJava( random.nextInt(101) );
			
		}
		
	}
	
	
	/** 전달 받은 학생 객체(주소/ 참조변수) 를
	 * studens 객체 배열에서
	 * 빈칸 (null인 칸)에 대입
	 * 
	 * @param newStd : 전달 받은 학생
	 * @return 대입 성공 시 true, 실패 시 (==꽉 찼을 때)false
	 */
	public boolean addStudent(Student newStd) {
		// students 배열의 인덱스 요소 중
		// 맨 처음 null인 부분을 찾아 newStd 대입
		
		for(int i=0; i< students.length; i++) {
			if(students[i]==null) {
				students[i]=newStd;
				
				return true;
						
			}
		}
		
		return false;
	}
	
	
	/** 학생 객체 배열(students) 참조 주소 반환
	 * @return students (주소)
	 */
	public Student[] getStudents() {
		return students;
	}
	
	
	/** 학생 1명 정보 조회 (index 검색)
	 * @param index
	 * @return 조회된 학생 또는 null
	 */
	public Student selectIndex(int index) {
		
	// java.lang.ArrayIndexOutOfBoundsException:
	//  Index 20 out of bounds for length 10
	// -> 배열 인덱스 범위 초과 (0부터 배열길이 -1까지)
		
	  if( index<0|| index>= students.length) {
		  return null;
	  }
		return students[index];
	}
	
	/**이름이 일치하는 학생 조회
	 * @param name : 입력 받은 이름
	 * @return 일치하는 학생 정보 또는 null
	 */
	public Student selectName(String name) {
		
		// students 객체 배열을 순차 접근 하여
		// null이 아니면서 학생 이름이 name과 일치하는 학생 찾아 return
		
		/****향상된 for문****/
		//for( 변수 : 배열 || 컬렉션)
		// - 배열 또는 컬렉션의 요소를 처음부터 끝까지 
		//  순차 접근하는 for문
		
		//- 매 반복 마다 배열 || 컬렉션 요소를 
		// 하나씩 꺼내와 변수에 저장
		
		for( Student s :students ) {
			if(s==null) { // 저장된 학생이 없을 경우
				break;
			}
			
			if(s.getName().equals(name)) {// 현재 접근한 학생이 이름이 name과 같은지 확인
				return s;
			}
		}
			
		return null;
	}
	
	
	
	/**학생 점수 조회
	 * @param index
	 * @return 학생 점수가 기록된 문자열
	 */
	public String selectScore(int index ) {
	   // HTML (50) CSS (80) JS(100) Java(30)
		      
		  //   합계 : 260
		 //     평균 : 65.0
		     
		 //   문자열로 받아와 반환 출력	
	  // 배열에서 학생 점수 꺼내오기
		int html = students[index].getHtml();// 점수 얻어와서 짧게 쓰려고 변수에 저장
		int css = students[index].getCss();// 
		int js = students[index].getJs();// 
		int java = students[index].getJava();
		
		int sum = html +css+ js+ java; //합계
        double avg = sum / 4.0; // 평균
		
		String result
			= String.format("HTML(%d) CSS(%d) JS(%d) Java(%d)",html,css,js,java );
		
		result += "\n 합계 :"+sum;
		result += "\n 평균 :"+avg;
		
		
		return result;
	}
	
	/**평균 최고점/ 최저점 구하기
	 * @return 최고점 : 홍길동 (98.3)
	 *          최저점 : 신짱구 (45.7)
	 */
	public String selectMaxMin() {
		
		Student maxStudent =null;//최고점 학생
		Student minStudent =null;//최저점 학생
		
		double maxAvg = 0.0; //평균 최고점
		double minAvg = 0.0; // 평균 최저점
		
		//향상된 for문
		for(Student s : students) {// 배열에서 객체를 하나씩 꺼내서 왼쪽의 변수에 저장한다
			if(s==null)break;//학생이 없으면 반복 종료
			
			int sum= s.getHtml()+s.getCss()+s.getJs()+s.getJava();
			double avg = sum/ 4.0;
			
			if(maxAvg==0) {// 아직 아무 값이 세팅이 안된 첫 번째 바퀴
				maxStudent =s;
				minStudent =s;
				maxAvg =avg;
				minAvg =avg;
				continue; // 첫 번째 바퀴면 이렇게 하겠다
			}
			
			if (maxAvg< avg) {//기존 최대값보다 현재 평균이 더 큰 경우
				maxAvg =avg;
				maxStudent =s;
			}
			if (minAvg> avg) {//기존 최소값보다 현재 평균이 더 작은 경우
				minAvg =avg;
				maxStudent =s;
			}
			
			
			
		}
		
		return String.format("최고점 : %s(%.1f)\n"
				+" 최저점 : %s(%.1f)\n"
				, maxStudent.getName(), maxAvg, minStudent.getName(), minAvg);
	}
	
}



