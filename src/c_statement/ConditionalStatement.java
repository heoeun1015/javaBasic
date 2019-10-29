package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		/*
		 * << if문 >>
		 * - if		: 조건식의 결과가 true이면 블럭 안의 문장을 수행한다.
		 * - else if: 다수의 조건이 필요할 때 if 뒤에 붙는다.
		 * - else	: 결과가 true이면 조건식이 하나도 없는 경우를 위해 추가한다. 
		 */
		
		
		int a = 10;
		
		if(a < 100){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 5; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1){
			gender = "남자";
		}else if(regNo == 2){
			gender = "여자";
		}else if(regNo == 3){
			gender = "남자";
		}else if(regNo == 4){ //if 블럭 뒤에 else if(){}로 조건을 추가할 수 있다.
			gender = "여자";
		}else{ //true인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 있다.
		if(regNo == 1 || regNo == 3){
			gender = "남자";
		}else if(regNo == 2 || regNo ==4)
			gender = "여자"; 
		else //시행하고 싶은 문장이 한 문장일 경우 블럭(중괄호) 생략 가능
			gender = "확인불가";
		
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		
		
		
		//★ 성적에 등급을 부여하는 프로그램을 만들어보자.
		int score = 100;
		String grade = null;
		
		if(90 <= score){
			grade = "A";
		}else if(80 <= score && score < 90){
			grade = "B";
		}else if(70 <= score && score < 80){
			grade = "C";
		}else if(60 <= score && score < 70){
			grade = "D";
		}else{
			grade = "F";
		}
		
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		//등급 안에서 +와 -를 나누어보자.
		score = 81;
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			}else if(score <= 93){
				grade += "-";
			}
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if(score <= 83){
				grade += "-";
			}
		}else if(70 <= score){
			grade = "C";
			if(77 >= score){
				grade += "+";
			}else if(score <= 73){
				grade += "-";
			}
		}else if(60 <= score){
			grade = "D";
			if(67 >= score){
				grade += "+";
			}else if(score <= 63){
				grade += "-";
			}
		}else{
			grade = "F";
		}

		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		
		
		
		/*
		 * << switch 문 >>
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 * - 조건식의 결과는 정수와 문자열 안(JDK1.7부터 문자열 허용) 허용한다. 
		 */
		
		
		regNo = 2;
		gender = null;
		switch(regNo){	//조건식의 연산결과는 정수와 문자열만 허용한다.
		case 1 :
		case 3 : //조건식과 일치하는 case문 이후의 문장을 수행한다.
			gender = "남자";
			break; //break를 만나면 switch문을 빠져나간다.
		case 2 :
		case 4 :
			gender = "여자";
			break;
		default: //if문의 else와 같은 역할을 한다.
			gender = "확인불가"; //break가 있어도 되고 없어도 된다.
		}
		
		System.out.println(gender);
		
		
		score = 95;
		switch(score / 10){ //원래 하나씩 만들어야 하는데 더 간편하게 하기 위함
		case 10 : grade = "A"; break;
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default:
			grade = "F";
		}
		
		System.out.println(score +"점의 등급은 " + grade + "입니다.");
		
		
		
		
		//★ 문제1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		Scanner s = new Scanner(System.in);
		
/*		System.out.println("숫자를 입력해주세요.");
		int input = Integer.parseInt(s.nextLine());
		
		if(input == 0){
			System.out.println("이 숫자는 0입니다.");
		}else{
			System.out.println("이 숫자는 0이 아닙니다.");
		}
		
		switch(input){
		case 0 :
			System.out.println("0입니다.");
			break;
		default :
			System.out.println("0이 아닙니다.");

		}*/

		
		
		//★ 문제2. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
/*		System.out.println("숫자를 입력해주세요.");
		int input2 = Integer.parseInt(s.nextLine());
		
		if(input2 % 2 == 0){
			System.out.println("이 숫자는 짝수입니다.");
		}else{
			System.out.println("이 숫자는 홀수입니다.");
		}
		
		
		switch(input2 % 2){
		case 0:	System.out.println("이 숫자는 짝수입니다."); break;
		default: System.out.println("이 숫자는 홀수입니다.");
		
		}
		*/
		
		//★ 문제3. 정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
	
		System.out.println("국어 점수를 입력해주세요.");
		int input_1 = Integer.parseInt(s.nextLine());
		System.out.println("수학 점수를 입력해주세요.");
		int input_2 = Integer.parseInt(s.nextLine());
		System.out.println("영어 점수를 입력해주세요.");
		int input_3 = Integer.parseInt(s.nextLine());
		
		int sum = input_1 + input_2 + input_3;
		System.out.println("총점: " + sum);
		
		double avg = (int)(sum/3 * 10 + 0.5) / 10.0;
				System.out.println("평균: " + avg);
		String grade_2 = null;
				
		if(avg >= 90){
			grade_2 = "A";
		}else if(avg >= 80 && avg < 90){
			grade_2 = "B";
		}else if(avg >= 70){
			grade_2 = "C";
		}else if(avg >= 60){
			grade_2 = "D";
		}else
			grade_2 = "F";
		
		System.out.println("등급: " + grade_2);
	}


}




















