package C_sentence;

public class Sentence_03 {
	public static void main(String[] args) {

//		for(int i=1; i<10; i++){
//			System.out.println(2+"*"+i+"="+2*i);
//		}
//		
//		for(int i=1; i<10; i++){
//			System.out.println(3+"*"+i+"="+3*i);
//		}
//
//		for(int i=1; i<10; i++){
//			System.out.println(4+"*"+i+"="+4*i);
//		} 
//
//		for(int i=1; i<10; i++){
//			System.out.println(5+"*"+i+"="+5*i);
//		}
//
//		for(int i=1; i<10; i++){
//			System.out.println(6+"*"+i+"="+6*i);
//		}
//
//		for(int i=1; i<10; i++){
//			System.out.println(7+"*"+i+"="+7*i);
//		}
//
//			System.out.println(8+"*"+i+"="+8*i);
//		}
//		
//		for(int i=1; i<10; i++){
//			System.out.println(9+"*"+9+"="+9*i);
//		}
//		
		for(int l=2; l<10; l++){ //단을 먼저 고정시켜놓음 (그래서 바깥쪽에 있음)
			for(int i=1;i<10;i++){ 
				System.out.println(l+"*"+i+"="+l*i);
	
			}
		}
			for(int l=2; l<10; l++){
				for(int i=1; i<10; i++){
					if(l%2==0){
						System.out.println(l+"*"+i+"=");
					}					
				}
			}
			
			for(int l=2; l<10; l++){
				System.out.println(" ");
				if(i%2==0){
					for(j=1; j<10; j++){
						if(j%2==1){
							System.out.println(i+"*"+j+"="i*j);
						}
					}
				}
			}
		
			
	

		}
}

