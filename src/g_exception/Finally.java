package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		
		/*
		 * << finally >>
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 *   (예외가 발생하지 않아도 발생한다. 마지막에 뭔갈 꼭 하고 싶다, 할 때 사용함.)
		 
		 * << 자동 자원 반환(try-with-resources) >>
		 * - try(변수 선언; 변수 선언){} catch(Exception e){}
		 * - 사용 후 반환이 필요한 객체를 try의 () 안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
		 */
		
		FileInputStream fis = null; //파일 읽기
		
		try {
			fis = new FileInputStream("file.txt");//컴파일 에러. 예외 처리를 해주지 않으면 발생한다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 예외 발생과 상관없이 반드시 처리해야 하는 내용을 넣어준다.
			// FileInputStream 는 한 번 사용을 하고 나면 반드시 닫아줘야 한다.
			try {
				fis.close(); //여기도 try-catch 를 사용해줘야 한다.
			} catch (Exception e) {  //IOException오류 났었다.
				e.printStackTrace();
			}
		}
		
		// 예외 발생: try → catch → finally
		// 예외 미발생: try → finally
		
		// 자동 자원 반환(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){ //컴파일 에러. catch 가 없어서.
			//try() 안에서 각체를 생성하면 try 종료시 자동 반환된다. FileInputStream의 경우 자동으로 close 를 해준다.
			//FileInputStream = 파일 생성. d드라이브에 file 이라는 이름의 텍스트 파일을 만들어준다.
			String str = "아무 내용이나 써보자...";
			byte[] bytes = str.getBytes();
			for(int i = 0; i < bytes.length; i++){
				fos.write(bytes[i]);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}


















