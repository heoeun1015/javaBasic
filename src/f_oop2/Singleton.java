package f_oop2;

//싱글톤 패턴: 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
//객체들 간에 객체(클래스)를 공유하기 위해 사용한다.
//변수나 메서드를 공통적으로 전부 공유하기 위해 쓰인다.

public class Singleton {

	private static Singleton instance; //싱글톤이라는 인스턴스 변수를 만들었다. 공유해야 하기 때문.
	
	//생성자의 접근제어자를 private으로 만들어 다른 클래스에서 객체 생성하는 것을 막는다.
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){ //getInstance: 싱글턴 패턴으로 만들어진 클래스.
		//바로 접근해야 하기 때문에 static이 붙어 있다.
		if(instance == null){
			instance = new Singleton(); //처음이면 instance가 null 이라 객체 생성. 두 번째부터는 그냥 return.
		}
		return instance;
	}
	
}
