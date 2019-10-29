package f_oop2.ex_abstract.ex_interface;
//상수와 추상 메서드만 멤버로 가질 수 있다.
//이름은 다 똑같은데 내용이 달라질 때 구현하기 위해 사용한다.	

public interface SampleInterface {
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
	
	public static final int NUM1 = 1;
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();	
	
}

interface SampleInterface2{
	void method1();
	void method3();
}


	// 인터페이스는 메서드에 내용이 없기 때문에 메서드 명이 중복되어도 구분할 필요가 없다.
	// 그러므로 다중 상속이 가능하다.
class SampleImplement implements SampleInterface, SampleInterface2{ // 추상메서드가 있기 때문에 처음에 컴파일 에러 발생.
	// 클래스는 상속을 하나밖에 받을 수 없지만, 인터페이스는 추상 메소드를 상속받기 때문에 다중 상속을 받을 수 있다.
	// 추상 메서드는 내용이 없으니까 아무거나 호출해도 된다. = 여러 개를 동시에 상속받을 수 있다.
	
	// (용도)
	// 1. 팀끼리 협업을 할 때(분업). 여러 사람이 만든 클래스를 가져다 써야 할 때, 안 만들었으면 못 쓰니까 구현할 클래스를 인터페이스로 선언만 해둔다. 추상 메서드로.
	// 클래스를 만들고 싶으면 인터페이스를 상속 받아서 만들면 된다.
	// 2. 관련이 없는 클래스들끼리 관계를 만들어줄 수도 있다.
	// 3. 하나의 클래스로 여러 개 받을 때. 메서드 따로 선언 안 해도 되고 내용만 작성하면 됨.
	// 그런데 편하긴 한데 클래스 1개 만들려고 인터페이스 만드는 건 불필요. 그냥 선언하면 되는데.. 근데 사람에 따라선 쓰긴 함. 안 쓰기도 한다.
	
	@Override
	public void method1() {
		System.out.println(NUM1);
	}

	@Override
	public void method2() {
		System.out.println(NUM2);
	}

	@Override
	public void method3() {
		
	} 
	
}
