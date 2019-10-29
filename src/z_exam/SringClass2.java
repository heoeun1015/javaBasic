package z_exam;

public class SringClass2 {

	public static void main(String[] args) {
		
		//String: 주어진 문자열을 갖는 String 인스턴스를 생성한다.
		String s = new String();
		
		//주어진 문자열을 갖는 String 인스턴스를 생성한다.
		char[] c = {'H','e','l','l','o'};
		
		//String (StringBuffer buf)
		//StringBuffer 인스턴스가 갖고 있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer ("Hello");
		String s1 = new String(sb);
		System.out.println("StringBuffer: " + s1);
		System.out.println("-----------------------");
		
		//String charAt(int index)
		//지정된 위치(index)에 있는 문자를 알려준다. (index는 0부터 시작)
		String s2 = "Hello";
		String n = "0123456";
		char c1 = s2.charAt(1);
		char c2 = n.charAt(1);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("-----------------------");
		
		//int compareTo(String str)
		//문자열과 사전순서로 비교한다. 같으면 0, 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("i: " + i);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("-----------------------");
		
		//String concat(String str)
		//문자열을 뒤에 덧붙인다.
		String s3 = "Hello";
		String s4 = s3.concat("World");
		System.out.println("s3: " + s3);
		System.out.println("s4: " + s4);
		System.out.println("-----------------------");
		
		//boolean contains(CharSequence s)
		//지정된 문자열이 포함되었는지 검사한다.
		String s5 = "abcdefg";
		boolean b = s5.contains("bc");
		System.out.println("b: " + b);
		System.out.println("-----------------------");
		
		//boolean endsWith(String suffix)
		//지정된 문자열로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println("b1: " + b1);
		System.out.println("-----------------------");
		
		//boolean equals(Object obj)
		//매개변수로 받은 문자열과 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s6 = "Hello";
		boolean b2 = s6.equals("Hello");
		boolean b3 = s6.equals("hello");
		System.out.println("b2: " + b2);
		System.out.println("b3: " + b3);
		System.out.println("-----------------------");
		
		//boolean equalsIgnoreCase(String str)
		//문자열과 String인스턴스의 문자열을 대소문자 구분없이 비교한다.
		String s7 = "Hello";
		boolean b4 = s7.equalsIgnoreCase("HELLO");
		boolean b5 = s7.equalsIgnoreCase("heLLo");
		System.out.println("b4: " + b4);
		System.out.println("b5: " + b5);
		System.out.println("-----------------------");
		
		//int indexOf(int ch)
		//주어진 문자가 문자열에 존재하는지 확인하여 위치를 알려준다. 못 찾으면 -1을 반환한다. (index는 0부터 시작)
		String s8 = "Hello";
		int idx1 = s8.indexOf('o');
		int idx2 = s8.indexOf('k');
		System.out.println("idx1: " + idx1);
		System.out.println("idx2: " + idx2);
		System.out.println("-----------------------");
	
		//int indexOf(int ch, int pos)
		//주어진 문자가 문자열에 존재하는지 지정된 위치부터 확인하여 위치를 알려준다. 못 찾으면 -1을 반환한다. (index는 0부터 시작)
		String s9 = "Hello";
		int idx3 = s9.indexOf('e', 0);
		int idx4 = s9.indexOf('e', 2);
		System.out.println("idx3: " + idx3);
		System.out.println("idx4: " + idx4);
		System.out.println("-----------------------");

		//int indexOf(String str)
		//주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다. 없으면 -1을 반환한다. (index는 0부터 시작)  
		String s10 = "ABCDEFG";
		int idx = s10.indexOf("CD");
		System.out.println("idx: " + idx);
		System.out.println("-----------------------");
		
		//String intern()
		//문자열을 상수풀에 등록한다. 이미 상수풀에 같은 내용의 문자열이 있을 경우 그 문자열의 주소값을 반환한다.
		String s11 = new String("abc");
		String s12 = new String("abc");
		boolean b6 = (s11==s12);
		boolean b7 = s11.equals(s12);
		boolean b8 = (s11.intern() == s12.intern());
		System.out.println("b6: " + b6);
		System.out.println("b7: " + b7);
		System.out.println("b8: " + b8);
		System.out.println("-----------------------");
		
		
		//int lastindexOf(int ch)
		//지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서 위치를 알려준다. 못 찾으면 -1을 반환한다.
		String s13 = "java.lang.Object";
		int idx5 = s13.lastIndexOf('.');
		int idx6 = s13.indexOf('.');
		System.out.println("idx5: " + idx5);
		System.out.println("idx6: " + idx6);
		System.out.println("-----------------------");
		
		//int lasindexOf(String str)
		//지정된 문자 또는 문자코드를 문자열의 끝에서부터 찾아서 위치를 알려준다. 못 찾으면 -1을 반환한다.
		String s14 = "java.lang.java";
		int idx7 = s14.lastIndexOf("java");
		int idx8 = s14.indexOf("java");
		System.out.println("idx7: " + idx7);
		System.out.println("idx8: " + idx8);
		System.out.println("-----------------------");
		
		//int length()
		//문자열의 길이를 알려준다.
		String s15 = "Hello";
		int length = s15.length();
		System.out.println("lengh: " + length);
		System.out.println("-----------------------");
		
		//String replace(char old, char nw)
		//문자열 중의 문자를 새로운 문자로 바꾼 문자열을 반환한다.
		String s16 = "Hello";
		String s17 = s16.replace('H', 'C');
		System.out.println("s17: " + s17);
		System.out.println("-----------------------");
		
		//String replace(CharSequence old, CharSequence nw)
		//문자열 중의 문자열을 새로운 문자열로 모두 바꾼 문자열을 반환한다.
		String s18 = "Hellollo";
		String s19 = s18.replace("ll", "LL");
		System.out.println("s19: " + s19);
		System.out.println("-----------------------");
		
		//String replcaeAll(String regex, String replacement)
		//문자열 중에서 지정된 문자열과 일치하는 것을 새로운 문자열로 모두 변경한다.
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println("r: " + r);
		System.out.println("-----------------------");
		
		//String replaceFirst(String regex, String relacement)
		//문자열 중에서 지정된 문자열과 일치하는 것 중, 첫 번째 것만 새로운 문자열로 변경한다.
		String ab2 = "AABBAABB";
		String r2 = ab2.replaceFirst("BB", "bb");
		System.out.println("r2: " + r2);
		System.out.println("-----------------------");
		
		//String[] split(String regex)
		//문자열을 지정한 분리자로 나누어 문자열 배열에 담아 반환한다.
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		for(int k = 0; k < arr.length; k++){
			System.out.println("arr[" + k + "] = " + arr[
			                                             k]);
		}System.out.println("-----------------------");
		
		//String split(String regex, int limit)
		//문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다. 단, 문자열 전체를 지정된 수로 자른다.
		String[] arr2 = animals.split(",", 2);
		for(int j = 0; j < arr.length - 1; j++){
			System.out.println("arr2[" + j + "] = " + arr2[j]);
		}System.out.println("-----------------------");
		
		//boolean startsWith(String prefix)
		//주어진 문자열로 시작하는지 검사한다.
		String s20 = "java.lang.Object";
		boolean b9 = s20.startsWith("java");
		boolean b10 = s20.startsWith("lang");
		System.out.println("b9: " + b9);
		System.out.println("b10: " + b10);
		System.out.println("-----------------------");
		
		//String substring(int begin)
		//String substring(int beginm int end)
		//주어진 시작위치부터 끝 위치 범위에 포함된 문자열을 얻는다. 끝 위치의 문자는 포함되지 않는다.
		String s21 = "java.lang.Object";
		String c5 = s21.substring(10);
		String p6 = s21.substring(5,9);
		System.out.println("c5: " + c5);
		System.out.println("p6: " + p6);
		System.out.println("-----------------------");
		
		//String toLowerCase()
		//String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s22 = "Hello";
		String s23 = s22.toLowerCase();
		System.out.println("s23: " + s23);
		System.out.println("-----------------------");
		
		//String toString()
		//String 인스턴스에 저장되어 있는 문자열을 반환한다.
		String s24 = "Hello";
		String s25 = s24.toString();
		System.out.println("s25: " + s25);
		System.out.println("-----------------------");
		
		//String toUpperCase()
		//String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String s26 = "Hello";
		String s27 = s26.toUpperCase();
		System.out.println("s27: " + s27);
		System.out.println("-----------------------");
		
		//String trim()
		//문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 중간의 공백은 제거되지 않는다.
		String s28 = "   Hello World   ";
		String s29 = s28.trim();
		System.out.println("s29: " + s29);
		System.out.println("-----------------------");
		
		//static String calueOf(boolean b)
		//static String calueOf(char c)
		//static String calueOf(int i)
		//static String calueOf(long l)
		//static String calueOf(float f)
		//static String calueOf(double d)
		//static String calueOf(Object o)
		//지정된 값을 문자열로 변환하여 반환한다. 참조변수의 경우, toString()을 호출한 결과를 반환한다.
		String b_1 = String.valueOf(true);
		String c_1 = String.valueOf('a');
		String i_1 = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println("b_1: " + b_1);
		System.out.println("c_1: " + c_1);
		System.out.println("i_1: " + i_1);
		System.out.println("l: " + l);
		System.out.println("f: " + f);
		System.out.println("d: " + d);
		System.out.println("date: " + date);
		
		
	}
	
}















