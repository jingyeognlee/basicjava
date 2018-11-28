package F_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		String str = og.upMethod();
		
		
		
	}
}

class OverUp{
	int x = 3;
	int y = 3;
	
	String upMethod(){
		return "하이" +x+y;
	}
}

class OverGo extends OverUp{
	int z = 5;
	
	@Override
	String upMethod(){
		return x + y + z +"오버라이드";  //부모에있는 메서드 재정의해서 사용
	}
	
	//this 이 인스턴스에있는 지역변수와 전역변수 구별하기위해
	//super는 자식 내에서밖에 사용 못함
 String upMethod(int k){
	 return x + y + k + "오버로딩";
 }
}