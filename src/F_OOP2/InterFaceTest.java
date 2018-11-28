package F_OOP2;

public class InterFaceTest {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		if(f instanceof Unit2){
			System.out.println("f는 Unit2의 인스턴스이다");
			Unit2 u2 = f;
		}
		
		if(f instanceof Fightable){
			System.out.println("f는 FIghtable 인터페이스를 구현했다");
			Fightable f2 = f; //인터페이스의 다형성
		}
		//인터페이스 타입의 참조변수로 그를 구현한 구현체의 인스턴스를 참조할 수 있다.
	
		if(f instanceof Movable){
			System.out.println("f는 Movable 인터페이스를 구현했다");
			Fightable f2 = f; //인터페이스의 다형성
		}
		
		
		
	}
}


class Unit2{
	int x;
	int y;
	int currentHp;
}

interface Movable{
	void move(int x, int y);
	
	
	
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable{
	
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}
