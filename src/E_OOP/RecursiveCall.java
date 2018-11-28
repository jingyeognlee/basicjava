package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		factorial(4); //클래스에서 factorial 메서드를 호출해서 4라는 값
		long result = factorial(4); //여기서 인자값을 만약에 10000을 넣으면 스택오버플로우가 생긴다.
		System.out.println(result);
		
		int sum = 1;
		for(int i=4;i<5;i--){
			if(i==1){
				break;
			}else{
				sum*=i;
			}
		}
		
		int sum2 = 1;
		for(int i=1; i<5; i++){
			sum2 *= i;
		}
		System.out.println(sum2);
	
		System.out.println(sum);
		
		
		
			
		
		
	}




static long factorial(int num){ //아직 return값이 없어서
	long result = 0L;
	if(num == 1){
		result = 1;
	}else{
		result = num * factorial(num-1); //내 메서드 안에서 내 메서드를 다시 호출하는것 -> 재귀호출
	}
	return result;
	
	
	
	
		
	}


}