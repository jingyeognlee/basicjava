package E_OOP;

public class MyMathTest2 {
	public static void main(String[] args) {
		
		MyMath2.add(); //class 호출하기
		
		MyMath2 lucky = new MyMath2(); // 인스턴스화
		lucky.add2(3); // 가 참조변수
		
		lucky.add3(3, 5);
		
		lucky.add4(3, 4, 'a');
		
		int result=lucky.add5(7); //result는 main()의 지역변수임
		System.out.println(result);
		
		int result1=lucky.plus(65, 2);
		System.out.println(result1);
				
		
		int result2=lucky.minus(73, 3);
		System.out.println(result2);
		
		long result3=lucky.multiply(3000, 300000000);
		System.out.println(result3);
		
		float result4=lucky.divide(310, 11);
		System.out.println(result4);
		
	}
}



class MyMath2 {
	static int number = 50;
	
	static void add(){
		System.out.println(number * 2);
	}
	
	void add2(int a){
		System.out.println(number * a);
	}
	
	//
	
	// 반환값 x 클래스 메서드명 add3 , int 타입의 매개변수 2개를 곱한다 
	static void add3(int a, int b){
		System.out.println(a*b);
	}
	
	//인스턴스 반환값이 없고 메서드명 add4 int타입 두개와 char 타입 한개의 매개변수 3개를 모두 더하라
	void add4(int a, int b, char c){
		System.out.println(a+b+c);
	}
	
	
	//클래스 메서드명은 add5
	//매개변수는 int 하나
	//수행내용은 매개변수와 전역변수 number(클래스)의 합을 반환
	static int add5 (int a){
		int result = a + number;
		return result;
	}
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
	
	
	
	
}