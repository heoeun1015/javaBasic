package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		
		/*
		 * << 객체지향 프로그래밍 >>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것.
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 *  << 객체 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것.
		 *  - new 클래스명(); → 객체가 저장된 메모리 주소 반환.
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *  - 객체는 생성될 때마다 새로운 객체가 생성되고, 여러 개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();//생성자 메서드
		
		sc.method1();
		
		sc.method2(10);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.test1();
		
		
		
		
		ClassMaker cm = new ClassMaker();
		
		cm.a();
		
		System.out.println(cm.b());
		
		cm.c("cde");
		
		System.out.println(cm.d(5, 12));
		System.out.println();
		
		
		
		
		
		Calculator c = new Calculator();
		
		double sum = c.add(123456, 654321);
		sum = c.multiply(sum, 123456);
		sum = c.divide(sum, 123456);
		sum = c.subtract(sum, 654321);
		sum = c.remainder(sum, 123456);
		System.out.println(sum);
		System.out.println();
		
		
		
		
		SimLiTest SLT = new SimLiTest();
		
		/*Scanner s = new Scanner(System.in);
		String ans = " ";
		*/
		
		SLT.Q1();
		
		
		
		
		
		
		
		

	}

}





























