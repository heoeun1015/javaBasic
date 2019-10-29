package h_useful;

public class ObjectClass {

	public static void main(String[] args) {
		//toString(): 객체에 대한 정보를 문자열로 제공한다.
		
		ObjectClass oc = new ObjectClass();
		System.out.println(oc);
		//h_useful.ObjectClass@3654919e
		//클래스명 @ 해시코드(주소값, 16진수)
		
		
		
	}
	
	
	@Override
	public String toString(){
		return "toStirng() 메서드 호출";
	}
	

}
