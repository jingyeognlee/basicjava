package E_OOP;

public class PrintCall {

	
	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;
	
	//1.메서드 명 add
	//매개변수 int 1개
	//매개변수와 a1의 합계를 반환하는 메서드를 만드세요
	
	int add(int a){
		int result = a+a1;
		return result;
	}
	
	//2.메서드명 add
	//매개변수 long 하나
	//매개변수와 a2의 합을 반환하는 메서드
	long add(long a){
		long result = a+a2;
		return result;
	}
	
	//3.메서드명 add
	//메개변수 int 두개
	//매개변수 두개와 a1,b1의 합계를 반환하는 메서드
	
	long add(int a, int b){
		long result = a+b+a1+b1;
		return result;
	}
	//4.메서드명 add
	//매개변수 int 하나 long하나
	//매개변수 두개의 합을 반환하는 메서드
	long add(int a, long b){
		long result = a+b;
		return result;
	}
	
	//5.메서드명 add
	//매개변수 int두개
	//매개변수 두개와 b2의 합을 반환하는 메서드
//	long add(int a, int b){
//		int result = a+b+b2;
//		return result;
//	} //이게 안되는 이유는 3번에 메서드 명도 같고, 매개변수 int타입과 갯수가 똑같아서 안되는것, 반환타입은 의미없음

	
	
	
}
