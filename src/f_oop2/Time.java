package f_oop2;

public class Time {

	
	//Source - General getter and Setter - all Select - 확인
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour > 23){
			this.hour = 23;
		}else if(hour < 0){
			this.hour = 0;
		}else{
			this.hour = hour;
		}
	}
	
	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		if(minute > 59){
			this.minute = 59;
		}else if(minute < 0){
			this.minute = 0;
		}else{
			this.minute = minute;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second > 59){
			this.second = 59;
		}else if(second < 0){
			this.second = 0;
		}else{
			this.second = second;
		}
	}
	
	//메서드를 통해서는 접근할 수 있게 됐다.
	
	
	
	//오브젝트 클래스로부터 상속 받은 메서드. 주소 말고 시간을 출력하고 싶어서 바꿔줬다.
	// Generate - toString - 확인
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
	
	
}
