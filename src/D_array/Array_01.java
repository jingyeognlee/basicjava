package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {

		/*
		 1.배열(array)이란?
		 -같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		  ex)5명의 점수
		  int score1 = 100;
		  int score2 = 50;
		  int score3 = 30;
		  int score4 = 70;
		  int score5 = 63;
		  같은 타입의 라면을 박스에 넣어서 묶어준다 그것이 배열
		 2.배열의 선언
		  -원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다.
		  
		  int[] a1; //int타입들을 많이 갖고있는 배열 이것을 봤을 때 참조형이라고 알면 된다
		  int a2[];
		 */
		
		/*
		 3.배열의 생성
		 -배열을 선언한 다음에는 배열을 생성해야 한다.
		 -배열 생성을 위해서는 'new'연산자와 함께 배열의 타입과 크기를 지정해주면 된다.
		 
		 */
//		int[] a = new int[3] //index 개념이라서 0부터 시작함 int가 3개 들어가있다는 뜻
							//
	/*	int[] a = new int[]{3,4,5}; //3,4,5 값이 int에 들어가있고 []에는 아무것도 안적어도 됨
		//이게 첫번째
						
		
		int[] a2;
		a2 = new int[]{3,4,5}
		//이게 두번째//
		
		int[] a3={3,4,5};
		//이게 세번째 */
		
		
		
		//new가 생략된 상태에서는 나눠지지가 않음
//		int[] a3;
//		a3 = {3,4,5}
		
		 
		int[]score = new int[4];
	//		System.out.println(score[0]);
	//		System.out.println(score[1]);
	//		System.out.println(score[2]);
	//		System.out.println(score[3]);
	
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}
		
		
		//1.score의 0번째 방에 10을 저장해주세요
				score[0] = 10;
		//2.score의 1번쨰 방에 20을 저장해주세요
				score[1] = 20;
		//3.score의 2번쨰 방에 30을 저장해주세요
				score[2] = 30;
		//4.score의 3번쨰 방에 40을 저장해주세요
				score[3] = 40;
				
		
		for(int i=0; i<score.length; i++){
			score[i] = (i+1)*10;
		}
					
		//1.207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요 (17명)
		int[] a = new int[17];
		//2.각 사람의 점수를 0에서 100점 사이의 랜덤한 정수 값으로 저장해주세요
//		a[0] = (int)Math.random()*101+0;
//		a[1] = (int)Math.random()*101+0;
//		a[2] = (int)Math.random()*101+0;
//		a[3] = (int)Math.random()*101+0;
//		a[4] = (int)Math.random()*101+0;
//		a[5] = (int)Math.random()*101+0;
//		a[6] = (int)Math.random()*101+0;
//		a[7] = (int)Math.random()*101+0;
//		a[8] = (int)Math.random()*101+0;
//		a[9] = (int)Math.random()*101+0;
//		a[10] = (int)Math.random()*101+0;
//		a[11] = (int)Math.random()*101+0;
//		a[12] = (int)Math.random()*101+0;
//		a[13] = (int)Math.random()*101+0;
//		a[14] = (int)Math.random()*101+0;
//		a[15] = (int)Math.random()*101+0;
//		a[16] = (int)Math.random()*101+0;
		
		for(int i=0; i<a.length;i++){
			a[i] = (int)(Math.random()*101);
		}
	
	
		//2.5. 각사람의 점수를 출력하세요
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
//		System.out.println(a[6]);
//		System.out.println(a[7]);
//		System.out.println(a[8]);
//		System.out.println(a[9]);
//		System.out.println(a[10]);
//		System.out.println(a[11]);
//		System.out.println(a[12]);
//		System.out.println(a[13]);
//		System.out.println(a[14]);
//		System.out.println(a[15]);
//		System.out.println(a[16]);
		
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
		
		//3.모든 사람의 합계를 구해주세요(0번방에서 꺼내오고 1번방에서 꺼내오고)
		int sum=0;
		
//		sum+=a[0];
//		sum+=a[1];
//		sum+=a[2];
//		sum+=a[3];
//		sum+=a[4];
//		sum+=a[5];
//		sum+=a[6];
//		sum+=a[7];
//		sum+=a[8];
//		sum+=a[9];
//		sum+=a[10];
//		sum+=a[11];
//		sum+=a[12];
//		sum+=a[13];
//		sum+=a[14];
//		sum+=a[15];
//		sum+=a[16];
//		
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		
		
		//1. 7개의 정수를 입력받아서 저장할 수 있는 변수 input을 선언 및 생성해주세요
		int[] input = new int[7];
		
		//2. input 변수의 각각의 방을 사용자로부터 입력받아 저장해주세요
		for(int i=0; i<input.length; i++){
			Scanner b1= new Scanner(System.in);
			System.out.println("숫자를 입력해주세요");
			input[i] = b1.nextInt();
		} //이게 입력한거
		
		for(int i=0; i<input.length; i++){
			System.out.println(input[i]); //이게 출력한거
		}
			
		//3.합계를 구하세요
		
		int sum1 = 0;
		for(int i=0; i<input.length; i++){
			sum1+=input[i];
		} 
		System.out.println(sum1);
		
		//4.소수점 셋째자리에서 반올림해서 소수점 둘째자리까지 평균을 구하시오
//		sum1/input.length*100할때 int 100나눌때 float
		
		float average =((int)((float)sum1/input.length*100+0.5))/100f;
		System.out.println(average);
		
		//5.최댓값, 최소값
		
		
//		if(max < input[1]){
//			max = input[1];
//		}
//		
//		if(max < input[2]){
//			max = input[2];
//		}
//		
//		if(max < input[3]){
//			max = input[3];
//		}
//		if(max < input[4]){
//			max = input[4];
//		}
//		if(max < input[5]){
//			max = input[5];
//		}
//		if(max < input[6]){
//			max = input[6];
//		}

		int max = input[0];
		for(int i=1; i<input.length; i++){
			if(max < input[i]){
				max = input[i];
			}
		}
		System.out.println("최댓값은 :" max);
		
		
//		if(min > input[1]){
//			min = input[1];
//		}
//		
//		
//		if(min > input[2]){
//			min = input[2];
//		}
//	
//		if(min > input[3]){
//			min = input[3];
//		}
//		
//		
//		if(min > input[4]){
//			min = input[4];
//		}
//	
//		if(min > input[5]){
//			min = input[5];
//		}
//		
//		
//		if(min > input[6]){
//			min = input[6];
//		}
//		
//	
		int min = input[0];
		for(int i=1; i<input.length; i++){
			if(min > input[i]){
			min = input[i];
			}	
		}
		System.out.println("최솟값은"+min);
		
		
	}
}
