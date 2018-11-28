package F_OOP2;

public class InnerEx01 {
	
	//인스턴스 클래스
	class InstanceInner{
		int iv = 100; //인스턴스 변수를 사용할 수 있다 하지만 
//		static int cv = iv; //클래스 변수는 사용불가
		final static int CONST = 200; //상수는 어딜가나 사용할 수 있음
	}
	
	
	//스태틱 클래스
	static class StaticClass{
		static int cv = 500;
		int iv = 200;
	}
	
	
	static void method(){
		//지역클래스는 static이 붙을 수 없다class LocalClass{
		class LocalClass{
		int iv = 200;
//		static int cv = 500; //사용불가
		}
	}
	
	
}


