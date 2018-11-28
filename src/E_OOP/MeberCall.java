package E_OOP;

import com.sun.java.util.jar.pack.Package.Class.Member;

public class MeberCall {

	
	int iv = 10;
	static int cv = 100; //클래스변수
 	
	int iv2 = iv;
	
	int iv3 = cv; //인스턴스화 할 때 클래스변수가 있어서 넣을 수 있음
	
	static int cv2 = cv; // 로드가 되려면 클래스 친구가 호출됐을 때 인스턴스화됐을 떄
						//클래스 친구만 로드시키려면 클래스만 불렀어야함 cv2와 cv는 동시에 로드가 되어서 호출할 수 있다.
	
//	static int cv3 = iv;
	
	static void method(){
		cv = 500;
		//iv = 500; //이 클래스가 로드되서 불러지는 시점에는 인스턴스가 없어서 부를 수 없다
	}
	
	void method2(){
		cv = 1000;
		iv = 1000; //인스턴스화가 되서 부를 수 있음
	}
	
	static void method3(){
		method();
//		method2();
	}
	
	void method4(){
		method();
		method2();
	}
	
}
