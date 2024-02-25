package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {

	//필드
	Scanner sc = new Scanner(System.in);
	//위에 import가 없으면 Scanner만 썼을 때 에러남
	
	/*
	 * 배열 (자료 구조) 
	 * 
	 * Java에서의 배열
	 * ->같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 
	 * - 생성된 배열의 요소는 index를 이용해서 구분
	 * 
	 * - 생성된 배열을 활용하기 위해서는
	 *   배열을 참조하는 "참조형 변수"를 이용한다
	 *   
	 *   [참조형 변수]
	 *   -주소를 저장하는 변수
	 *   -변수 사용 시 저장된 주소로 찾아가서 
	 *    그곳의 배열, 객체를 참조한다
	 *    
	 * - 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수이다
	 * 
	 * 
	 */
	
	/*
	 * 배열 선언, 할당, 초기화
	 */
	public void method1() {
		
		//변수 선언
		int num;
		//Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고
		//그 변수의 이름을 "num"으로 지정
		
		//배열 선언
		int[]arr; //변수 이름이 arr 아직 참조하는게 없음
		//Stack 영역에 int[] 자료형을 참조할 변수를 생성 (주소 저장) 
		
		//배열 할당
		arr = new int [4];
		//Heap 영역에 int 4개짜리 배열을 할당하고
		//생성된 배열의 주소를 "arr" 변수에 대입
		//-> arr을 이용해서 배열을 참조할 수 있음
		
		//배열 초기화
		//1) 초기화 전 -> 0이 대입되어 있는지 확인
		System.out.println("초기화 전");
		// 코드 앞에 번호를 클릭하면 beakpoint가 눌려서 코드가 해석되기 전에 실행이 멈춘다
		
		//*debug : 프로그램 수행 중
		//        특정 시점에 어떤 값을 지니고 있는지 확인하는 것
		//        -> 코드 상태, 오류를 분석할 수 있음
		
		// 창 깨지면 자바 아이콘 누르고 reset하면 됨
		
		//2) 인덱스를 이용한 초기화
		arr[0]=100;
		arr[1]=4;
		arr[2]=12;
		arr[3]=1999;
		
		System.out.println("초기화 후");
	}
		/*이클립스 디버그 모드 사용 방법] 중요
		 * 
		 * 1) 확인하고 싶은 코드 다음 줄에 break point 추가
		 * 2) debug 모드로 실행 (벌레 아이콘 또는 F11)
		 * 3) debug 화면으로 switch
		 * 4) resume (F8) 를 눌러가며 순서대로 확인
		 */
		
		
		/*
		 * 정수 4개를 입력 받아 
		 * 배열에 차례대로 대입 후
		 * 결과를 디버그 모드로 확인
		 */
		public void method2() {
			
			int[] arr = new int[4];// 4칸 짜리 변수 배열 묶음
			//참조형 변수
		  
			//i=0, 1, 2, 3
			for(int i=0; i<arr.length; i++) {
				System.out.println(i+"번째 인덱스 :");
				
				arr[i]=sc.nextInt();//i번째 인덱스 요소에 입력 값 대입
			}
			
		// 해당 구문 수행 전 break point 를 작성해서 멈추게 함
			System.out.println("결과 확인");
		// 결과 확인에 찍으면 실행 중이고 값을 입력하면 보인다
		
		
	}
		
	
	/**
	 * 배열 선언과 동시에 초기화
	 */
	public void method3() {
		
	 //과목이 작성되어 있는 배열 생성
		String[]subjects = {"Java","HTML", "CSS", "JavaScript"};
		
	//subjects 변수가 참조하는 배열에 있는 모든 요소의 값을 역순으로 출력
		
	for(int i=3; i>=0; i--) {
		System.out.printf("subjects[%d] : %s \n", i , subjects[i]);
	}
		
	}
	
	
	/**
	 * 길이를 입력 받아
	 * 입력 받은 길이 만큼의 배열을 생성(할당) 한 후
	 * 모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
	 */
	public void method4() {
	
	 //길이를 입력 받아
		System.out.println("배열 길이 :");
		int len = sc.nextInt();
		
     //입력 받은 길이 만큼의 배열을 생성(할당) 한 후
		int[]randoms= new int[len]; // 입력하는 수(len) 만큼 길이 할당
		
    //모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
	for(int i=0; i<randoms.length;i++) { 
		randoms[i]=(int)(Math.random()*len);
		//double을 int로 강제 형변환
		//데이터 손실을 이용한 소수점 제거
		
		
	}
		//Arrays.toString(배열 참조 변수)
	   //-> 배열의 모든 요소를 [a,b,c] 형태 문자열로 변환
	 System.out.println(randoms);//주소(비슷한 거)
	 System.out.println(Arrays.toString(randoms));
		
		
		
	}
	
	
}
