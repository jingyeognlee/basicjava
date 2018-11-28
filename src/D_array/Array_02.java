package D_array;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.ArrayType;

public class Array_02 {
	public static void main(String[] args) {
		/*
		 1.정렬
		 -어떤 데이터를 빠르고 쉽게 찾기위해 순서대로 데이터들을 가지런히 나열하는 작업
		 -버블정렬,삽입정렬,선택정렬
		 
		 
		 2.버블정렬(bubble sort)
		 -인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
		 -회전이 진행됨에 따라 가장 큰 값이 뒤로 보내진다.
		 
		 
		 3.선택정렬 (Select sort)
		 -정렬의 대상에서 최솟값을 찾아 맨 앞의 내용과 교체하는 방식이다.
		 -회전이 진행됨에 따라 가장 작은 값이 앞에 확정된다.
		 */
		
		//1. 5,2,3,1,4 숫자 5개를 저장할 수 있는 변수를 선언 및 생성하세요.
		int[] c = new int[]{5,2,3,1,4};
		//2. 1회전만 진행하세요
		int x=0;
		
		if(c[0]>c[1]){
			c[0]=x;
			c[0]=c[1];
			c[1]=x;
		}
		
		
		
//	
//		//버블정렬 5,2,3,1,4 숫자 5개를 저장할 수 있는 변수를 선언 및 생성하세요
//		int[] bubble =new int[]{5,2,3,1,4};
//		
//		//1회전만 진행하세요
//		int[] a = new int[]{5,2,3,1,4};
//		for(int k=0; k<a.length-1;k++){ //k가 회전 의미
//			System.out.println(K+1+"회원");
//			for(int i=0; i<a.length-1-k;i++){ //변경횟수 확정개념.. 한회차마다 굳이 버블을 한번 더할 필요가 없어서 한칸씩 앞으로 감
//											//1회전때는 기준최대치 방이 3번방까지 2회전때는 기준최대치 방이 2번방까지
//				if(a[i]>a[i+1]){
//					a[i]=a[i+1];
//					a[i+1]=tmp;
//				}
//				for(int j=0; j<a.length; j++){
//					System.out.println(a[j]+" ");
//				}
//				System.out.println();
//			}
//		}
//		
		
		
		
//		int max = input[0];
//		for(int i=1; i<input.length; i++){
//			if(max < input[i]){
//				max = input[i];
				
		//선택정렬 
		int[] a = new int[]{5,2,3,1,4};

		int min = a[0];
		int minbang = 0;
		for (int i=1; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
				minbang = i;
			}
		}
		int temp = a[1];
		a[0] = a[minbang];
		a[minbang]= temp;
		System.out.println(Arrays.toString(a));
		//최솟값 방에 방번호만 가져오면 됨
		
		//2회차하기
		int min = a[0];
		int minbang = 0;
		for (int i=1; i < a.length; i++){
			if(min > a[i]){
				min = a[i];
				minbang = i;
			}
		}
		int temp = a[1];
		a[0] = a[minbang];
		a[minbang]= temp;
		System.out.println(Arrays.toString(a));
		
	
		
		
		
		
		
		
		
		
		
	}
}
