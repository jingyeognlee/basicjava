package homework_06;

class CardTest{//CardTest 클래스 생성
	public static void main(String[] args) {//메인 생성
		System.out.println("Card.width="+Card.width);		//Card의 너비 출력
		System.out.println("Card.height="+Card.height);		//card의 높이 출력
										
		Card c1 = new Card();			//Card 클래스에서 c1 인스턴스화하기
		c1.kind = "Heart";				//카드종류 하트로 설정
		c1.number = 7;					//숫자 7로 바꾸기
										
		Card c2 = new Card();			//c2 인스턴스화
		c2.kind = "Spade";				//카드종류 스페이드로 설정
		c2.number = 4;								//숫자 4로 바꾸기
		
		
		System.out.println("c1은 "+ c1.kind+", "+c1.number+"이며, 크기는 (" + c1.width+", "+c1.height+")");
		System.out.println("c2은 "+ c2.kind+", "+c2.number+"이며, 크기는 (" + c2.width+", "+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;					//c1으로 호출하여 너비를 50으로 설정
		c1.height = 80;					//c1으로 호출하여 높이를 80으로 설정
		
		System.out.println("c1은 "+ c1.kind+", "+c1.number+"이며, 크기는 (" + c1.width+", "+c1.height+")");
		System.out.println("c2은 "+ c2.kind+", "+c2.number+"이며, 크기는 (" + c2.width+", "+c2.height+")");
		
		}
}
		
			//먼저 할것
class Card{								//카드 클래스 생성
	String kind;							//종류 인스턴스변수 생성
	int number;								//숫자 인스턴스변수 생성
	static int width = 100;							//클래스변수 너비를 100으로 생성
	static int height = 250;							//클래스 변수 높이를 250으로 생성

}
		