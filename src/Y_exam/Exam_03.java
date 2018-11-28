package Y_exam;

public class Exam_03 {
	
public static void main(String[] args) {
	
	
	/*[3-1] 다음 연산의 결과를 적으시오.
	[연습문제]/ch3/Exercise3_1.java
	class Exercise3_1 {
	public static void main(String[] args) {
	
	
	
	int x = 2;
	int y = 5;
	char c = 'A'; // 'A'의 문자코드는 65
	
	System.out.println(1 + x << 33); 쉬프트 연산자(<<)는 산술연산자보다 우선순위가 낮다.
									x를 대입하면 1+2= 3, 3 << 33은 int라고했을 때 int는 4byte이므로 32비트이고, 오버플로우가
									발생하여 2의 33제곱에서 32를 빼면 2가 남으므로 3*2가 됨. 즉 답은 6
	System.out.println(y >= 5 || x < 0 && x > 2); 논리 연산에서 우선순위는 &&(and) 다음 ||(or)이다. 먼저 위의 숫자를 대입하면,
													5 >= 5 || 2 < 0 && 2 > 2 이다. && 앞뒤에 있는 연산부터 보면,
													2는 0보다 작지 않고(false), 2는 2보다 크지 않으므로(false) 즉 둘다
													같은 값이 되므로 false가 된다 그리고 왼쪽에 있는 연산 5 >= 5는 true이므로
													true || false or연산은 하나라도 true이면 true가 되므로 답은 true. 
	
	System.out.println(y += 10 - x++); 
										y += 10 연산은 y= y+10 즉 y의 값에 y자신에 10을 더한값을 대입해야 하는 공식이다.
										숫자를 대입하면, 5 += 10 - 2++ 인데, 15 - 2++이 된다. 답은 13
										
	System.out.println(x+=2);		예를들어 a+=b 공식은 a자신에 b를 더한 값을 a에 대입하는 것이다. 즉 2에 3을 더하면 5 
								
	System.out.println( !('A' <= c && c <='Z') );	먼저 c값을 대입해보면 ( !('A' <= 'A' && 'A' <='Z') )이다
													괄호안에 있는 것을 먼저 계산해보면, A는 A와 같기 때문에 TRUE,
													A는 Z보다 작기때문에 크거나 작다는 것 중 작다는 것을 만족해서 TRUE
													TRUE && TRUE 둘다 값이 같으므로 TRUE, (!( TRUE && TRUE ))이고, 
													!는 같지 않다는 연산자이기때문에 FALSE가 된다
													
	System.out.println('C'-c);		'C'는 char 지만 c와 산술연산을 하기 위해서 int로 변환된다. 'C'= 67, c='A'=65 이므로
									67-65=2
	System.out.println('5'-'0'); byte 이하의 char은 산술하면서 일어나므로 int로 변환된다 5-0= 5
								
	System.out.println(c+1); 4byte 이하라서 int로 산술 변환이 일어나므로 c=65가 된다. 65+1= 66
	System.out.println(++c); 모든 연산에서는 산술 변환이 일어나지만, 증감 연산자와 쉬프트 연산자는 산술 변환이 일어나지 않는다.
							 그러므로 ++ 자기 자신의 값에 하나의 값을 증가시키는 것이므로 c='A'였으므로 B가 된다.
	System.out.println(c++);  c값이 C가 된다
	System.out.println(c); c= 'A'이기 때문에 값 그대로 'C'이다
	}
	}*/
	
	int x = 2;
	int y = 5;
	char c = 'A';
	System.out.println( !('A' <= c && c <='Z') );
	System.out.println(c);
	
	
	/*[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
	사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
	가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
	
	
	[연습문제]/ch3/Exercise3_2.java
	class Exercise3_2 {
	public static void main(String[] args) {
	int numOfApples = 123; // 사과의 개수
	int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
	int numOfBucket = (  (1) ); // 모든 사과를 담는데 필요한 바구니의 수
//	System.out.println("필요한 바구니의 수 :"+numOfBucket);

 	사과의 수가 123개(numOfApples)이고 하나의 바구니에 10개의 사과를 담을 수 있다면(sizeOfBucket) 123 / 10 이렇게하면 
 	12가 나오고 나머지가 3이 된다
 	이렇게 나머지가 나왔을 경우에 필요한 바구니의 갯수에 +1을 하면 되므로, 2가지의 경우로 true, false로 나누어서 답을 구할 수 있다.
 	즉, 삼항식을 사용하면 되는것이다. 나머지 사과의 갯수가 0이 되는가?를 조건식으로 사용한다
 	int numOfBucket = numOfApples % 10 == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
  	이 된다.
//	}
//	)[실행결과]
	13
	*/
	int numOfApples = 120;
	int sizeOfBucket = 10; 
	int numOfBucket = numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket +1;
	System.out.println("필요한 바구니의 수 :"+numOfBucket);

	
	
	/*[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
	자를 이용해서 (1)에 알맞은 코드를 넣으시오.
	[Hint] 삼항 연산자를 두 번 사용하라.
	[연습문제]/ch3/Exercise3_3.java
	class Exercise3_3 {
	public static void main(String[] args) {
	int num = 10;
	System.out.println( (1)  );
	}
	}[실행결과]
	
	힌트에 삼항 연산자를 두 번 사용하라고 되어있고 int num = 10, 즉 '양수'이기 때문에 양수를 true가 되게하는 식을 만들어야한다.
	(조건식 ? true : (조건식 ? (true) : (false))이렇게 만들면 연산자를 두번 사용하게 된다. 
	System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		양수*/
	
	int num = 10;	

	System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
	
	
	/*[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
	의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
	시오.
	[연습문제]/ch3/Exercise3_4.java
	class Exercise3_4 {
	public static void main(String[] args) {
	int num = 456;
	System.out.println(  (1)  );
	
	}
	}[실행결과]
	400*
	이문제는 456에 100을 나누고 다시 100을 곱하면 되는 문제이다.
		}*/
	
	int num2 = 1567;
	System.out.println((int)(num2 / 100) * 100);
	
	
	/*[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
	값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_5.java
	class Exercise3_5 {
	public static void main(String[] args) {
	int num = 333;
	System.out.println(  (1)  );
	}
	}[실행결과]
	331*/
	int num3 = 331;
	System.out.println((int)(num3 /10) * (int)10+1);
	
	
	/*[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
	뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
	다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
	수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
	[Hint] 나머지 연산자를 사용하라.
	[연습문제]/ch3/Exercise3_6.java
	class Exercise3_6 {
	public static void main(String[] args) {
	int num = 24;
	System.out.println( (1)  );
	}
	}[실행결과]
		6
*/
	int num4 = 24;
	System.out.println((int)(((num4+10)/10)*10)-num4); 
	
	/*[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
	5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
	셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
	[연습문제]/ch3/Exercise3_7.java
	class Exercise3_7 {
	public static void main(String[] args) {
	
	int fahrenheit = 100;
	float celcius = (  (1)  );
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
	
	문제풀이 : (int)((5f/9*(fahrenheit-32))*100+0.5)/100f
	}
	}[실행결과]
	Fahrenheit:100
	Celcius:37.78
	먼저 C = 5/9*(F-32) F에 100을 대입하면 37.7777778이 나오게 된다. 이것을 37.78로 나오게하려면
	셋째자리를 더해주어서 37.78...로 만들어주고  다른수를 대입했을 때도 마찬가지로 두번째 자리를 반올림 값이 나올 수 있도록해야하므로
	37.7777778 * 100을 곱해준다 그러면 3777.7778이 된다 이 상태에서 0.5를 더해주면 3778.2778이 되고
	여기서 int로 변환해주어야 뒤에있는 소수점들이 다 사라지게 된다. 3778에서 100을 다시 곱해주면 37.78이 나온다.
	flaot celcius = ((float)((int)((float)(5 / 9 * (fahrenheit - 32))* 100) + 0.5) / 100);
	
	int fahrenheit = 100;
	
	*/
	int fahrenheit = 100;
	
	float celcius = (float)((int)((float)5/9*(fahrenheit-32)*100+0.5))/100;
					
	System.out.println(celcius);
	
	/*[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
	[연습문제]/ch3/Exercise3_8.java
	class Exercise3_8 {
	public static void main(String[] args) {
	
	byte a = 10;
	byte b = 20;
	byte c = a + b;
	char ch = 'A';
	ch = ch + 2;
	float f = 3 / 2;
	long l = 3000 * 3000 * 3000;
	float f2 = 0.1f;
	double d = 0.1;
	boolean result = d==f2;
	
	System.out.println("c="+c);
	System.out.println("ch="+ch+=2);
	System.out.println("f="+f);
	System.out.println("l="+l);
	System.out.println("result="+result);
	}
	}[실행결과]
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true*/
	
	byte a = 10;
	byte b = 20;
	int c1 = a + b;
	char ch = 'A';
	ch = ch+=2; //+= 단항식으로 풀 수 있다(변환이 필요없음) 이 연산자는 ch=ch+2와 같다 즉 자기자신에 +2를 대입하게되는데,
					//'A'자체에 +2가되면 'C'가 된다
	float f = (float)3 / 2; //1.5 
	long l = (long) 3000 * 3000 * 3000; // 앞은 long 형인데 뒤는아무것도
	float f2 = 0.1f; //
	double d = 0.1; //
	boolean result = d!=f2; // ==이 값이 false이면 != 는 true가 되므로
	
	System.out.println("c="+c); // 30이 되어야 한다 (맞음)
	System.out.println("ch="+ch); // C가 되어야한다
	System.out.println("f="+f); //1.5가 되어야 한다 (맞음)
	System.out.println("l="+l); //
	System.out.println("result="+result); //true
	
	/*[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
	의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_9.java
	class Exercise3_9 {
	public static void main(String[] args) {
	char ch = 'z';
	boolean b = (  (1) );
	System.out.println(b);
	}
	
	}[실행결과]
	true
	
	먼저 대문자인 경우 OR 소문자인 경우 숫자인 경우가 true가 된다는 것이므로 범위를 지정한다
	1) 'A' <= ch && ch <= 'Z'
	2) 'a' <= ch && ch <= 'z'
	3)
	
	*/
	char cb = 'z';
	boolean bb = ('A' <= cb && cb <= 'Z' || 'a' <= cb && cb <= 'z'||'0'<= cb && cb <= '9');
	System.out.println(bb);
	
	
	
	/*[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
	인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
	들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_10.java
	class Exercise3_10 {
	public static void main(String[] args) {

	char ch = 'A';
	char lowerCase = ( (1) ) ? (  (2) ) : ch;
	System.out.println("ch:"+ch);
	System.out.println("ch to lowerCase:"+lowerCase);
	}
	}
	[실행결과]
	ch:A
	ch to lowerCase:a
	
	실행 결과가 각각'A'(대문자), 'a'(소문자)로 나오게되는데,
	(조건문 ? 'a'(true) : 'A'(false)
	무언가를 물었을 때 true가 a여야함
	주어진 값이 'A'이고 대문자이므로 (1)번풀이: 'A'<=ch<='Z' 을 나누면 'A'<= ch && ch <= 'Z' 이런 조건을 제시했을 때
	ch는 대문자 'A'였으므로 조건을 만족해서 True로 넘어가게 된다. 즉 (1): 'A'<= ch && ch <= 'Z'
	char lowerCase = ('A' <= ch && ch <= 'Z') ? (2) : ch
	(2)는 a를 대입하면 끝일 것 같지만 대입하는 값이 바뀔 수도 있으므로 대문자('A')+32=소문자('a') 형식으로 만들어준다 char과 int가 연산을 하게되면
	char이 int로 변환되므로 앞에 (char)을 씌워서 형변환을 만들어주어야한다.
	즉 (2)=(char)(ch+32)
	char lowerCase = ('A'<=ch && ch <='Z') ? (char)(ch+32) : ch;
	 
	*/
	char c0 = 'B';
	char lowerCase = ('A'<= c0 && c0 <= 'Z') ? (char)(c0+32) : c0;
	System.out.println("c0:"+c0);
	System.out.println("c0 to lowerCase:"+lowerCase);
	

	
	


	}

}

