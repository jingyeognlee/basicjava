package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {

		FireCar fc = new FireCar();

		fc.water();

		Car c = (Car)fc; // up 캐스팅 자식이 부모로 캐스팅 되는것
		c.drive();

		FireCar fc2 = (FireCar) c; // 다운캐스팅 부모가 자식으로 캐스팅
		fc2.water();

		FireCar fc3 = (FireCar) new Car(); // 이렇게하면 터진다 설명 참조

	}
}

	class Car {
		String color;
		int door;
	
		void drive() {
			System.out.println("순천으로");
	
		}
	
		void stop() {
			System.out.println("주차중");
		}
	
	}
	
	class FireCar extends Car {
		void water() {
			System.out.println("물뿌리기");
		}
	}
	
	class Ambulance extends Car {
		void Aed() {
			System.out.println("text");
		}
	}
	
	