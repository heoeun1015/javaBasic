package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptiopnHandling {

	public static void main(String[] args) {
		
		/*
		 * << 에러 >>
		 * - 컴파일 에러: 컴파일 시에 발생되는 에러 (빨간 줄) //문법적 오류
		 * - 논리적 에러: 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러: 실행 시에 발생되는 에러(우리가 처리할 에러)
		 
		 * << 런타임 에러 >>
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외: 프로그램 코드에 의해서 수습될 수 잇는 다소 미약한 오류(처리 가능)
		 
		 * << 예외 >>
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다. (unchecked 예외)
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 *   (checked 제외)
		   
		 * << 예외처리(try-catch) >>
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch (Exception e) {} //해당 오류가 일어난 클래스의 객체를 생성해준다.
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에는 처리할 예외를 지정해줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록  catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭 안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch 가 없을 경우 예외는 처리되지 않는다. 
		 */
		
		try {
			int result = 10 / 0; //예외가 발생한 위치에서 비정상적으로 종료된다.
			System.out.println(result); //예외 발생시 실행되지 않는다.
		} catch(ArithmeticException | IndexOutOfBoundsException e){ //처리할 예외를 적어준다.
			e.printStackTrace(); //예외 메세지를 출력한다. 예외를 처리한 건 아님.
			// printStackTrace 이외의 예외 처리 코드를 작성해주는 경우는 거의 없음.
			// 되게 중요한 처리를 해줄 것 같은데, 사실은 형식적으로 예외 처리를 할 때가 많다.
		} catch(NullPointerException e ){ // 참조형 타입에서 많이 발생함. 객체가 없는데 객체의 변수/메서드로 접근하려 할 때. 
			// 여러 종류의 예외를 처리하기 위해 catch를 하나 이상 사용할 수 있다.
		} catch(Exception e){ 
			// 예상치 못한 예외를 처리할 수 있다.
			// 모든 예외를 한번에 처리할 수 있다.
			// 편해서 보통 많이 사용한다.
		}
		
		
		//1. 처리할 예외가 두 개 이상이면 |로 구분해서 하나를 더 적어줄 수 있다.
		//2. 또는 catch 뒤에 catch 를 하나 더 추가해준다.
		
		/* 
		 * 
		Exception in thread "main" java.lang.ArithmeticException: / by zero
		: java.lang.ArithmeticException(파란색 글씨). 예외가 발생한 위치(클래스)
		: 문제: by zero / 0으로 나눴다.
		
		at g_exception.ExceptiopnHandling.main(ExceptiopnHandling.java:34)
		: 문제가 생긴 해당 클래스의 위치
		*/
		
		//※ 콘솔 오류 내용은 콜스택(call stack)에서 저장된 내용을 출력한다.
		
		test1();

	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} //예외 처리를 안 해주면 오류가 생긴다. 예외처리가 강제되는 경우. Ctrl + 1 눌러주기. 
	}

	/*  ※ 가장 윗 줄부터 내가 만든 메소드를 찾을 것. 예외가 발생된 곳을 찾자.
	 *  ※ 만약 모르는 메소드가 나오면, 내가 아는 게 있을 때까지 들어간다.
	        시스템 상의 문제가 아닐 가능성이 매우 높음. ex) Native Method
	 
		java.lang.ArithmeticException: / by zero
		at g_exception.ExceptiopnHandling.main(ExceptiopnHandling.java:35)
	Exception in thread "main" java.lang.ArithmeticException: / by zero
		at g_exception.ExceptiopnHandling.test2(ExceptiopnHandling.java:72)
		at g_exception.ExceptiopnHandling.test1(ExceptiopnHandling.java:68)
		at g_exception.ExceptiopnHandling.main(ExceptiopnHandling.java:63)
		
	 */
	
	
}


















