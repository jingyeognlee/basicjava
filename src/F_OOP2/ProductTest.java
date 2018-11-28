package F_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv2 t2 = new Tv2("LGTV", 700);
		System.out.println(t2);
		NoteBook nb = new NoteBook("Mac", 400);
		MicroWave mw = new MicroWave("LG전자렌지", 200);
		
		
		Buyer b = new Buyer("이상엽",10000000);
		
		b.buy(t2);
		b.buy(nb);
		
		b.refund(mw);
		b.summary();
		
		
		System.out.println(b.item.get(2));
	
		System.out.println("처음산 물품: "+b.item.get(1));
		System.out.println("호갱님의 잔여금은 "+b.money+"이고");
		System.out.println("보너스 포인트는 "+b.bonusPoint+"입니다.");//호갱님의 잔여금은 xxx이고 보너스 포인트는 xxx입니다
		
	
	}
}

////////////
class Product{
	String name;
	int price;
	int bonusPoint;
	
	Product(String name,int price){
		this.name =name;	//초기화블럭
		this.price =price;
		bonusPoint = price/10;	
	}
}
/////////////
class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
	}


	public String toString(){
		return name; //alt + shift + s -> s -> enter
	}

}
/////////////////
class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
	}
		
		
		public String toString(){
			return name; //alt + shift + s -> s -> enter
		
	}
}
///////////////
class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
	}
		
		
		public String toString(){
			return name; //alt + shift + s -> s -> enter
	}
}

///////////////
class Buyer{
	String name;
	int money;
	int bonusPoint;
	Vector<Product> item = new Vector<Product>();
	
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	void buy(Product p){
		if(money<p.price){
			System.out.println("꺼져");
			return;
		}
		
		money-=p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println( p+"를 구매하셨습니다."); //자식에 있는 프로덕트를 씀
		item.add(p);
	}
		
		
	
		void refund(Product p){ //환불해주는 것
				if(item.remove(p)){
					money+=p.price;
					bonusPoint -=p.bonusPoint;
					System.out.println(p+"를 환불해드렸습니다");
					return;
				}else if(item.isEmpty()){
					System.out.println("구매하신 제품이 없습니다");
					return;
				}else{
					System.out.println("저희 매장에서 구매하신 제품이 아닙니다.");
				}
		
		}
				void summary(){
//					System.out.println("\t영\t수\t증");
//					System.out.println("구매물품");
//					int sum=0;
//					for (int i=0; i < item.size()){
//						System.out.println("\t"+item.);
//					}
//									
					int sum = 0;
					System.out.println("\t"+ "영수증");
					System.out.println();
					System.out.print("구매물품");
					for(int i=0; i<item.size();i++){
						Product p = (Product)item.get(i);
						sum = sum + p.price;
						System.out.println("\t"+item.get(i)+"\t"+p.price+"만원");
					}
					System.out.println();
					System.out.println("총 구매 금액"+sum);
					System.out.println("고객님의 남은 돈 "+money+"만원");
					System.out.println("고객님의 포인트"+bonusPoint+"만점");
					System.out.println();
					System.out.println("또 오십시오 고객님");
					
					
				}
		
		
	
	
	
	//1.반품 refund()
	//구매물품이 없으면 "구매하신 물품이 없습니다."
	//구매물품이 있으나 우리 매장에서 산게 아니다 --내가 산 물품안에 있는 녀석만
	
	

	
	

	
	
	//2.영수증 출력 summary()
	
	/*



	 	 	영	수	증
	 	 	
	 	 	
	 구매물품 LGTV		700만원
 		   Mac		400만원
 		   LG전자렌지	200만원
  	
  	 총 구매 금액		1300만원
  	 고객님의 남은 돈 	8700만원
  	 고객님의 포인트		130만점
  	 
  	 또 오십시오 고객님
  	 
  	 
  	 
  	
  	 
  	 
	 */
	
	
	
	
	
	//3.사람 여러명을 관리할 수 있는 클래스를 작성해주세요 (이름으로 구분하도록)
	
	
	//4.물품을 관리할 수 있는 클래스를 만드세요
				
				
				
				
	
// 	void refund(Product p){
// 		if(item.isEmpty()){
// 			System.out.println("구매하신 물품이 없습니다");
// 			return;
// 		}
// 	}
//	
//	for(int i = 0; i < item.size();i++){
//		if(item.get(i)==p){
//			Product p2 =(Product)item.remove(i);
//			money += p2.price;
//			bonusPoint -= p2.bonusPoint;
//			System.out.println(p2+"를 반품하셨습니다.");
//			return;
//		} //반복문을 돌려서 
		
//	if(item.remove(p)){
//		money+=p.price;
//		bonusPoint -= p.bonusPoint;
//		System.out.println("p+를 반품하셨습니다");
//		return;
//	} else {
//		System.out.println("그런 물건 사신 적 없습니다");//맨 마지막꺼 지우는거
//	}
	
//	if(item.contains(p)){//반품하려고하는 객체를 포함하고 있으면 true
//		item.remove(p);
//		money+=p.price;
//		bonusPoint -= p.bonusPoint;
//		System.out.println("p+를 반품하셨습니다");
//		return;
//		
//	}
	
	
}
