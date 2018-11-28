package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		
		Car c1= new Car(); //인스턴스화
		Car c2= new Car("red","auto",2);
		Car c3= new Car("yellow","auto");
		
		
//	Car c1 = new Car();
//	System.out.println(c1.color);
//	System.out.println(c1.gearType);
//	System.out.println(c1.door); //여기까지하고 퇴근
//	//먼저는 null로 초기화되고 나중에 생성자할 때 값을 넣어주는것
//	
//		
//	
//	Car c2 = new Car("red","auto",2);
//	System.out.println(c2.color);
//	System.out.println(c2.gearType);
//	System.out.println(c2.door); //이름이 같을 때는 전역변수 <지역변수가 우선임
//								//이름이 같을 때 지역변수와 지역변수를 구분하는것 this
	
		
		
		//레드에 오토에 바퀴는 두개
		
		
	}
}


class Car{ 
	String color;
	String gearType;
	int door; //문 개수
	
	Car(){ //this.일 때 여기로
		color = "black";//컴파일러는 생성자가 없으면 알아서 자동생성해서 만들어준다
		gearType = "stick";
		door = 4;
	}
	
	
	Car(String color, String gearType){ //메서드를 호출해야하는데 생성자를 
		this(); //생성자 내에서 다른 생성자를 호출할 때 이렇게 씀 this()를 쓰기위한 조건 이 위에 sysout조차 들어오면 안됨
		this.color= color; //이름이 같을 때 this.이 붙은게 인스턴스변수 안붙은게 지역변수
		this.gearType = gearType;
	
	}
	
	
	Car(String color, String gearType, int door){ //this.안쓰면 여기로
		this.color= color; //이름이 같을 때 this.이 붙은게 인스턴스변수 안붙은게 지역변수
		this.gearType = gearType;
		this.door = door;
	}
	

	
}