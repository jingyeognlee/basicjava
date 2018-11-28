package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
	
		/*
		 1.while문
		   -반복횟수를 모를 때 사용한다
		   -조건식과 수행해야될 블럭{}으로 구성되어 있다.
		   -구조
		   while(조건식){
		 	}
		 */
		
		for(int i = 0; i < 11;i++){
			System.out.println(i);
		}
		
		int i=0;
		while(i <11){
			System.out.println(i);
			i++;
		}
		
		//1.3~33까지의 합계를 구하세요
//		int i1=3;
//		int i2=0;
//		while(i1<34){
//		i2+=i1;
//		}System.out.println(i2);
		
		//2.3~33까지의 짝수의 합계를 구하세요
//		int i3=3;
//		int i4=0;
//		
//		while(i3<34){
//		if(i4 % 2 == 0){
//			i4+=i3;
//			}
//			i3++;
//		}
//		System.out.println(i4);
	

		//2. for문으로 구구단을 출력해주세요
//		for(int a1=2; a1<10; a1++){
//			for(int a2=1; a2<10; a2++){
//				System.out.println(a1*a2);
//			}
//		}
		
		//3.2번의 for문을 while문으로 변경해주세요
	//	int a3=2;
	//	int a4=1;
	//	while(a3<10){
	//		while(a4<10){
		
		
		//4.짝수단의 홀수곱만 출력하세요
		int x =2;
		while(x <10){
			int y = 1;
			while(y<10){
				if(x%2==0 && y%2==1){
					System.out.println(x+"*"+y+"="+x*y);
				}
				y++;
			}
			x++;
		}

		
		//3.1~? 더했을 때 합계가 100 이상이 되는가?
		
//		int aa = 1;
//		int sum = 0;
//		while(sum < 100){
//			sum += aa;
//			aa++;
			
		int aa = 0;
		int sum = 0;
		while(sum < 100){
			aa++;
			sum += aa;
//			94041485
		
		}
		System.out.println(aa);
		
		//4.사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		//5.시작하는 숫자부터 끝나는 숫자중 5의 배수의 합계를 구하세요
		//단 while문을 이용하세요
		
		Scanner a7 = new Scanner(System.in);
		System.out.println("시작하는 숫자를 입력해주세요"); 
		int startNum = a7.nextInt(); //a8시작하는 숫자
		System.out.println("끝나는 숫자를 입력해주세요");
		int endNum = a7.nextInt(); //a9끝나는 숫자
		
		int sum2 =0;
		while(startNum < endNum+1){
			if(startNum%5==0){
			sum2 += startNum;
			startNum++;
			
		}
		
		System.out.println(sum2);
				
		
		
		
		
	}
	
}}