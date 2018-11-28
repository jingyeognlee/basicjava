package homework_06;

class MyMathTest {		//MyMathTest 클래스 생성
	public static void main(String[] args) {//main 생성
		MyMath mm = new MyMath();//MyMath라는 클래스에서 mm이라는 지역변수를 생성하고 인스턴스화하시오
		long result1 = mm.add(5L, 3L); //참조변수 mm으로부터 add메서드를 호출하고, result1에 저장하시오 (result는 long타입)
		long result2 = mm.subtract(5L, 3L);//참조변수 mm으로부터 substract메서드를 호출하고, result2에 저장하시오 (result는 long타입)
		long result3 = mm.multiply(5L, 3L);//참조변수 mm으로부터 multiply메서드를 호출하고, result3에 저장하시오 (result는 long타입)	
		double result4 = mm.divide(5L, 3L);//참조변수 mm으로부터 divide메서드를 호출하고, result4에 저장하시오 (result는 double타입)
			
		System.out.println("add(5L, 3L) = " + result1);		
		System.out.println("substract(5L, 3L) =" +result2);
		System.out.println("multiply(5L, 3L) =" +result3);
		System.out.println("divide(5L, 3L) =" +result4);		
			
	}
}




class MyMath{//MyMath 클래스 생성
		long add(long a, long b){
			long result = a+b;
			return result;
		}//리턴값이 있는 add메서드 생성(매개타입 long타입 두개), 매개변수 2개의 합
		
	
		long subtract(long a, long b){
			long result = a-b;
			return result;
		}//리턴값이 있는 subtract 메서드 생성(매개타입 long타입 두개), 매개변수 2개의 차
			
		long multiply(long a, long b){
			long result = a*b;
			return result;
		}//리턴값이 있는 multiply 메서드 생성(매개타입 long타입 두개), 매개변수 2개의 곱
			
		double divide(double a, double b){
			double result = a/b;
			return result;
		}//리턴값이 있는 divide 메서드 생성(매개타입 double타입 두개), 매개변수 2개의 나눗셈
	
	
}
