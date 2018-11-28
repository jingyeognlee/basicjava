package E_OOP;

public class CardTest {
	public static void main(String[] args) {
		
	
		
		//1.Card 클래스의 너비를 출력하세요
		System.out.println(Card.width);
		//2.Card 클래스의 높이를 출력하세요
		System.out.println(Card.height);
		//3.Card 클래스의 객체를 만들어주세요 변수명 : cd1
		Card cd1 = new Card();
		//4.cd1의 문양을 SPADE로 변경해주세요
		cd1.kind = "spade";
		//5.cd1의 숫자를 7로 변경해주세요
		cd1.number=7;
		//6.Card 클래스의 객체를 만들어주세요 변수명 : cd2
		Card cd2 = new Card();
		//7.cd2의 문양을 heart로 변경해주세요
		cd2.kind = "heart";
		//8.cd2의 숫자를 3으로 변경해주세요
		cd2.number = 3;
		//9.아래와 같이 출력해주세요
		// cd1의 모양: spade 숫자 : 너비 :  높이 :
		// cd2의 모양: spade 숫자 : 너비 :  높이 :
		System.out.println("cd1의 모양:"+ cd1.kind +"\t숫자:"+cd1.number+ "\t너비:"+cd1.width+"\t높이:"+cd1.height);
		System.out.println("cd2의 모양:"+ cd2.kind +"\t숫자:"+cd2.number+ "\t너비:"+cd2.width+"\t높이:"+cd2.height);
		
		//10.cd1의 너비를 50으로 변경해주세요
		cd1.width = 50;
		//11.cd1의 높이를 80으로 변경해주세요
		cd1.height = 80;
		//12.아래와 같이 출력해주세요
		// cd1의 모양: spade 숫자 : 너비 :  높이 :
		// cd2의 모양: spade 숫자 : 너비 :  높이 :
		
		System.out.println("cd1의 모양:"+ cd1.kind +"\t숫자:"+cd1.number+ "\t너비:"+cd1.width+"\t높이:"+cd1.height);
		System.out.println("cd2의 모양:"+ cd2.kind +"\t숫자:"+cd2.number+ "\t너비:"+cd2.width+"\t높이:"+cd2.height);
		
		
		
		
		
		
		
	}
}

class Card{
	
	//인스턴스변수
	String kind;
	int number;
	
	//클래스변수 
	static int width = 100;
	static int height = 250;
	
	
	void method(){
		int v = 3; //지역변수
	}
	
	
	static void method2(){ //클래스()
		
	}
	
	
	
	
	
}