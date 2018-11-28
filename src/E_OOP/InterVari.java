package E_OOP;

import sun.applet.Main;

class Data{
	int x;
	
	Data(){
		
	}
}

public class InterVari {

	public static void main(String[] args) {
		//1.Data의 객체를 만들어주세요 d1
		Data d1 = new Data(); //데이터 클래스에 d1이라는 참조변수를 이용하여 인스턴스화를 시켜서 인스턴스를 만들어서 대입
		//2.d1의 x값을 10으로 변경해주세요
		d1.x = 10;
		//3.출력 =>main() 기본형 : d1의 x값
		System.out.println("main() 기본형 : "+d1.x);
		//4.change(d1의x값) <--change 메서드 호출하기
		InterVari a = new InterVari(); // 참조변수 a가 
		a.change(d1.x);
		//4.5 출력 =>main() 기본형 : d1의 x값
		System.out.println("after main() 기본형 :"+d1.x);
		
		
		
		//5.Data의 객체를 만들어주세요 d2
		Data d2 = new Data();
		//6.d2의 x값을 10으로 변경해주세요
		d2.x = 10;
		//7.출력 => main() 참조형 : d2의 x값
		System.out.println("main() 참조형 :"+d2.x);
		//8.change(d2)
		a.change(d2);
		//8.5.출력 => main() 참조형 : d2의 x값
		System.out.println("after main() 참조형 :"+d2.x);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	void change(int x){
		x = 1000;
		System.out.println("change() 기본형 :" +x);
		
	}
	
	void change(Data d1){
		d1.x = 1000;
		System.out.println("change() 참조형 :"+d1.x);
	}
	
	
}
