package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		
		DoubleDice a = new DoubleDice(); //생성자가 없을 때 자동으로 만들어준다
		int result = a.throwDice();
		System.out.println(result);
		
		//throwDice 메서드를 호출하면됨
		//더블이라는 규칙이 있음(두개의 주사위가 같은 경우가 나오면 한번 더 하기) 더하기
		//재귀호출로 만들기
		
		
	}
}

class DoubleDice{
	
	//인스턴스메서드 throwDice 
	//주사위 두개를 던짐 랜덤이 필요함
	//던진 수의 나온 합을 리턴함
	
	int throwDice(){ //인자값이 없으므로 여기서는 매개변수를 넣어줄 필요가 없다 
		int a= (int)(Math.random()*6+1);
		int b= (int)(Math.random()*6+1);
		System.out.println(a+","+b);
		int result = 0;
		if(a==b){
			result= throwDice()+a+b;
		}else{
			result =a+b;			
		}
			return result;
	}

	
}

