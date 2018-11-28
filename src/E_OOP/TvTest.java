package E_OOP;

public class TvTest {
	public static void main(String[] args) {
		//클래스변수 호출방법
		//클래스명.변수명
		//메인이 레시피를 호출해야한다 인스턴스는 인스턴화 했을 때 만 부를수있고 클래스는 아니어도 가져올수있다
	String color1 = Tv.color; //클래스 명. <-- 이렇게해서 클래스 호출 기본값으로 호출된다
	System.out.println(color1);
	Tv.color = "MAGENTA";
	System.out.println(Tv.color);
	
	Tv.changColor(); 
	System.out.println(Tv.color);
		
	
	//인스턴스 친구들 호출하기
	//TV 클래스의 인스턴스 생성
	Tv t = new Tv(); //new는 인스턴스화 t에게 새로운 방을 줌 // tv타입의 참조변수 t, main() 를 기준으로 했을 때 지역변수 t
	//t 가 참조형변수, 참조변수라고 함 (주소를 저장함)
	//클래스명칭 똑같이 쓰고 ()만 붙임 tv에다가 저장한다 t.했을 때 s가 안붙는 이유는 인스턴스라 안붙음 밑에 쭉 내리면 메써드있음 
	
	//참조변수명.변수명
	//1. t주소의 power를 출력해주세요 //t방에 있는 power나 channel들을 꺼내줌
	System.out.println(t.power);
	//2. t주소의 power 메서드를 호출해주세요
	t.power();
	//3.t주소의 power을 출력해주세요
	System.out.println(t.power);
	//4.t주소의 채널을 16번으로 변경해주세요
	t.channel=16;
	//5. t주소의 channelUp 메서드를 호출해주세요
	t.channelUp();
	//6.t주소의 채널을 출력해주세요
	System.out.println(t.channel);
	}
}

class Tv{
	//전역변수
	//클래스변수
	static String color; //
	//인스턴스변수
	boolean power; //전원
	int channel; //채널
	
	//클래스메서드
	static void changColor(){
		color = "green";
	}
	//인스턴스메서드
	void channelUp(){
		channel++;
	}
	
	void power(){
		power = !power;
	}
	
	
	
//컴파일을 하면 파일이 쪼개진다
//
//위에있는것은 밑에있는 것을
//인스턴스화(불러오기)를 해야 안다
}