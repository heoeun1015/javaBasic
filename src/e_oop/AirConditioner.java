package e_oop;

public class AirConditioner {

	public static void main(String[] args) {
		
		
		AirConditioner aircon = new AirConditioner();
		
		aircon.tempratureUp();
		System.out.println(aircon.temperature);
		
		aircon.power();
		aircon.tempratureUp();
		System.out.println(aircon.temperature);
		
		aircon.tempratureDown();
		aircon.tempratureDown();
		System.out.println(aircon.temperature);
		
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);

	}

	//★ 온도가 18 ~ 30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을 때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	//경우의 수가 있을 땐 조건문!
	
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	void tempratureUp(){
		if(power){
//또는		if(power && temperature < 30){			
			if(temperature < 30){
				temperature++;
			}
		}
	}
	
	//온도 - 버튼
	void tempratureDown(){
		if(power){
			if(temperature > 18){
				temperature--;
			}
		}
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
			if(3 < ++airVolume){
				airVolume = 1;
			}
		}
	}
	
	
}
