package h_useful;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스	: 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean		: Boolean
		 * char			: Character
		 * byte			: Byte
		 * short		: Short
		 * int			: Integer
		 * long			: Long
		 * float		: Float
		 * double		: Double		 
		 */
		
		//기본형 타입과 객체는 원래 연산을 할 수 없는데 Wrapper를 쓰면 가능하다.
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i + iw);
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); //상수로 가지고 있다.
		
		System.out.println(i + Integer.parseInt("20"));
		System.out.println(i + Integer.valueOf("20")); //둘 다 같다.
		
		System.out.println(i + String.valueOf("20"));
		
		
		
		Vector<Integer> v = new Vector<Integer>();
		//Integer 타입을 저장할 수 있는 배열. <> ← 제네릭.
		
		v.add(new Integer(10)); //add 메서드를 이요할 것.
		v.add(10); //오토박싱: 기본형타입이 wrapper 클래스로 자동 변환. 
		//형변환이 숨어있어 생략할 수도 있다.
		
		Integer integer = v.get(0); //get: 저장되어 있는 값을 가져올 때. 0번 인덱스 값을 가져온다.
		v.get(0); //언박싱: wrapper 클래스가 기본형 타입으로 자동 변환
		//int 타입에도 저장 가능. 형변환이 숨어 있다.
		
		
		
		
		
		
		
	}

}






