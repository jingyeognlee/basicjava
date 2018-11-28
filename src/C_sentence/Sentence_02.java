package C_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1.반복문 (for, while, do-while)
		  -어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
		  -반복문은 주어진 조건이 만족되는 동안 수행함으로 조건식을 포함한다.
		  -for문은 주로 반복횟수를 알고 있을 때, while문은 반복횟수를 모를 때 사용된다.
		  
		2.for문
		  -기본구조
		    for(초기화 ; 조건식 ; 증감식){
		    	수행될문장
		    }
		    초기 -> 조건식 -> 수행 -> 증감식
		      -> 조건식 -> 수행 -> 증감식
		      ---->
		*/
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		//초기화 : int i = 0
		//조건식 : i < 11
		//수행될 문장 : System.out.println(i);
		//증감식 : i++
		
		for (int i=0; i<11; i++){
			System.out.println(i);
		}
		
		for (int i2=0; i2<11; i2++){
			if(i2%2==1){
				System.out.println(i2);
			}
		}
		
		Scanner a1 = new Scanner (System.in);
		System.out.println("숫자를 입력해주세요");
		String a2 = a1.next();
		System.out.println(a2);
		
		int a3 = a1.nextInt();
		System.out.println(a3);
		
		
		
//		//1.사용자로부터 숫자를 입력받아서 0~입력받은 수까지 출력해주세요
		
		
		for(int i=0; i < a3+1; i++){
			System.out.println(i);
		}
		
		
		//1. 5~15까지의 합계를 구하세요.

//		sum += 5;
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
//		sum += 11;
//		sum += 12;
//		sum += 13;
//		sum += 14;
//		sum += 15;
		
		// 초기화 = 5
		// 조건식 = sum<16
		// 
//		int sum = 0;
//		for(int i=5; i<16; ++i) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		//2.6~사용자가 입력한 수까지의 홀수의 합을 구하시오
		

//		Scanner a1 = new Scanner (System.in);a
//		System.out.println("숫자를 입력해주세요");
//		String a2 = a1.next();
//		System.out.println(a2);
//		
//		int a3 = a1.nextInt();
//		System.out.println(a3);
		
		int b2 = 0;
		
		for(int b1=6; b1<a3+1;b1++){
			if(b1%2==1){
				b2+=b1;
			}
		}
		System.out.println("6부터" +a3+"까지의 홀수의 합은" +b2+"입니다");
		
		
		
	}
}
