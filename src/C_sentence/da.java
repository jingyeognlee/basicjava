package C_sentence;

import java.util.Arrays;
import java.util.Scanner;

public class da{

	public static void main(String[] args) {
	
		for(;;){
			
		Scanner a1 = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int a2 = a1.nextInt();
		System.out.println(a2);
		
		
		System.out.println("사칙연산(+,-,*,/)을 입력하세요. X를 입력하면 종료됩니다");
		String a3 = a1.next();
		
		
		if(a3.equals("X")){
			break;
		}else {
		System.out.println("숫자를 입력하세요 ");
		int a4 = a1.nextInt();
			switch(a3){
		case "+":
			System.out.println(a2+a4);
			break;
		case "-":
			System.out.println(a2-a4);
			break;
		case "*":
			System.out.println(a2*a4);
			break;
		case "/":
			System.out.println(a2/a4);
				} 	
			}
		}
			
		
//	
//System.out.println(Arrays.toString(iarr));
		
		
		
//		int[] lotto = new int[45];
//		for(int i=0; i < lotto.length; i++ ){
//			lotto[i] = i + 1;
//		}
//		int temp = 0;
//		int j = 0;
//		
//		for(int i=0; i < 6; i++){
//			j = (int)(Math.random()*45);
//					temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
		}
		    
//		for(int i = 0; i<lotto.length; i++){
//			System.out.printf("lotto[%d]=%d%n", i, ball[i]);
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	




