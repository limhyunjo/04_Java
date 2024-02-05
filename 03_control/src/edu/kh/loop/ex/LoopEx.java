package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {
	
	//필드 (객체의 속성 ==객체의 변수 선언하는 곳)
	// java.util.Scanner이라는 패키지에 따로 존재
	
	
	// Scanner 객체 생성
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 1~10까지 출력하기
	 */
	public void method1() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	// alt+shift +j
	/** 
	 * 첫 번째 입력 받은 수 부터
	 * 두 번째 입력 받은 수 까지
	 * 1씩 증가하며 출력하기
	 */
	public void method2() {
		System.out.println("입력 (1 2) :");
		int input1 = sc.nextInt();//첫 번째 입력
		int input2 = sc.nextInt();//두 번째 입력
		// 첫 번째 입력에 1 입력하고 엔터하면 끝난거로 인식하고 
		//다음 input에 들어간다
		
		for(int i=input1; i<=input2 ; i++) {
			System.out.println(i);
		}
		
	}
	

	/**
	 * 10부터 1까지 1씩 감소
	 */
	public void method3() {
		for( int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 두 수를 입력 받아서 반복 출력하는 구문을 작성
	 * 
	 * (첫 번째 입력을 A, 두 번째 입력 B)
	 * 
	 * 조건 1: B가 A보다 큰 경우 ->A~B까지 1씩 증가하며 출력
	 * 
	 * 조건 2: A가 B보다 큰 경우 ->A~B까지 1씩 감소하며 출력
	 * 
	 * 조건 3: A와 B가 같은 경우 ->"같은 수 입력됨" 출력
	 * 
	 */
	public void method4() {
		
		System.out.println("입력(1 2) :");
		// 변수에서 대문자는 상수라서 소문자로 써줌
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    if(a == b) { // 조건 3
			System.out.println("같은 수 입력됨");
			return; // 현재 메서드 종료 후 호출한 곳으로 돌아감
		}
		
	    
		if(b > a) { // 조건 1
			for(int i = a ; i <= b ; i++) {
				System.out.println(i);
			}
			
		} else { // 조건 2
			for(int i = a ; i >= b ; i--) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
    /**
     * 두 수를 입력 받아 1씩 증가하며 반복 출력하기
     * 
     * (첫 번째 입력 A, 두 번째 입력 B)
     * 
     * -입력 받은 두 수 중
     * 작은 값이 초기식, 큰 값이 조건식에 사용되게 작성
     * (같은 경우 초기식 A, 조건식 B)
     * 
     */
    public void method5() {
		System.out.println("a,b :");
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		 
		 if(a<=b) {
			 for(int i=a; i<=b; i++) {
				 System.out.println(i);
			     }
			 
		     }else{
			  for(int i=b; i<=a; i++) {
					 System.out.println(i);
			      }
		    }
		}//-----
    
    
    /**
     * 두 수를 비교해서 최대, 최소값 구하기
     */
    public void method5a(){
    	System.out.println(" a, b :");
    	int a= sc.nextInt();
		int b= sc.nextInt();
		
		int min;//최소
		int max;//최대
		
		if(a<=b) {//먼저 입력한 수가 작거나 같다면
			min=a;
			max=b;
			
		}else {
			min=b;
			max=a;
		}
		for(int i=min ; i<=max ; i++) System.out.println(i);
    	
    }
    
    
    /**
     * 최대, 최소값 구하기 V2(Math)
     * -Java API를 이용한 방법으로 자바 프로그램에서 미리 만들어준 기능 사용
     */
    public void method5b() {
    	System.out.println(" a, b :");
    	int a= sc.nextInt();
		int b= sc.nextInt();
		
		int min = Math.min(a, b);// 두 수중 작은 값을 반환
		int max = Math.max(a, b);// 두 수중 큰 값을 반환
		
		for(int i=min; i<=max; i++) System.out.println(i);
    }
    
    /**
     * 변수 값 교환(swap)// 이걸 가장 많이 씀
     */
    public void method5c() {
    	System.out.println(" a, b :");
    	int a= sc.nextInt();
		int b= sc.nextInt();
		
		if(a>b) {// 앞의 수가 크면  a와 b의 갑이 바뀐다
			int temp = a;// temp라는 외부 상자를 만들어서 값을 교환
			a=b;
			b= temp;
		}		

		for(int i=a; i<=b; i++) System.out.println(i);
    }
    
    /**
     * 1부터 100사이 7의 배수의 개수 세기
     */
    public void method6() {
    	System.out.println("7의 배수 :");
    	
    	int count =0;
    	for(int i=1; i<100; i++) {
    		if(i%7==0) count++;// i가 7의 배수인 경우 count 1증가
    	}
    	System.out.println(count);
    }
    
    
    public void method6a() {// 잘 알아두기
    	System.out.println("7의 배수 :");
    	
    	int count =0;
    	for(int i=7; i<100; i+=7) count++;
    	// i가 7의 배수인 경우 count 1증가
    	
    	System.out.println(count);
    }
   
    
    /**
     * 1부터 100사이 정수 중
     * 3의 배수의 개수
     * 3의 배수를 제외한 수 들의 합 출력
     */
    public void method7() {// 잘 알아두기
    	
    	int count =0;
    	int sum =0;
    	for(int i=1 ; i<=100 ; i++) {
    		
			if(i % 3 == 0) count++; 
			else sum += i;
		}
		
		System.out.println("count : " + count);
		System.out.println("sum : " + sum);
	

    }
    
    
    /**
     * 구구단 5단 출력하기
     * 5x1=5
     * 5x2=10
     * 5x3=15
     * ...
     * 5x9=45
     * 
     */
    public void method8(){// 다시 해보기
    	
    		
    	
        for(int i=1; i<=9; i++ ) {
        	System.out.printf("5 x %d = %2d \n", i,  5 * i );
         
        }
    }
    
    
    
    
}
	
	

	