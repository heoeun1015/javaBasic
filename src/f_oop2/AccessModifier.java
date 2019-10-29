package f_oop2;

public class AccessModifier {

	public String publicVAr = "public : 접근 제한이 없음";
	protected String protectedVar = "protected: 같은 패키지 + 상속 받은 클래스에서 접근 가능";
	String defaultVar = "default: 같은 패키지에서만 접근 가능";
	private String privateVar = "private: 클래스 내에서만 접근 가능";
	
	
	public void publicMethod(){
		System.out.println(publicVAr);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	
	
}