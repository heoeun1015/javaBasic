package f_oop2;

public class SampleChild extends SampleParent {
	//이미 부모 클래스의 선언된 변수를 가지고 있다.
	//Object = 모든 클래스의 조상격. 부모로부터 상속 받았기 때문에 그 Object 클래스도 같이 받는다.
	
	//타입/이름 상관없이 똑같은 변수를 선언할 수 있다.
	int var; //컴파일 에러가 발생하지 않는다.
	
	
	SampleChild() {
		super(); //부모 클래스의 생성자를 호출하기 위해 사용한다. 그래서 부모 클래스의 변수들도 초기화가 된다.
				 //물려줬다기 보다는 호출해서 사용한 경우.
//		this();
	}
	
	
	void test(double var){
		System.out.println(var); //지연변수
		System.out.println(this.var); //인스턴스 변수
		System.out.println(super.var); //부모 클래스의 인스턴스 변수
		//super: 부모 클래스의 멤버와 자식 클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}

	
	void childMethod(){
		//상속 받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var); //상속 받은 변수
		int result = method(7, 13); //상속 받은 메서드
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		sc.childMethod();
		System.out.println("-----------------------");
		
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		System.out.println("-----------------------");
		
		sc.test(10);
		System.out.println("-----------------------");
		
		//SampleParent sp2 = new SampleParent();
		SampleParent sp = (SampleParent) new SampleChild(); //형변환이 있긴 한데 생략되었다. 자식 클래스 → 부모 클래스: 업 캐스팅
		System.out.println("sp.var: " + sp.var); //부모클래스
		System.out.println("sc.var: " + sc.var); //자식클래스
		System.out.println("sp.method(): " + sp.method(5, 10));	//오버라이딩 하게 되면 부모클래스의 메서드는 무시된다.
		System.out.println("sc.method(): " + sc.method(5, 10));
//		sp.test(); //없음. 타입에 해당하는 멤버만 사용할 수 있음.
		System.out.println("-----------------------");
		
		SampleChild s = (SampleChild)sp; //형변환. 부모 클래스 → 자식 클래스: 다운 캐스팅 (생략불가)
		// 
		s.childMethod(); //호출할 수 있게 된다.
	}
	
	
	//상속 받은 메서드를 변경하고 싶을 때 오버라이딩 할 수 있다.
	
	//오버라이딩: 상속 받은 메서드의 내용을 재정의 하는 것
	@Override //어노테이션. @로 시작하는 것.
	int method(int a, int b){ //리턴타입/메서드명/파라미터 모두 같아야 한다. 똑같이 선언. 내용만 달라지게끔.
		return a * b;
	}
	
}
