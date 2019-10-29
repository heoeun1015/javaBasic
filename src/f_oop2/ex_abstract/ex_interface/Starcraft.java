package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(marine); //상속 받지 않아서 컴파일 에러가 발생함.
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(scv);
		
	}
}


class Unit{
	int hp; //현재 체력
	final int MAX_HP; //최대 체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{ // 부모 클래스 생성자 파라미터가 있어서 오류
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

 class SCV extends Unit implements Repairable{
	 SCV(){
		 super(60);
	 }
	 
	 void repair(Repairable r){
		 // 공통된 Repairable 을 넘겨준다. 문제는 부모 타입의 멤버만 사용할 수 있는데, 아무것도 없어서 사용이 불가함.
		 // 그래서 자식 타입으로 형변환을 해줘야 한다. 공통적으로 가지고 있는 Unit 으로 형변환 해줄 것.
		 // 파라미터로 수리할 유닛의 이름을 받아 수리해준다. 마린은 수복 불가. 공통적인 Unit 은 사용할 수 없음.
		 
		 //Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		 //그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		 //hp를 멤버로 가진 Unit으로 형변환을 해주어야 한다.
		 
		 //instanceof: 형변환이 가능한지 확인.
		 if(r instanceof Unit){ //r 이 Unit 의 인스턴스가 맞나? / Unit 으로 형변환이 가능한지 확인.
			 Unit u = (Unit) r;
			 
			 while(u.hp < u.MAX_HP){
				 u.hp++; //최대치가 될 때까지 1씩 증가.
			 }
		 }
		 
	 }
 }

 
 interface Repairable{ //SCV 가 수리할 수 있는 유닛들에게 상속 받을 수 있게 한다.
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 