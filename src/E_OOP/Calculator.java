package E_OOP;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
	Calcul cc = new Calcul();
	cc.cycle();
	
	






		
		
		
		
	}
}


class Calcul{
	

//메서드명 plus
//매개변수 int 두개
//앞에서 받은 값에서 뒤에 받은 값을 더한 결과를 반환하는 메서드를 만드세요
int plus(int a, int b){
	int result = a + b;
	return result;
}


//메서드명 minus
//매개변수 int 두개
//앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
int minus(int a, int b){
	int result= a-b;
	return result;
}

//인스턴스메서드 multiply
//int 값 두개
//두개를 곱해서 반환해주세요
//단,overflow를 고려해주세요
long multiply(int a, int b){
	long result = (long)a*b;
	return result;
}

 //인스턴스 메서드 divide
 //int 값 두개
 //앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
 //단, 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
float divide(int a, int b){
	float result = (int)((float)a/b*100+0.5f)/100f;
	return result;
}	
void cycle(){
	
	for(;;){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int a1 = sc.nextInt();
		
		System.out.println("사칙연산(+,-,*,/)을 입력하세요. X를 입력하면 종료됩니다");
		String a2 = sc.next();
		
	
		if(a2.equals("X")){
		break;
		}else {
		System.out.println("숫자를 입력하세요 ");
		int a3 = sc.nextInt();
			
		switch(a2){
			case "+":
				System.out.println(plus(a1,a3));
				break;
			case "-":
				System.out.println(minus(a1,a3));
				break;
			case "*":
				System.out.println(multiply(a1,a3));
				break;
			case "/":
				System.out.println(divide(a1,a3));
		} 		
		}
	}
		
	
	
	
	}
	
	
}