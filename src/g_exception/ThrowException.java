package g_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		/*
		  << 예외 발생시키기 >>
		 * - throw new Exception():
		 * - throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 */
		
		IOException ioe = new IOException();
		
		try {
			throw ioe; //예외를 고의로 발생시킬 수 있다. //컴파일 에러. try / catch
		} catch (IOException e) {
			e.printStackTrace();
		} // 예외 메세지: java.io.IOException에 의해 발생이 됐다.
		
		throw new NullPointerException("예외가 발생한 원인");
		// 컴파일 에러가 발생하지 않는다.
		// RuntimeException이냐 아니냐의 차이. 아니기 때문에 강제되지 않는다.
		// 생성자의 파라미터로 문자열을 날려주면 원인이 나오게 해줄 수 있다.
		
//		System.out.println("여기는 수행되지 않습니다.");
		
		// 예외가 발생했을 때, 어떻게 할 건지를 먼저 적어보는 것.
		// 코드를 테스트 하기 위해 쓰인다.
		
	}

}


















