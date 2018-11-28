package E_OOP;

public class IniTest {
	public static void main(String[] args) {
		System.out.println(Init.action); //0 => 55
										//명시적 초기화 => 클래스초기화 블럭
		Init it = new Init(); //15 => 20 
							// 명시적 초기화=> 인스턴스초기화 블럭 => 생성자를 이용한 초기화
		
		System.out.println(it.action2); //20
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



class Init{
	
	static int action;
	int action2 = 15; // 명시적 초기화
	int action3;
	
	Init(){ //기본 생성자
		action2 = 20;
	}
	
	static { //클래스 초기화 블럭
		//많은 수식
		action = 55; //을 통해 얻은값 =밑에값
	} //이 초기화 블럭은 heap도, method
	
	
	{
		//많은 수식
		action2 = 100;
	}
	{
		action2 = 150;
	}
	}
	
}