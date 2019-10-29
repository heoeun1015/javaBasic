package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		 * 정규표현식: 문자열의 패턴을 검사하는 표현식
		 
		 * ^	: 뒷 문자로 시작
		 * $	: 앞 문자로 종료
		 * .	: 임의의 문자(줄바꿈 제외)
		 * *	: 앞 문자가 0개 이상
		 * +	: 앞 문자가 1개 이상
		 * ?	: 앞 문자가 없거나 1개
		 * []	: 문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]: a부터 z가 아닌 것)
		 * {}	: 앞 문자의 개수({2}: 2개, {2,4}: 2개 이상 4개 이하)
		 * ()	: 그룹화(1개의 문자처럼 인식)
		 * |	: OR 연산
		 * \s	: 공백, 탭, 줄바꿈
		 * \S	: 공백, 탭, 줄바꿈이 아니니 문자
		 * \w	: 알파벳이나 숫자
		 * \W	: 알파벳이나 숫자가 아닌 문자
		 * \d	: 숫자
		 * \D	: 숫자가 아닌 문자
		 * (?i)	: 뒷 문자의 대소문자 구분 안함
		 * \	: 정규표현식에서 사용되는 특수문자 표현
		 */
		
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}"; //좁은 표현
//		String regex = "[a-z0-9]+"; //좀 더 광범위한 표현. 영문자와 소문자가 1개 이상 온다.
//		String regex = "\\w*"; //역슬러시를 두 번 넣어준 이유는 그냥 역슬러시 하나만 넣으면 정규표현식이 되지 않는다.
		String regex = ".*"; //어떤 문자열이 오든간에 통과가 되는 표현.
		//패턴을 만들 때는 최대한 좁게. 원하는 것만 걸러낼 수 있도록.
		
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str); //객체 반환
		
		System.out.println(m.matches());
		
		
		
		//★ 아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요. (회원가입)
		
		//1. 5 ~ 20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능한 정규식 표현.
		
		String str2 = "he6305";
		
		String regex_2 = "[a-z|0-9\\_\\-]{5,20}";
		
		Pattern p2 = Pattern.compile(regex_2);
		Matcher m2 = p2.matcher(str2);
		
		System.out.println(m2.matches());
		
		
		
		
		
	}

}


















