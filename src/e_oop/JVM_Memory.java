package e_oop;

public class JVM_Memory {

	/*
	 * << JVM 메모리 구조 >>
	 * - Method Area: 클래스가 저장된다.
	 * - Call Stack: 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap: 객체가 저장된다.
	 * 
	 * 운영체제 → 프로그램
	 * 운영체제 → JVM → 프로그램
	 * - 단점: 자바로 만들어진 프로그램은 느리다.
	 * - 장점: 운영체제가 달라지면 다른 프로그램은 두 개를 만들어야 하는데(코딩도 따로 해야 함)
	 		   자바는 JVM 만 바뀌고 코딩은 그대로 실행된다.
	 */
	
	
	/*
	 * << Method Area >>: 프로그램이 끝나야 삭제된다.
	 * - Static
	 * - Math
	 * - System
	 * - PrintStream
	 * - ClassMember: classVariable, ckassMethod (static이 붙어서)
	 * 
	 * << Call Stack >>
	 * - main(): cm1(변수 저장)(객체의 주소값이 들어있다. 참조하면 Heap)
	 * - random(): 내용을 수행하면 다음에 삭제 됨.
	 * - println(): 위와 같다. 실행 후 삭제.
	 * - println(): 실행 후 삭제.
	 * 
	 * << Heap >>: 참조하는 변수가 있으면 살아 있다. (main의 cm1 같은 참조)
	 * - cm1 = new ClassMember(): instanceVariable, instanceMethod(같이 저장 돼 있음)
	 * - cm2 = new ClassMember(): instanceVariable, instanceMethod(같이 저장 돼 있음)
	 *  
	 */
}









