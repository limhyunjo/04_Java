package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	//필드
 Scanner sc = new Scanner(System.in);
 
	/**
	 * 실습 문제1
	 */
	public void practice1() {
		//길이가 9인 배열을 선언 및 할당하고,
		int[] arr= new int[9];
		int sum = 0;
		System.out.println("짝수 번째 인덱스 합 :");
		// 1부터 9까지의 값을 반복문을 이용하여
	    // 순서대로 배열의 각 인덱스 요소에 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] =i+1;
			//
			if(i%2==1) {
				sum+=arr[i];
			}
			
			
		}
		System.out.print(sum);
	}
	
	
	/**
	 * 실습 문제2
	 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
     *순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
     *홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	 */
	public void practice2() {

		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 8; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			//
			if (i % 2 == 1) {
				sum += arr[i];
			}

		}
		System.out.println();
		System.out.println("홀수 번째 인덱스 합 :" + sum);
	}
}

