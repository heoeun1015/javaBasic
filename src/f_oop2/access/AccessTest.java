package f_oop2.access;

import f_oop2.AccessModifier; //다른 패키지에 있기 때문에 import

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();

		System.out.println(am.publicVAr);
		am.publicMethod();
		
//		System.out.println(am.protectedVar); // 상속을 받아야만 사용 가능
//		am.protectedMethod();
//		밖에서 접근은 안 되고, 객체를(메서드, 안을) 통해서만 사용할 수 있다.
//		객체로 들어갔단 건, 밖에서 안으로 들어갔다는 뜻. main이 밖이란 의미는 아니다.
		
	}
	
	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod(); //상속을 받으니 사용 가능
		
//		System.out.println(defaultVar); //사용불가
//		defaultMethod();
		
//		System.out.println(privateVar); //사용불가
//		privateMethod();
	}

}
