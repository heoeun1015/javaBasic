package e_oop;

public class VariableInit {
	
	//명시적 초기화
	int var = 10;
	
	//초기화 블럭(메서드 밖에서 열어야 함)
	{
		var = 10;
		//복잡한 로직을 사용한 초기화가 필요할 때 사용한다.
	}
	
	//생성자
	
	VariableInit(int var){ //리턴을 해주면 안 된다.
//		var = 10;
		//파라미터를 받아 초기화 할 때 사용한다.
		//인스턴스를 생성하면서 하고싶은 작업이 있을 때 사용한다.
		//전역변수와 지역변수가 같이 있으면 지역변수가 우선된다.
		
		this.var = var;//전역변수
		//this: 클래스와 인스턴스 자신을 가리키는 변수. 괄호가 붙으면 생성자가 된다.
		//인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 인스턴스 변수 앞에 붙여서 사용한다.
	}
	
	//두 개를 만들면 둘 중 하나를 호출할 수 있다.
	//오버로딩: 같은 이름의 메서드를 정의하는 것.
	//System.out.print(b);//오버로딩의 예
	//파라미터의 개수나 타입이 달라야 한다.
	VariableInit() {
//		var = 100;
		this(100);//int 타입의 파라미터 한 개를 가지고 있는 생성자 하나를 호출한다.
		//this(): 생성자에서 다른 생성자를 호출할 때 사용한다.
		//this()는 생성자의 첫 줄에서만 사용한다.
		
		//생성자를 선언해주지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다. 하나라도 만들면 만들어주지 않음.
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


















