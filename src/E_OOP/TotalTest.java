package E_OOP;

public class TotalTest { //Method area는 클래스 정보를 저장하는 곳인데, 먼저 TotalTest라는 클래스가 생성되고, 그 안에 메인 메서드가 존재한다.
						//TotalTest 안에 main()을 올려준다 ( 그 외에 클래스 변수나 클래스 메서드는 없다.)
	public static void main(String[] args) {//main()가 실행되므로 call stack에 main()을 올려준다

		TvMaker.color = "Blue"; //1.TvMaker -> 여기서 TvMaker이라는 클래스를 Method area에 올리고 밑에 있는 TvMaker 클래스로 내려가서
								//클래스 친구들인 클래스 메서드와 클래스 변수들을 찾는다. 앞에 static이라고 써져있는것들 
								//TvMaker의 클래스 변수:TvMaker의 클래스 변수 : color=null, inch=0(기본값으로 Method area에 입력)
								//클래스 메서드는 없다
								//2.이제 TvMaker이 color을 호출하는것인데,method area에서 color에 null 값에 이제 "Blue"를 입력한다
		TvMaker tm = new TvMaker();  //1.이제 이 문장을 수행해야하는데, TvMaker은 앞서 Method area에 로드가 되어있는 것을 확인하고
							//2.main method의 지역변수인 tm에 이제 새롭게 인스턴스를 생성하는 것이다. call stack에는 main()이 있는 네모 칸 안에
						//tm을 써주고, new로 새로운 인스턴스가 생성되므로 tm의 주소가 생성되는 것이다. 따라서 heap메모리에 tm의 주소를 써주고,
						//새로운 인스턴스가 생성되었으므로 인스턴스 친구들인 인스턴스 메서드와 인스턴스 변수들을 불러주어야한다.
					//인스턴스 변수: name = "", age=0(초기값), 인스턴스 메서드: Tvmaker(), Tvmaker(string, int) 
					//메서드의 매개변수 안에는 꼭 타입써줘야한다 이름이 동일해도 타입이 다르거나 또는 
					//타입의 개수가 다르면 같은 이름을 쓸 수 있는 오버로딩을 이용하기 때문)
					//그리고 아까의 tm이 생성되면서 만들어졌던 tm의 주소를 call stack에서 main() 참조변수이자 지역변수tm으로 대입해준다
		tm.age = 30; //참조변수 tm이 age라는 인스턴스 메서드를 호출하는데, 인스턴스를 확인해서 아까 heap에서 기본값 0이었던 것을 30으로 고쳐준다
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);// //여기서 갑작스럽게 출력을 하는데 Tvcontroll이라는 클래스가 등장했으므로
					//밑에 내려가서 Tvcontroll 클래스를 찾아보자 이 Tvcontroll 클래스의 클래스 변수와 클래스 메서드를 찾아보면,
					//class 변수 :MAX_CHANNEL=50(상수), MIN_CHANNEL=1(상수), channel=15
					//class method : volumeDown 이다. 다시 올라와서 이 문장을 보면 ,
				//이 클래스가 channel을 호출한것을 출력하는 것이므로 15가 나온다 그래서 console에는 15가 찍힌다.
		
		TvControll.volumeDown(); //앞서 tvcontroll 클래스를 method area에서 로드한것을 확인하고 volumeDown 메서드를 실행하는 것이므로
					//call stack에 volumeDown 메서드를 추가해준다 여기서 매개변수가 없으므로 안에 따로 적지는 않는다. 이제, volumedown메서드를
					//확인하기 위해서 tvcontroll에 있는 volumedown 메서드를 찾아가서 확인해보면
		
					//			static int volumeDown() {
					//		if (channel == MAX_CHANNEL) {
					//			channel = MIN_CHANNEL;
					//		} else {
					//			channel++;
					//		}
					//		return channel;
					//	}
					//}
					//channel이 max_channel의 값인 50과 같다면 min_channel 역시 1이라는 것이고 만약 그렇지 않다면
					//채널을 하나 높이는 것을 수행하고, 그 값을 channel에게 리턴하라는 메서드인것을 확인할 수 있다.
					//그런데, 아까 출력했듯이 채널은 15라는 값이 찍혀있으므로 if문이 수행되는것이 아니라 else가 수행되어 채널이 ++되었고,
		System.out.println(TvControll.channel); //이것을 출력해서 console에  16이라는 값이 찍히는 것을 볼 수 있다.

		// 3.2
		TvControll tc; //이제 tvcontroll class가 나왔으니 아까 method area에서 로드한 것을 확인하고, tc라는 main()의 지역 변수를 선언한 것을 확인한다.
						//따라서 main() 옆에 tm 옆에 tc를 적어준다
		tc = new TvControll(); //위와 지금의 문장은 결국 합쳐져서 새로운 인스턴스를 생성한다는 것을 나타낸다. 지역변수 tc에는 새로운 주소값이 생기게 되고,
							//heap 메모리에 새로운 주소값이 생성되고, 이제 tm의 인스턴스 친구들(인스턴스 변수, 인스턴스 메서드)
							//을 tvcontroll 클래스 안에서 불러와야한다.
							//
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1.
	// 1.1
	static String color;
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);
	}

	// 2.2
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}