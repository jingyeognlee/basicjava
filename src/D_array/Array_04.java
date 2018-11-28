package D_array;

public class Array_04 {
	public static void main(String[] args) {
		//1. 6명의 7과목을 저장할 수 있는 변수 score를 선언 및 생성해주세요
		String[] name = new String[]{"이진경","김미란","김재은","이초연","박연욱","정다혜"};
		String[] sub = new String[]{"국어", "수학", "영어", "사회", "과학", "독일어", "한문"};
		int[][] score = new int[name.length][sub.length]; //스코어 선언한것
		int[] namesum = new int[name.length]; // 네임섬은 각 이름들의 성적의 합계를 저장한것으로 선언
		float[] nameavg = new float[name.length]; // 소수점 셋째자리에서 반올림하고 둘째자리까지 저장하기(그래서 float)	
		int[] subsum = new int[sub.length]; //서브섬은 과목들의 합계저장
		float[] subavg = new float[sub.length]; //과목 평균
		int[] rank = new int[name.length];//석차 등수
		
		
		//2.for문 및 실행
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j <score[i].length; j++){
				score[i][j] = (int)(Math.random()*101);
			}
		} //랜덤으로 0~100사이 뽑기
		
		
		for(int i=0; i<name.length; i++){
			for(int j=0; j<sub.length; j++){
				namesum[i]=namesum[i]+score[i][j];
			} //각 이름들 합계 저장하기
		}
		
		
		for(int i=0; i<name.length; i++){
			nameavg[i]=(int)((float)namesum[i]/sub.length*100)/100f;
		}//이름 합계들의 평균 저장
		
		
		
		for(int i=0; i<name.length; i++){
			for(int j=0; j<sub.length; j++){
				subsum[j] = subsum[j]+score[i][j];
			}
		} //각 과목들의 합계 저장
		
		for(int j=0; j <sub.length; j++){
			subavg[j]=(int)((float)subsum[j]/sub.length*100)/100f;
		}// 각 과목들의 평균을 저장 (소수둘째자리까지)
	
		
		
		
		for(int j=0; j <sub.length; j++){
			System.out.print("\t"+sub[j]);
		}
		
		
		for(int i=0; i<name.length; i++){
			int a = 1;
			for(int j=0; j<name.length; j++){
				if(namesum[i] < namesum[j]){
					a++;
				}
			}
			rank[i] = a;
		}
			
		
		
		//3.출력하기
		System.out.print("\t"+"합계"); //합계
		System.out.print("\t"+"학생평균"); //평균
		System.out.println("\t"+"석차");
		for(int i=0; i<score.length; i++){	//0번방에서 5번방까지 1씩 더함 총 6개의방
			System.out.print(name[i]+ "\t");//이게 학생이름 넣은것 학생이름은 0부터 6번방까지 있으니까 이름[i]
			for(int j=0; j <score[i].length; j++){	//0부터 7번방까지 1씩더함 총 7개의 방
				System.out.print(score[i][j]+ "\t");
			} //score i와 j를 출력했음
			System.out.print(namesum[i]); //합계 출력		
			System.out.print("\t"+nameavg[i]);//여기서 학생평균 출력
			System.out.println("\t"+rank[i]);
		}
		System.out.print("과목합계");
			for(int j=0; j<sub.length; j++){
				System.out.print("\t"+subsum[j]);
			}
			System.out.println();
		System.out.print("과목평균");
			for(int j=0; j<sub.length; j++){
				System.out.print("\t"+subavg[j]);
			}
		
		
	}
}
