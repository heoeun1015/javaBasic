package e_oop;

public class TV {

	public static void main(String[] args) {
		
		TV tv = new TV("samsung"); //파라미터를 설정해주지 않으면 오류가 난다.
		
		tv.channalUp();
		System.out.println(tv.channal);
		
		tv.power();
		tv.channalUp();
		System.out.println(tv.channal);
		
		
		tv.channalUp();
		tv.channalUp();
		tv.channalUp();
		tv.channalUp();
		System.out.println(tv.channal);
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		

	}

	
	//TV를 대상으로 가능한 TV와 비슷하게 TV 클래스를 만들어주세요.
	
	
	boolean power;
	boolean input;
	int soundVolume;
	int channal;
	int channalSum = 0;
	String brand; // 브랜드
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV(String brand){
		power = false;
		input = false;
		soundVolume = 5;
		channal = MIN_CHANNEL;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void input(){
		input = !input;
	}
	/*
	void soundVolumeUp(){
		if(soundVolume < MAX_VOLUME && power && !input);
			soundVolume++;
	}
	
	void soundVolumeDown(){
		if(soundVolume > MIN_VOLUME && power && !input);
			soundVolume--;
	}
	
	void soundVolumeSilently(){
		soundVolume = 0;
	}
	*/
	/*
	void channalUp(){
		if(channal <= MAX_CHANNEL && power && !input){
			channal++;
		}else if(channal > MAX_CHANNEL && power && !input){
			channal = 1;
		}
	}
	
	void channalDown(){
		if(channal >= 0 && power && !input){
			channal--;
		}else if(channal < 0 && power && !input){
			channal = 260;
		}
	}
	
	
	*/
	
	
	
	
	
	
	
	void channalInput(int channal){
		if(power){
			if(MIN_CHANNEL <= channal && channal <= MAX_CHANNEL){
				this.channal = channal;
			}
			System.out.println("채널 . " + this.channal);
		}
	}
	
	void channalUp(){
		channalInput(channal + 1);
	}
	
	void channalDown(){
		channalInput(channal - 1);
	}
	
	
	
	void volumeUp(){
		if(power){
			if(soundVolume < MAX_VOLUME){
				soundVolume++;
			}
			showVolume(soundVolume);
		}
	}
	
	void volumeDown(){
		if(power){
			if(soundVolume > MIN_VOLUME){
				soundVolume--;
			}
			showVolume(soundVolume);
		}
	}
	
	
	
	void showVolume(int volume){
		System.out.println("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if( i <= soundVolume){
				System.out.print("■");
		}else{
			System.out.print("□");
		}
		}
		System.out.println();
	}
	
	
	
	
	
}

	//과제. 클래스 하나로 간단한 프로그램을 만들어주세요.
	//발표: 프로그램 주제, 기능, 메서드 구성, 시연










