package E_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		
		MyMath.add();  //클래스 호출 클래스명.
		MyMath d = new MyMath(); //인스턴스화를 해줘야하고
		d.add2(3); //인자값 메서드 그 자체 (반환이 되지 않음)
		
		MyMath.add3(3, 5.6f);
		
		
		d.add4(3, 4, 'a');
		
		int result = MyMath.add5(7);
		System.out.println(result);
		
		int result2 = d.add6(3, 7);
		System.out.println(result2);
		
		long result3 = d.multiply(3000, 300000000);
		System.out.println(result3);
		 
   		float result4 = d.divide(532, 6);
		System.out.println(result4);
		
		
		
		
		
	}
}





class MyMath{
	
	static int number = 50; //클래스 변수
	
	static void add(){ //void는 반환타입이 없음
		System.out.println(number * 2);
	}
	
	
	void add2(int a){ //매개변수 = ( ) 안  
		System.out.println(number * a);
	}
	
	
	//----------------------------------------
	//클래스 메서드명 add3 , int 타입의 매개변수 2개를 곱한다 반환값 x
	static void add3(int a, float b){
		System.out.println(a*b);
	}
	
	//인스턴스 반환값이 없고 메서드명 add4 int타입 두개와 char 타입 한개의 매개변수 3개를 모두 더하라
	void add4(int c, int d, char e){
		System.out.println(c+d+e);
	}
	//3,4,a ,,, 72
	
	
	//클래스 메서드명은 add5
	//매개변수는 int 하나
	//수행내용은 매개변수와 전역변수 number(클래스)의 합을 반환
	
	static int add5(int a){
		int result =a+number;
		return result;
	}
	//-----------------------------------------------------
	//메서드명 add6
	//매개변수 int 두개
	//앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
	int add6(int a, int b){
		int result2 = a-b;
		return result2;
	}
	
	int add7(int a, int b){
		int result = a+b;
		return result;
	}
	
	//인스턴스메서드 multiply
	//int 값 두개
	//두개를 곱해서 반환해주세요
	//단,overflow를 고려해주세요
	 long multiply(int a, int b){
		 long result=(long)a*b;
		return result;
	}
	 
	 //인스턴스 메서드 divide
	 //int 값 두개
	 //앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	 //단, 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
	float divide(int a, int b){
		 float result = (float)(int)((float) a / b * 100+0.5)/100;
		 return result;
	 }
	//result4*100
	 
	
	//1.윗쪽을 기준으로해서 첫번째 그리기 jvm 그리기 인자값 매개변수 메서드가 시작할 때 생기니까 지역변수임(매개변수가 지역변수임) 
	//2.윗부분 전체 삭제하기 (주석도 ㅇㅋ) 무한용 계산기를 만들기..... break 걸기
	//실제 계산기 만들기
}