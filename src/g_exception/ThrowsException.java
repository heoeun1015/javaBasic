package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		
		/*
		 * << 메서드에 예외 선언하기 >>
		 * - void method() throws Exception {}
		 *   	void method(): 이런 메소드를 호출하면
		 *   	throws Exception {}: 이런 예외가 발생할 수 있다.
		 * - 메서드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		 */
		
		
		/* ★ 중요한 것 두 가지
		 * 
		 * 1. 예외가 어디서 발생하는지
		 * 2. 예외를 처리하는 방법
		 *	- 나를 호출한 애한테 넘겨주거나 (Add throws declaration)
		 *	- try/catch 로 감싸주던가. (Surround with try/catch)
		 * 
		*/
		
		
		
		try {
			method(); //호출한 곳에서 에러가 발생한다.
		} catch (IOException e) {
			//넘겨받은 예외를 처리한다. try/catch 적어주기.
			e.printStackTrace();
		} 
		
	}

	private static void method() throws IOException { //예외를 처리하지 않고 넘겨준다.
		throw new IOException(); //여기서 try/catch를 적어주지 않는다. 호출한 main 으로 넘겨줬음.
	}

}


















