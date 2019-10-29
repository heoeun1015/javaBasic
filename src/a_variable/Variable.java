package a_variable;

//Ctrl + Shift + o
import java.util.Scanner;//위치 지정


public class Variable {

	public static void main(String[] args) {
		/*
		 * << 변수 >>
		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * 
		 * << 사용 가능한 기본형 데이터의 종류 >>
		 * - 정수: byte(1), short(2), int(4), long(8)
		 * - 실수: float(4), double(8)
		 * - 문자: char(2)
		 * - 논리: boolean(1)
		 * 
		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지,
		 *   그것의 이름이 무엇인지 알려줘야 한다.
		 *   
		 * << 명명 규칙 >>
		 * - 블럭 안에서 변수명은 중복될 수 없다.
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_', '$')를 사용할 수 있다.
		 *   (한글 사용은 자제해야 함)
		 * - 대소문자가 구분되며 길이에 제한이 없다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다.
		 *   ※ 개발자들의 암묵적인 약속 ※
		 * - [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)
		 * - [클래스명의 첫 글자는 대문자로 한다.]
		 * - [패키지명은 모두 소문자로 한다.]  
		 */
		
		//변수 선언 방법: 데이터 타입 + 변수 이름
		byte abc;
		char moonja;
		
		//★ 모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		
		byte _byte;
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		char _char;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		//System.out.println(_byte); //컴파일 에러 발생(문법이 틀렸다)=프로그램을 실행할 수 없다.
		
		//=(대입 연산자): 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
		_byte = 127; //타입에 맞는 값을 저장해야 한다.
		_short = 30000;
		_int = 20;
		_long = 900L; //long 접미사: L
		_float = 3.14f; //float 접미사: f
		_double = 3.14; //double 접미사: d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화: 변수에 처음으로 값을 저장하는 것.
		
		
		System.out.println(_int);
		//Ctrl + F11: 프로그램 실행
		//F11: 디버그 실행
		
		_int = 30;
		System.out.println(_int);
		_int = 30 + 40;
		System.out.println(_int);
		_int = _short;
		System.out.println(_int);
		
		
		//★ 위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		_byte = 22;
		_short = 15000;
		_int = 66138712;
		_long = 1284864213540L;
		_float = 5.15f;
		_double = 2.78;
		_char = '나';
		_boolean = false;
		
		System.out.println(_byte);
		System.out.println(_short);
		System.out.println(_int);
		System.out.println(_long);
		System.out.println(_float);
		System.out.println(_double);
		System.out.println(_char);
		System.out.println(_boolean);
		
		//String: 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열: ""(큰따옴표)로 감싸진 문자
		String _String = new String("abcd");
		System.out.println(_String);
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * << 리터럴의 종류 >>
		 * - 숫자: 0, 10, -5, 3.14
		 * - 문자: '가', 'a', '0', ' '
		 * - 문자열: "가나다", "abc", "123", " ", ""
		 * - 그외: true, false, null
		 * 
		 * << 참조형 타입 >>
		 * - 기본형 타입을 제외한 모든 데이터 타입(배열, 클래스 등)
		 * - ex) String, ABC, Variable
		 * - 값이 변수에 저장되지 않고 따로 저장되며, 그 주소가 변수에 저장된다.
		 * - 변수의 크기는 4byte 이다.
		*/
		
		//기본값: *전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		      //*전역변수: 메서드 밖에 있는 변수. 지역변수: 메서드 안에 있는 변수.
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0f;
		_double = 0.0d;
		_char = '\u0000'; //' ':실제로 표현되는 값.  
		// *\ u: 유니코드 표현. 0000: 16진수 0 표현.
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //형변환: 데이터 타입을 변환하는 것
		
		System.out.println(_byte); //128 → -128 (오버플로우)
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte); //-129 → 127 (언더플로우)
		//표현범위가 큰 타입에서 작은 타입으로 형변환 할 경우 데이터가 손상될 수 있다.
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		//int는 소수점을 표현할 수 없으므로 소수점이 손실된다.
		
		//표현범위가 작은 타입에서 큰 타입으로 형변환 할 경우 데이터가 손실될 염려가 없다.
		//그러므로 형변환을 생략할 수 있다.
		
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		
		//★ 위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요. (3번 이상)
		
		_byte = (byte)_int;
		_int = (int)_long;
		_float = (float)_double;
		
		//★ 위에서 만든 변수들을 표현범위가 큰 타입으로 형변환 해주세요. (3번 이상)
		
		_int = _short;
		_int = _char;
		_int = _byte;
		_long = _int;
		_double = _float;
		
		//콘솔창에서 입력받는 방법
		Scanner s = new Scanner(System.in);
		/*System.out.println("문자열을 입력해주세요.");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열: " + input1);*/
		
/*		System.out.println("숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자: " + input2);*/
		
		//★ 문자열을 입력받고 입력받은 문자열을 출력해주세요.
		
		System.out.println("문자열을 입력해주세요.");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열: " + input1);
		
		//★ 숫자를 입력받고 입력받은 숫자를 출력해주세요.
		
		System.out.println("숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자열: " + input2);
		
		//★ 위에서 입력받은 문자열과 숫자를 더해서 출력해주세요.
		
		System.out.println("입력받은 문자열과 숫자열은: " + input1 + input2);
		//문자열과 다른 타입의 데이터를 더한 결과의 타입은 문자열이 된다.
		System.out.println("입력받은 문자열과 숫자열은: " + input1 + (input2 + 111));
		//우선순위를 정하면 숫자부터 더해지고 후 문자열이 된다.
		
		/*
		 * << 상수 >>
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX+NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용된다. 
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMVER = 100; //컴파일 에러 발생
		
		
	}

}















