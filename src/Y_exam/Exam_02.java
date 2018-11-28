package Y_exam;

public class Exam_02 {
	public static void main(String[] args){
		
		
		/*
		 
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
			
				  1byte			2byte		4byte		8byte
		----------------------------------------------------------
		논리형	boolean
		----------------------------------------------------------
		문자형					char
		----------------------------------------------------------
		정수형	byte			short		int			long
		----------------------------------------------------------
		실수형								float		double
		----------------------------------------------------------
		<풀이>
		논리형: boolean	
		문자형: char
		정수형: byte, short, int, long
		실수형: float, double
	
		1byte: byte, boolean
		2byte: char, short
		4byte: int, float
		8byte: long, double
		
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		정수값의 범위에 따라 4가지의 기본형(byte, short, int, long) 중에서 선택하면 되는데 
		범위를 구하는 공식: -2^n ~ 2^n-1(n=bit의 수)
		이 공식대로 int의 범위를 구하면 -2,147,483,648 ~ 2,147,483,647인데(최대 10자리) 
		주민등록 번호는 13자리이므로 int의 범위보다 많게되어 overflow가 되므로 long을 사용한다
		(long중에서도 긴것은 리터럴 뒤에 L을 입력한다)
		long regNo = 9508312410915L;
		
 		*/
		long regNo = 9508312410915L;
		
		
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		
		- 리터럴 : 100, 100L, 3.14f
		- 변수 : i, l
		- 키워드 : int, long l, final,float
		- 상수 : PI
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		a. int
		b. Byte
		c. double
		d. boolean
		
		답은 b.Byte이다 기본형은 앞에 대문자를 붙이면 안되고 소문자로 이루어져야한다
		앞이 대문자가 붙으려면 클래스명이어야한다.
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
		류’라고 적으시오.
		System.out.println(“1” + “2”) → ( "12") 둘다 string이기 때문에 문자로 처리됨(string은 문자열을 표현할 수 있음)
												그래서 숫자 12가 아니라 문자 12로 출력된다
		System.out.println(true + “”) → ("true" )string이 강하기때문에 true도 문자처리된다.
		System.out.println(‘A' + 'B') → (131 )65+66 jv는 연산을 할 때 4byte로, 그래서 연산하는 숫자가 둘다 작으면 4byte형으로
													변환해서 계산을 한다.
												(기억해야할 것: 4byte보다 작은 수들의 연산할 때  4byte인 int로 변환되어 연산됨)
												'A'는 '때문에특수문자로 처리되어서 숫자 65를 나타내고, B는
												한숫자 더 높아서 66
		System.out.println('1' + 2) → (51 ) 피연산자 타입이 int보다 작으면 int로 전환되는데, '1'을 숫자로 변형하기위해
											아스키코드를 보면'1'=49이기 때문에 49+2=51 (문자를 정수로 저장하기때문에 정수형과
											별반 다르지않고 정수형 혹은 실수형과 연산이 가능)
		System.out.println('1' + '2') → (99 ) 위 설명처럼 '1'=49, '2'=50 즉 '1'+'2'=99아스키코드를 보면'1'=49이기 때문에 
										49+2=51 (문자를 정수로 저장하기때문에 정수형과 별반 다르지않고 정수형 혹은 실수형과 연산이 가능)
		System.out.println('J' + “ava”) → (Java ) "ava"는 string의 범위가 더 강력하기 때문에 J 역시 문자로 만들어버린다 따라서
													Java가 된다
		System.out.println(true + null) → (오류 ) null은 string의 기본형이지만 주소형의 기본형도 되고 null의 값으 무엇이 될지도
											모르기때문에 주소에 덧셈 자체가 안된
												주소에 덧셈 자체가 안됨
		
		*/
		
		
		/*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) 답:b,c,d,e
		a. if
		b. True
		c. NULL
		d. Class
		e. System
		
		키워드는 reserved word, 예약어라고도 하는데, 클래스,변수,메서드 이름으로 사용할 수 없다
		if는 예약어이고, True, Null,Class는 대입해보면 되지않는다
		System 역시 맨 앞글자가 대문자라서 안된다.(CLASS어)
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오) 답: a,d,e,g
		a. $ystem
		b. channel#5
		c. 7eleven
		d. If
		e. 자바
		f. new
		g. $MAX_NUM
		h. hello@com
		
		변수의 명명규칙에 따르면, 1.대소문자를 구분하며 길이에는 제한이 없다. 2. 예약어를 사용해서는 안된다
		3.숫자가 맨 앞에와서는 안된다. 4.특수문자는 '_'과 '$'만을 허용한다.인데,
		a는 조건을 만족했으므로 가능하고, b는 들어가선 안되는 특수문자가 들어가서 안된다. c는 맨 앞이 숫자이고
		d역시 모든 조건을 만족했으므로 가능하다.e는 프로그래머들사이에서는 쓰지않는 것이 좋지만 사용은 가능하다.
		f는 예약어이므로 사용할 수 없고 g는 명명규칙을 만족했으므로 가능하다. h는 써도되는 특수문자외의 특수문자가
		들어갔으므로 안된다
		
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
		르시오) 답:a,d
		a. int
		b. long
		c. short
		d. float
		e. double
		
		참조형 변수는 4byte이고, 4byte에 속하는 기본형은 float와 int이다.
		
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) d,e
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		a. b = (byte)i;
		b. ch = (char)b;
		c. short s = (short)ch;
		d. float f = (float)l;
		e. i = (int)ch;
		
		---일단 범위를 보면 된다.
		두 줄중 밑에 있는 기본형이 위에 있는 기본형보다 크면 생략 가능
		
		byte < short < int < long < float < double
		(char < int)
		
	 	   int i = 100;
		a.	b = (byte)i; int는 byte 범위에 들어갈 수 없으므로 생략할 수 없다
			
			byte b = 10;
		b.	ch = (char)b; byte는 char 범위안에 들어갈 수 없으므로 생략할 수 없다
		
			char ch = 'A';
		c.	short s = (short)ch; short는 char 범위안에 들어갈 수 없으므로 생략이 안된다(char은 int이상부터 가능하다)
		
			long l = 1000L
		d.	float f = (float)l; long은 float 범위안에 들어가므로 생략할 수 있다
			
			char ch = 'A';
		e.	i = (int)ch; char은 int 안에 들어가므로 생략할 수 있다
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		char은 숫자가 아니기때문에 음수가 없으며, 0부터 시작한다.또한 비트의 개수에서 부호 1개를 빼지않아도 된다.
		char은 2byte이기때문에 16비트를 사용한다. 0~2^16-1 (2^16=65536) 따라서 0~65535까지 char이 저장될 수 있는 범위이다.
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오):a,b,c,d
		a. byte b = 256;
		b. char c = ''; 
		c. char answer = 'no';
		d. float f = 3.14
		e. double d = 1.4e3f;
		
		a.byte의 범위는 -128~127인데 초과하여 오버플로우현상이 일어나므로 잘못되었음
		b.char c = '';는 ''사이에 공백이 있는데 char는 공백을 저장할 수 없음
		c.char answer = 'no' 문자열을 넣을 수 있는 것은 string이고, char은 문자만 넣을 수 있다.
		d.float f = 3.14 는 뒤에 f가 붙어야 하고 ;를 넣지 않아서 잘못되었다.
	
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) 답:c,e,f
		a. boolean - false
		b. char - '\u0000'
		c. float - 0.0
		d. int - 0
		e. long - 0L
		f. String - ""
		
		a는 boolean의 기본값은 false이므로 맞음 b.char의 기본값은 '\u0000'이므로 맞고
		c.float의 기본값은 0.0f이므로 틀림, d.int의 기본값은 0이므로 맞음, e.long의 기본값은 0이므로 맞음
		f.string의 기본값은 null이므로 틀림
		
		*/
		
		
		

	}
}