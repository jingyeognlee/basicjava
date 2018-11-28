package C_sentence;

import java.util.Scanner;

public class Sentence_06 {
	public static void main(String[] args) {
	/*
	 1.do-while
	   -while문의 변형으로 기본구조는 while과 비슷하다.
	   -무조건 한번 이상 수행해야할 때
	   -최소 1회는 블럭{}을 수행한다.
	   -구조
	   do{
	   		수행될 문장;
	   }while(조건식);
	   
	 */
		
		int i = 0;
		int sum = 0;
		do{
			i++;
			sum += i;
		}while(sum<100);
		
		//1.문자를 입력받는다.
		
		//2.문자를 출력한다.
		
		//3.문자에 "x"를 입력하면 종료한다.
		
		Scanner sc1 = new Scanner(System.in);
		String str = null;
		do{
			System.out.println("문자를 입력해주세요");
			str = sc1.next();
			System.out.println(str);
		}while(!str.equals("x"));
		
		
		/*
		 2.continue
		 -반복문 내에서만 사용 가능하다
		 -반복문의 끝으로 이동하여 다음 반복문으로 넘어간다
		 -for문은 증감식으로 이동
		 while문은 조건식으로 이동
		 
		 */
		for ( int i1 = 0; i1 < 11; i1++) {
			if(i1%2==1){
				System.out.println(i1);
			}
		}
			System.out.println("=========================");
		for (int i2 = 0; i2 < 11; i2++) {
			if(i2%2==0){
				continue;
			}
			System.out.println(i2);
			}
		
		
		int aa = 1;
		int sum3 = 0;
		while(true){
			sum+=aa;
			if(sum3 >= 100){
				break;
			}
			aa++;
		}
		System.out.println(aa);
		
		System.out.println("구구단");
		for (int i = 2; i < 10; i++) {
				
			}
	}
}
