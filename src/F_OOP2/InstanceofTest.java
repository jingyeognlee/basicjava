package F_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if(fc instanceof FireCar){ //fc라는 참조변수가 파이어카를 포함하고있느냐 또는 인스턴스이냐
			System.out.println("fc는 FireCar의 인스턴스이다");
			FireCar fc2 = fc;
		}
		
		if(fc instanceof Car){
			System.out.println("fc는 Car의 인스턴스이다");
			Car c2 = fc;
		}
		
		
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다");
			Object o2 = fc; //업캐스트 연산자가 생략되어있다. 부모찾기
		}
		
		
		
		
		
		
		
	}
}




