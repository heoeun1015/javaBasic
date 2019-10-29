package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionFramework {

	public static void main(String[] args) {
		
		/*
		 * << CollectionsFramewrk >>
		 * - Collections	: 다수의 데이터
		 * - Framework		: 표준화된 프로그래밍 방식
		 
		 * << List >> //가장 배열하고 비슷
		 * - Vector			: ArrayList의 구버전
		 * - ArrayList*		: 저장순서 유지, 중복 허용 //읽는게 빠르다 - 추가삭제가 느리다
		 * - LinkedList		: 데이터 추가 및 삭제시간 단축 //추가 삭제하는게 빠르다 - 읽는게 느리다
		 * - Stack			: LIFO(Last In First Out)
		 * - Queue			: FIFO(First In First Out)
		 
		 * << Set >>
		 * - HashSet		: 중복 허용 안 함, 저장순서 유지 안 함 //인덱스가 없다
		 * - TreeSet		: 정렬, 검색 기능 향상
		 
		 * << Map >>
		 * - HashTable		: HashMap의 구버전
		 * - HashMap*		: 키(key)와 값(value)을 한 쌍으로 저장 //인덱스 대신 키로
		 * - TreeMap		: 정렬, 검색 기능 향상	
		 */
		
		

		//★ 우리반 모두의 석차를 구하시오.
		
		
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로 생성시켜 주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을  출력해주세요.
		 * 
		 * 석차 이름	Java	Oracle	HTML	JQuery	JSP 	총점평균
		 * 1. 오동규	100		100		100		100		100		100
		 * 2. 오동규	100		100		100		100		100		100
		 * 3. 오동규	100		100		100		100		100		100
		 * 4. 오동규	100		100		100		100		100		100
		 * 5. 오동규	100		100		100		100		100		100
		 * 6. 오동규	100		100		100		100		100		100
		 * 7. 오동규	100		100		100		100		100		100
		 */
		
		ArrayList<String> student = new ArrayList<String>();
		
		student.add("오동규");
		student.add("박재욱");
		student.add("오제민");
		student.add("전보영");
		student.add("유지상");
		student.add("박신규");
		student.add("진주호");
		student.add("지원희");
		student.add("한승희");
		student.add("안정현");
		student.add("이이슬");
		student.add("이정은");
		student.add("이선욱");
		student.add("조건희");
		student.add("최효은");
		student.add("김혜정");
		student.add("김명성");
		student.add("신유진");
		student.add("조윤호");
		student.add("조아라");
		student.add("백운영");
		student.add("최도혁");
		student.add("김영호");
		student.add("박희제");
		student.add("현솔비");
		
		System.out.println(student);
		
		
		ArrayList<String> subject = new ArrayList<String>();
		
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("JQuery");
		subject.add("JSP");
		
		System.out.println(subject);
		
		ArrayList<ArrayList<Object>> scores = new ArrayList<ArrayList<Object>>();
		ArrayList<Integer> score = new ArrayList<Integer>();	
		
		for(int i = 0; i < subject.size(); i++){
			int random = (int)(Math.random() * 51) + 50;
			score.add(random);
		}
		
		int sum = 0, avg = 0;
		for(int i = 0; i < score.size(); i++){
			sum += score.get(i);
		}avg = sum / score.size();
		score.add(sum);
		score.add(avg);
		System.out.println(score);
		
		//score = new ArrayList<Double>(); //배열을 하나 더 만들어준다.
		
		
		
		
		
		
		
	}
}
