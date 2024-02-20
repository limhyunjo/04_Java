package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 10회만 반복하며 List에 과일 이름을 추가하고, 
 * 반복이 종료되면 List에 저장된 모든 과일을 출력하는 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다.
 * 요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법)을 작성하시오.
 *
 * 요구 사항
 * 1. 같은 이름의 과일이 List에 존재하지 않을 때만 추가
 * 2. 같은 이름의 과일이 존재하면 "OOO - 삭제" List에서 제거
 * 3. 10회가 반복되지 않았어도 "END" 입력 시 "입력 종료"가 출력 되면서 반복 종료
 * 
 */
public class Supplement1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> fruitsList = new ArrayList<String>();//null이라고 되어있음 참조하는 객체가 없음
		// List객체 생성 자식 객체 Arraylist 생성
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.print(i+"번째 과일 입력 : ");
			String input = sc.next();
			
			if(input.equals("END")) { //비교연산자는 기본 자료형만 가능 나머지는 .equals
				System.out.println("입력 종료"); //종료 if문의 순서 문제
			 //END를 검사하는 구문이 추가 구문 아래에 있어서 추가 구문을 먼저 검사한다
				break;
			}
			
			if(!fruitsList.contains(input)) {
				//contains 포함하다
				fruitsList.add(input);
				continue;
				// continue 수행시 뒤에 있으면 바로 다음 반복으로 넘어감 그럼 add코드가 실행 안됨
				// 순서 바꿈
			}
			
			
			
			int index = fruitsList.indexOf(input); 
			//indexOf() index를 찾아서 반환하는 코드
			fruitsList.remove(index);
			System.out.println(input + " - 삭제");
		}
		
		
		System.out.println("-----------------------");
		for(int i=0 ; i<fruitsList.size() ; i++) {//fruitsList.length란 이름의 변수가 없음
			//List는 collection 배열이고 length가 아닌 size 사용 length -> size()
			System.out.println(fruitsList.get(i));// 
		}
		
	}
}
