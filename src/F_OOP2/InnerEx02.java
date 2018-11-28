package F_OOP2;

public class InnerEx02 {
	public static void main(String[] args) {
	
		Outer o = new Outer();
		Outer.Inner in=o.new Inner();
		in.method();  //method() 호출
		
		
	}
}





class Outer{
	
	
	int value = 10;
	
	
	class Inner{
		int value = 20;
		void method(){
			int value = 30;
			System.out.println(value); //30 지역 변수 -전역변수 -부모변수
			System.out.println(this.value); //20
			System.out.println(Outer.this.value); //10;
		}
		
	}
	
	
	
	
	
	
}