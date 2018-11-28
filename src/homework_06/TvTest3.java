package homework_06;


		//1.TV 클래스를 생성하시오	
		class Tv{//Tv 속성 (멤버변수)
		
		String color;//2.color 인스턴스변수를 선언하시오
		boolean power;//3.power 인스턴스변수를 선언하시오 
		 int channel;//4.channel 인스턴스변수를 선언하시오


		//tv의 기능 (메서드)
		void power(){power = !power;}//5.tv를 켜거나 끄는 기능을 하는 메서드 ,리턴값 x
		
		void channelUp(){++channel;}//6.tv의 채널을 높이는 기능을 하는 메서드, 리턴값 x
		
		void channelDown(){--channel;}//7.tv의 채널을 낮추는 기능을 하는 메서드, 리턴값 x
		
		
		

		}

		class TvTest3 {//8.TvTest3라는 클래스를 생성하고 메인을 불러오시오
		public static void main(String[] args) {//메인
			Tv t1 = new Tv();//9.TV클래스에서 t1이라는 변수로 인스턴스화를 하시오	
			Tv t2 = new Tv(); //10.TV클래스에서 T2라는 변수로 인스턴스화를 하시오
			System.out.println("t1의 channel값은"+t1.channel+"입니다");//11.t1.channel 의 값을 출력하시오 -> t1의 channel값은 ~ 입니다 형식으로 출력하기
			System.out.println("t2의 channel값은 "+t2.channel+"입니다");//12.t2.channel 의 값을 출력하시오 ->
			
			
			t2 = t1;//13. t1이 저장하고있는 값(주소)를 t2에 저장하시오
			t1.channel = 7;//14.t1의 channel의 값을 7로 하시오
			System.out.println("t1의 channel값을 7로 변경하였습니다.");//15.t1의 channel값을 7로 변경하였습니다 라고 출력하시오
			
			System.out.println("t1의 channel값은 "+t1.channel+"입니다");//16.t1의 channel값은 ~ 입니다
			System.out.println("t2의 channel값은"+t2.channel+"입니다");//17.t2의 channel값은 ~ 입니다
			
			
			
			
			/*실행결과
	t1의 channel값은 0입니다.
	t2의 channel값은 0입니다.
	t1의 channel값을 7로 변경하였습니다.
	t1의 channel값은 7입니다.
	t2의 channel값은 7입니다.
			 */
		}
		
		}

