package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		
		
		Tv[] smartTv = new SmartTv[3];//1.스마트 티비 3대 저장하세요
//		smartTv[0] = new SmartTv();
		Tv st1 = new SmartTv();
		smartTv[0] = st1;
		
		
		smartTv[1] = new SmartTv();
		smartTv[2] = new SmartTv();
		
		
		ThreeDTv[] threedtv = new ThreeDTv[2];//2.ThreeDTv 2대 저장하세요
		threedtv[0] = new ThreeDTv();
		threedtv[1] = new ThreeDTv();
		
		AfreecaTv[] afreecatv = new AfreecaTv[4];//3.AfreecaTv 4대 저장하세요
		afreecatv[0] = new AfreecaTv();
		afreecatv[1] = new AfreecaTv();
		afreecatv[2] = new AfreecaTv();
		afreecatv[3] = new AfreecaTv();
		
		
		Tv[] t = new Tv[9];
		t[0] = (Tv)new SmartTv(); // Tv가 힘이 더 세서 캐스트연산자가 생략된 것 작은것에서 위로가는거라서 업캐스팅
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		
		
		SmartTv st4 = (SmartTv)t[2]; //작은것으로 가는건 다운캐스팅 (생략 불가)
		st4.internet(); 
		//인스턴스가 이미 만들어져서 바로 넣어줄 수 있음
		
		SmartTv tt = (SmartTv)new Tv();
		//인스턴스가 있는지 모르니까 넣어줄 수 없음
	}
}


class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
		
	}
	
	
	void channelUp(){
		channel++;
	}
	
}

class SmartTv extends Tv{
	void internet(){
		
		
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
		
	}
}


class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}

