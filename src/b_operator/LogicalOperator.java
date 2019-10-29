package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * << 논리 연산자 >>
		 * - &&(AND)	: 피연산자 둘 다 true이면 true를 결과로 얻는다.
		 * - ||(OR)		: 피연산자 중 하나라도 true이면 true를 결과로 얻는다.
		 * - !(NOT)		: 피연산자가 true이면 false를, false이면 true를 결과로 얻는다.
		 * - 피연산자로는 boolean만 허용한다. 
		 */
		
		boolean b;
		
		int a = 6;
		//a가 0초과이고 10이하인가?
		b = 0 < a && a <=10;
		//b = true && true;
		//b = true; //연산 결과
		System.out.println(b);
		//a가 2의 배수이거나 3의 배수인가?
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println(b);
		//a가 2의 배수이거나 3의 배수이고 10이하인가?
		b = (a % 2 == 0 || a % 3 == 0) && a <= 10;
		System.out.println(b);
		//&&의 우선순위가 높기 때문에 우선순위를 바꾸기 위해 괄호를 사용해야 한다.
		
		char c = 'l';
		//c는 숫자인가?
		b = '0' <= c && c <= '9'; //0과 9사이에 있는 숫자
		System.out.println(b);
		//c는 영문소문자인가?
		b = 'a' <= c && c <= 'z';
		System.out.println(b);
		//c는 영문자인가?
		b = ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
		System.out.println(b);
		
		//논리연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;
		b = true && false;
		b = false && true;
		b = false && false;
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;
		
		int d = 10;
		b = d < 10 && 0 < d++; //d++ 연산이 수행되지 않는다.
		System.out.println(d); //d++ 같은 연산은 최대한 사용하지 않는 것이 좋다.
		
		b = !b; //b가 true이면 false를, false이면 true를 저장한다.
		b = !(10 < 20); //조건식의 결과를 반대로 저장한다. //조건식 바로 앞에 !를 붙일 수 없으니 괄호를 넣어줄 것.
		System.out.println(b);
		
		int x = 1, y= 2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		//산술연산 > 비교연산 > 논리연산(&&부터) 순으로 우선순위가 높다.
		System.out.println(b);
		
		//★ 다음의 문장들을 코드로 작성해주세요.
		//x가 2의 배수이고 10보다 작은가?
		b = x % 2 == 0 && x < 10;
		System.out.println(b);
		//x가 2의 배수이거나 3의 배수이거나 5의 배수인가?
		b = x % 2 == 0 || x % 3 == 0 || x % 5 == 0;
		System.out.println(b);
		
		
	}

}
