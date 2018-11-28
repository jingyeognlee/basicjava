package C_sentence;

import java.util.Scanner;

public class PRACTICE__2 {
	public static void main(String[] args) {
		
		for(;;){
	Scanner a1 = new Scanner(System.in);
	System.out.println("숫자를 입력해주세요.");
	int a2 = a1.nextInt();
	
	System.out.println("+,-,*,/ 를 입력해주세요 X 입력시 종료됩니다.");
	String a3 = a1.next();
	
	if(a3.equals("X")){
		break;
	} else {
		System.out.println("숫자를 입력해주세요.");
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
			break;
			}
		}	
	
	}
		
		str.length()
}
}