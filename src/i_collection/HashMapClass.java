package i_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		/* << HashMap >>
		 * put()	: 지정된 키와 값을 저장 //키, 값이 들어간다
		 * get()	: 지정된 키의 값을 반환(없으면 null)
		 * remove()	: 지정된 키로 저장된 값을 제거
		 * keySet()	: 저장된 모든 키를 Set으로 반환
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		//키를 지정하지 않으면 모든 타입을 넣어줄 수 있는데, 그럼 나중에 어떤 타입이 있는지 모르니까 대부분 키를 지정해준다.
		//String 타입을 많이 사용함.
		//객체, 클래스만 저장 가능함. ex)Integer
 		
		map.put("title", "제목입니다."); //title이라는 키로 '제목'이라는 값을 저장
		map.put("content", "내용입니다.");
		map.put("user", "최효은");
		map.put("date", "2019-10-16 09:29");
		
		System.out.println(map.get("title")); //출력
		System.out.println(map.get("content")); 
		System.out.println(map.get("user")); 
		System.out.println(map.get("date")); 
		System.out.println("-----------------------");
		
		map.put("user", "홍길동");
		System.out.println(map.get("user")); //값이 덮어씌워진다. 1개의 키에 여러 개의 값을 저장할 수 없다.
		map.put("user", "이순신");
		System.out.println(map.get("user"));
		
		map.remove("user"); //값을 삭제
		System.out.println(map.get("user")); //null
		System.out.println("-----------------------");
		
		//map에 저장된 모든 내용 출력
		Set<String> keys = map.keySet(); //HashMap을 String 값으로 지정해줬기 때문에 String으로 지정 
		System.out.println(keys + "1");
		for(String key : keys){ //keys를 key로 하나씩 저장하면서 돌린다.
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
		
		
		
	}

}












