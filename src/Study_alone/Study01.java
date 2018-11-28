package Study_alone;


public class Study01 {
	public static void main(String[] args) {
		
		Tv2 t2 = new Tv2("LGTV", 700);
		System.out.println(t2);
		NoteBook nb = new NoteBook("Mac",400);
		MicroWave mw = new MicroWave("LG전자렌지", 200);
		
		Buyer b = new Buyer("이상엽", 1000000);
		
		b.buy(nb);
		b.buy(nb);
		
	
}



class Product {
	String name;
	int price;
	int bonusPoint;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
		bonusPoint = price / 10;
	}
}
	
	
	class Tv2 extends Product{
		Tv2(String name, int price){
			super(name,price);
		}
	


	@Override
	public String toString() {
		return name;
	}
	
	}
	
	class NoteBook extends Product{
		NoteBook(String name, int price){
			super(name,price);
		}

		@Override
		public String toString() {
			return name;
		}
	}

	class MicroWave extends Product{
		MicroWave(String name, int price){
			super(name, price);
		}

		@Override
		public String toString() {
			return name;
		}
	}
	
	
	class Buyer{
		String name;
		int money;
		int bonusPoint;
		
		
		Buyer(String name, int money){
			this.name = name;
			this.money = money;
		}
		
		void buy(Product p){ //메서드 생성... product p 매개변수 하나
			if(money<p.price){
				System.out.println("꺼져");
				return;
			}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p+"를 구매하셨습니다"); 

		}
		
		
	
	
	
	
	
}