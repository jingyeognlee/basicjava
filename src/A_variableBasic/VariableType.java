package A_variableBasic;

public class VariableType {
	public static void main(String[] args) {
		/*
		 변수의 타입
		 
		 1.기본형 타입(primitive type)
		 -boolean, char, byte, short, int, long, float, double
		 
		 2.참조형 타입(reference type)-
		 -주소를 저장한다.(4byte)
		 
		 3.종류
		 -논리형 : true와 false만을 값으로 갖는다. 조건식과 논리적계산에 많이 사용 ex)boolean 
		 -문자형 : 문자를 하나 저장하는데 사용된다. ex)char
		 -정수형 : 정수값을 저장하는데에 사용된다. ex)byte, short, int, long
		 -실수형 : 실수값을 저장하는데에 사용된다. ex)float, double
		 
		4.크기 (1byte = 8bit)
		-1byte : boolean, byte
		-2byte : char, short
		-4byte : int, float
		-8byte : long, double
		
		5.논리형 -boolean(기본값 false)
		-boolean형 변수는 true와 false 중 하나의 값을 저장할 수 있다.
		-대답 (YES, NO), 스위치(ON/OFF)등의 논리구현에 주로 사용한다.
		-1byte의 크기를 가진다.
		
		
		*/
		//	변수의 선언(가문이옴)=
		//			[변수의타입][변수명];
		//	true의 값을 저장할 수 있는 변수 power를 선언 및 초기화(처음으로 값을 입력)해주세요.
		boolean power = true;
		//false값을 저장할 수 있는 변수 melon를 선언 및 초기화(처음으로 값을 입력)해주세요.
		boolean melon = true;
		
		/*
		 6.문자형 - char('\u0000') '<-single쿼테이션
		 -문자 하나를 저장하는 용도로 사용된다
		 -java는 Unicode라는 문자 체계를 이용한다.(// 유니코드,유니코드는 16진수로 이루어짐)
		 -2byte의 크기를 가진다
		 
		 
		 */
		//code라는 변수에 'A'를 저장해주세요
		char code = 'A';
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code2);
		
		/*		
		7.정수형 - byte, short, int, long
		-기본자료형은 int형이다.
		-변수에 저장하고자 하는 정수값의 범위에 따라 4개 중 하나를 선택해야 한다.
	

		*/
//		byte 타입의 변수 b1에 100의 값을 저장해주세요
		byte b1 = 100;
//		9508312111111
		long a1 = 9508312111111L;
//		(4바이트가 넘는건 long으로, 4바이트가 안되는건 int로 자동으로 변환)
		
		/*
		8.실수형 - float, double(여기서는 double이 대장임)
		-실수형 값을 저장하는데 사용된다.
		-float: 1+8+23
		-double: 1+11+52
		
		*/
//		3.14159254863(여기밑에는 더블형이 기본이기때문에 D안붙임)
		double d1 = 3.14159254863;
		float f1 = 3.14159254863F;
		
		System.out.println(d1);
		System.out.println(f1);
		
		
		double d2 = 0.5;
		float f2 = 0.5f;
//		2^n으로 표현 가능할 때만 double과 float이 같게나옴
		System.out.println(0.5 == 0.5f);
		
		/*
		9.문자열 - String (<=클래스기때문에 앞글자 대문자 기본형처럼 쓰지만 기본형이 아닌 참조형임 문자열을 쓸 때 사용함.)
		참조형이기때문에 주소를 사용 null-> 주소가 없다는 뜻
		"" 는 주소가 있다는것 역슬러쉬 표현할 때는 하나만 쓰면 화내고 두개써야함 역슬러쉬뒤에걸 특수문자로 인식함 (더블보다 대빵임
		참고로 byte <short< int< long< double< string)
		 */
		String str = "======\t------";
		System.out.println(str);
//		역슬래쉬하고t 쓰면 탭으로 인식함!
		String mmm = "====\n---------";
		System.out.println(mmm);
		
		
		/*
		10.overflow
		-자신이 표현할 수 있는 값을 넘었을 때 최소값으로 돌아가는 현상
		
		*/
		byte b2 = 126;
		System.out.println(b2); //126
		b2++;
		System.out.println(b2); //127
		b2++;
		System.out.println(b2); //-128
		b2++;
		System.out.println(b2); //-127
		
		/*
		 11.형변환(casting)
		 -기본형 간에는 다른 타입으로 변환이 가능하다.(무조건적으로는 안됨)
		-bute< short< int< long< float< double
					   ^
					   1
					  char(char<int) 
		 
		*/
		int a2 = 40000;
		byte b3 = (byte) a2;
		System.out.println(b3);
		
		int a3 = 65;
		char c3 = (char) a3;
		System.out.println(c3);
//		위에껀 char을 지우면 오버플로우가 발생해서(int가 char안에 들어갈수 없어서)(범위 int>char라서화냄 
//		그런데 밑에 예시는 
		char c4 ='B';
		int i4 = c4;
//		int가 char보다 더 크므로 생략 가능
		long aa = 180;
		float ff = aa;
	
		/*
		12.문자열 결합
		
		 */
		System.out.println(55+10);
		System.out.println("하이"+55); //"하이" + "55" -> 하이55 (왜냐면 더 센 쪽으로 바뀌기 때문 "하이"가 스트링이기 떄문에 숫자를 이겨서 숫자가 스트링으로 바뀜)
		System.out.println("45"+20); //문자열이 되기때문에 사천오백이십(숫자로) 되는것이 아니라!!! 문자로 사오이공이됨
		System.out.println("56"+"32"); //문자+문자이기 때문에 오육삼이
		System.out.println(""+45); //null이 아니라 ""사이에 있긴 있음 그래서 null45가 아니라(스트링이 더 강하기 때문에 스트링 따라서 숫자가 문자로 바뀌어서) 사오가된다
		System.out.println(true+"34"); //"34" 스트링의 영향이 크기때문에 트루가 그냥 문자가 되어버림 그래서 true34가 됨(문자로)
		System.out.println('T'+"G"+45); // 다 스트링으로 바뀌어서 TG라는 스트링이 되어서 +45하면 TG45가 됨 (문자로)
		System.out.println('A'+4+"44"); // 'A' 문자로 되있는 유니코드는 값이 65이기 때문에 앞에서부터 순차적으로 앞에서부터 계산을 해야해서 65+4=69, 그리고 뒤에있는
										//	44는 스트링으로 이루어진 문자이기때문에 6944가 된다.
		
//		참고로 String의 기본값은 null이다
		
	}
}
