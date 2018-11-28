package B_Operation;

public class Operation_02 {
	public static void main(String[] args) {
		
		/*
		1.증감연산자 (++, --)
		-증가연산자 (++) ; 피연산자(연산이 되는 녀석이 피연산자)의 값을 1증가시킨다
		-감소연산자 (--) ; 피연산자의 값을 1 감소시킨다.
		
		*/
		
		//int 타입의 변수 i1에 50의 값을 저장(초기화)해주세요
		int i1 = 50;
		System.out.println(i1); 
		i1++;
		System.out.println(i1);
		i1++;
		System.out.println(i1);
		
		int i2 = 10;
		int i3 = ++i2 + 5;
//		i2=11

		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i2+":"+13);
		
		int i4 = 11;
		int i5 = 6 + i4++;
		System.out.println(i5);
		
		/*
		int i6 = 20;
		int i7 = 30;
		int i8 = ++16 + 5 + i7++ + 16++;
		  
		*/
		
		/*
		 2.비트 전환 연산자(~)
		 -정수형과 char형에만 사용할 수 있다.
		 -피연산자를 2진수로 표현했을 때 0은 1로 1은 0으로 변경해준다.
		 (비트라는 말이 들어가면 일단 무조건 2진수로 바꿔라)
		 
		 */
		byte b1 = 10;
		int i10 = ~b1;
		System.out.println(i10);
//		int를 안붙이면 화냄 왜 화내나 다시물어보기
		
		/*
		3.논리부정 연산자 (|)
		-boolean형에만 사용 가능하다.
		-true -> false, false -> true
		
		 */
		//power 변수를 선언하고 true의 값으로 초기화하세요.
		boolean power = true;
		power = ! power;
		System.out.println(power);
//		위에꺼에 power앞에 !을 붙이면 부정이되어서 false가 됨
		
		/*
		4.산술연산자
		-사칙연산자(+,-,*,/), 나머지 연산자(%), 쉬프트 연산자(<<, >>, >>>)		
		-이항연산자는 피연산자의 크기가 4byte보다 작은 것들의 연산시에는 4byte(int)형으로
		변환후에 연산을 수행한다.
		
	5.사칙연산자 (+,-,*,/)
		-int형 (4byte)보다 크기가 작은 자료형은 int형으로 형변환 후에 연산을 진행한다.
		byte + short => int + int
		-두개의 피연산자중 자료형의 표현범위가 큰쪽에 맞춰서 형변환 후에 연산을 진행한다.
		byte + long => long + long
		-정수형 값을 0으로 나누는 것은 금지되어 있다.
		*/
//		int a = 5/0;
//		System.out.println(a);
		
		
//		1.byte 타입의 변수에 10의 값으로 초기화해주세요.(aa1)
		byte aa1 = 10;
		System.out.println(aa1);
//		2.short 타입의 변수 aa2에 250의 값으로 초기화해주세요.
		short aa2 = 250;
		System.out.println(aa2);
//		3.aa1과 aa2의 합을 저장할 수 있는 result변수를 선언해주세요.(선언하고 합계 저장)		
		int result = aa1 + aa2;
		System.out.println(result);
		
//		4.3.141592를 저장할 수 있는 변수를 선언 및 초기화해주세요 aa3
		float aa3 = 3.141592f;
//		5.aa3와 aa1의 합을 저장할 수 있는 result2변수를 선언 및 초기화해주세요.
		float result2 = aa1 + aa3;
		System.out.println(result2);
		
		
		
	
//		6.'초' 글자와 '연'글자의 합계를 구해주세요 result3
		int result3 = '초' + '연';
		System.out.println(result3);

		int aaa = 10;
		int bbb = 20;
		float result4 = (float)aaa / bbb;
		System.out.println(result4);
		
		/*6.나머지 연산자 (%)
		-나머지 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려준다.
		-boolean형을 제외한 모든 기본형 변수에 사용할 수 있다.
		*/
		
		//1.변수 ab1에 10의 값을 저장해주세요.
		int ab1 = 6;
		//2. 변수 ab2에 8의 값을 저장해주세요
		int ab2 = 4;
		//3. 변수 share에 ab1을 ab2로 나눈 결과를 저장해주세요
		int share = ab1 / ab2;
		//4.변수 remain에 ab1을 ab2로 나누고 난 나머지 값을 저장해주세요.
		int remain = ab1 % ab2;
		//5.위의 변수 4개를 전부 활용하세요
		//10을 8로 나눈 몫은 1이고 나머지는 2이다.
		System.out.println(ab1+"을 "+ab2+"로 나눈 몫은 "+share+"이고 나머지는"+remain+"이다.");
		
		/* 
		 7.쉬프트 연산자(<<, >>, >>>)
		 -정수형 변수에만 사용 가능하다.
		 -피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		 (2^n으로 곱하거나 2^n으로 나눌때 사용한다)
		 -곱셈과 나눗셈을 할 때 연산속도가 좋으므로 사용한다
		 -<< : x << n은 x * 2^n의 결과와 같다.(한칸씩 옮겨질 때 옮겨지면서 빈칸의 비트가 0으로 채워짐
		 								overflow =한바퀴 도는것 주의 몇바이트인지도 확인할것)
		 ->> : x >> n은 x / 2^n의 결과와 같다.(한칸씩 옮겨질 때는 옮겨지면서 비트의 빈칸이 1로 채워짐
		 
		 */
		
		/*
		 8.비교연산자
		 -두 개의 변수 또는 리터럴을 비교하는데 사용되는 연산자
		 -주로 조건문과 반복문의 조건식에 사용되며 true와 false의 결과를 얻는다.
		 -이항 연산자이다.
		
		 9.대소비교연산자 ( <, >, <=, >= )
		 -기본형 중에 boolean형을 제외한 나머지 자료형에 사용가능하다.
		 -참조형에는 사용할 수 없다.
		 
		 10.등가비교연산자 (==, !=)
		 -모든 자료형에 사용 가능하다(기본형 참조형)
		 
		 수식			|		연산결과
		 x > y		|	x가 y보다 클 때만 true 그 외에는 false이다.
		 x < y		|	x가 y보다 작을 때만 true 그 외에는 false이다.
		 x >= y		|	x가 y보다 크거나 같을 때만 true 그 외에는 false이다.
		 x <= y		|	x가 y보다 작거나 같을 때만 true 그 외에는 false이다.
		 x == y		|	x와 y가 같을 때만 true 그 외에는 false이다.
		 x != y		|	x와 y가 다를 때만 true 그 외에는 false이다.
		 */
		
		System.out.println(5 > 40);
		
		/*
		 11.비트 연산자 ( &, |, ^)
		 -이진 비트 연산을 수행한다.
		 -실수형을 제외한 모든 기본형에 사용할 수 있다.
		 
		 &(AND연산) : 피연산자중 양쪽 모두 1이면 1의 결과를 얻는다.
		 |(OR 연산) : 피연산자중 한쪽의 값이 1이면 1의 결과를 얻는다.
		^(XOR 연산) : 피연산자의 값이 서로 다를 때만 1의 결과를 얻는다.
		
		3	-> 00000011
		5	-> 00000101
		
		3&5	-> 00000001
		3|5 -> 00000111
		3^5 -> 00000110 
		 */
		
		System.out.println("3^5 =>" + (3^5));
		System.out.println("3|5 =>" + (3|5));
		System.out.println("3&5 =>" + (3&5));
		
		/*
		 12.논리연산자 ( &&, || )
		 -피연산자로 boolean형 또는 boolean형 값을 결과로하는 조건식만을 허용한다.
		 -'&&' 연산이 '||' 보다 우선순위가 높다.
		 -EX)ID 비밀번호로 로그인할때
		 ||(OR결합) : 피연산자 어느 한쪽만 true이면 true의 결과를 얻는다
		 &&(AND결합) : 피연산자 양쪽 모두 true일 때만 true이다.
		 
		 */
		//1. 'j'를 저장할 수 있는 변수 ab4를 선언 및 초기화해주세요.
		char ab4 = 'j';
		//2. ab4의 값이 대문자일 때 true의 결과를 얻는 조건식을 만드세요
		
		System.out.println('A' <= ab4 && ab4 <= 'Z');
		System.out.println('a' <= ab4 && ab4 <= 'z');
		System.out.println();
		
		
//		숫자형인지 판단
	
		/*
		  13.삼항연산자
		  -세 개의 피연산자를 필요로 하기 떄문에 삼항연산자라고한다.
		  -기본구조 
		  		(조건식) ? 식1 : 식2
		 */
		
		int x = 10;
		int absx = x>0 ? x : -x;
		System.out.println(absx);
//		양수인지먼저 물어봄  a>0 ? "양수" :
		
		
		/*
		  14.반올림
		 	-37.1568 소수점 넷째자리에서 반올림하여 셋째 자리까지 표현하세요
		 	
		 	1) x*1000 => 37156.8
		 	2) +0.5 => 37157.3
		 	3) (int) => 37157
		 	4) /1000f => 37.157
		 	
		 	(int)(x*1000+0.5)/1000f
		 */
		float x2 = 37.65f;
		int result5 = (int)(x2 + 0.5);
		System.out.println(result5);
		
		/*
		 15.random
		 */
//	1~6
//		포함 ~ 미포함 1~7
//		뒤 - 앞 : 6
//		시작 : 1
		int result8 = (int)(Math.random()*6+1);
		System.out.println(result8);
		
//		Math라는 자바에서 지원하는 클래스 안에 random이 들어가있음 .이 있는것은 안에 들어가있다는 뜻 
				
				
		/* 대입연산자 (=, op= )
		 
		 *
		 */
			int aa6 = 10;
			aa6 = aa6 + 5;
			aa6 *= aa6 * 6;
			aa6 <<= 5;
			System.out.println(aa6);
			
		  
	}
}