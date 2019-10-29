package f_oop2;

public class SampleParent extends Object{
	//아무것도 상속받지 않는 모든 클래스는 오브젝트라는 클래스를 상속 받는다.
	//적지 않아도 자동으로 생성된다. 

	String var;
	
	{
		var = "초기화 블럭은 물려주지 않는다.";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a + b;
	}
	
	
}
