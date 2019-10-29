package f_oop2.ex_abstract;
//들어오기 전 abstract 에 체크
public abstract class SampleAbstractParent {

	void method(){
		
	}
	
	//추상 메서드: 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod(); //abstract 이 붙은 메소드를 하나 이상 가지고 있다.
	
	
}

class SampleAbstractChild extends SampleAbstractParent{
		//위 추상클래스를 상속 받았다.
		//처음에 만들면 컴파일 오류가 뜨는데, 추상 메서드가 있기 때문에 구현을 해주어야 한다.
		//Add unimplemented methods 를 눌러준다.
	
		//추상 메서드를 상속 받으면 반드시 구현해야 한다.
		//상속 받은 추상 메서드를 추상 메서드로 남겨두려면 클래스를 추상 클래스로 변경해야 한다.
		//동일한 이름의 메서드인데, 구현 내용이 다를 때 추상 클래스를 사용한다.

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	} 
	
}