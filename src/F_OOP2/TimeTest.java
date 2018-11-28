package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();//앞은 포함 뒤는 미포함 형태
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour);//4
		
		t.setMinute(150);
		int minute = t.getMinute();
		System.out.println(t.getHour()+":"+minute); //6:30
		
		t.setSeconds(10000);
		int second = t.getSeconds();
		System.out.println(t.getHour()+":"+t.getMinute()+":"+second); // 9:36 : 40
	}
}


class Time{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){ //시간을 세팅하는 메서드
		if(hour >23){ //24 이상이되면 24로 나눠야함
			this.hour = hour%24;
		}else {
			this.hour = hour;
		}
	}
	int getHour(){ //시간값을 얻는 메서드
		return hour;
	}
	
	
	void setMinute(int minute){
		if(minute > 59){
			int h = hour+(minute/60);
			this.setHour(h);
			this.minute=minute%60;
		}else{
			this.minute=minute;
		}
		//this.setHour(hour+(minute/60));
		//this.minute=minute%60;
		
	}
	
	int getMinute(){
		return minute;
	}
	
	

	void setSeconds(int second){
		if(second>59){
			int m =minute+(second/60);
			this.setMinute(m);
			this.second=second%60;
		}else{
			this.second=second;
		}
	}

		
	int getSeconds(){
		return second;
	}
	
	public int getSecond() {
		return second;
	}
	
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
	
	
	
	

}
	
	
//	초 분 힌트는 메서드를 재활용하시오
//	겟아워  한줄 셋 //  미닛 셋 세컨즈 두줄
