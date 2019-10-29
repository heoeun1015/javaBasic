package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
		
		String str = "a";
		
		long start = System.currentTimeMillis(); //현재 시간의 밀리세컨드를 표현해준다.
		for(int i = 0; i < 10000; i++){
			str += "a";
		}
		long end =System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		
		//클래스를 많이 변경할 일이 있으면 StringBuffer 클래스를 사용하자.
		
//		long start = System.currentTimeMillis(); //현재 시간의 밀리세컨드를 표현해준다.
//		StringBuffer sb = new StringBuffer("a"); //파라미터를 넣어줘서 초기화
//		
//		for(int i = 0; i < 200000; i++){
//			sb.append("a"); //뒤에 문자열을 계속 붙인다.
//		}
//		long end =System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		
		
	}

}
