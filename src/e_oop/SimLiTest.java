package e_oop;

import java.util.Scanner;

public class SimLiTest {

	Scanner s = new Scanner(System.in);
	
	// 9개의 질문을 9개의 메서드로 만들어주세요.
	
	void Q1(){
		System.out.println("==========");
		System.out.println("나는 금사빠다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q2();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q4();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q1();
		}
		
	}
	void Q2(){
		System.out.println("==========");
		System.out.println("연애할 때 끌려다니는 타입이다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q5();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q3();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q2();
		}
	}
	void Q3(){
		System.out.println("==========");
		System.out.println("데이트 코스는 미리 짜는게 편하다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q6();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q5();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q3();
		}
	}
	void Q4(){
		System.out.println("==========");
		System.out.println("감정기복이 크지 않다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q7();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q5();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q4();
		}
	}
	void Q5(){
		System.out.println("==========");
		System.out.println("감정 표현에 솔직한 편이다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q8();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q6();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q5();
		}
	}
	void Q6(){
		System.out.println("==========");
		System.out.println("활동적인 데이트가 좋다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q8();
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q9();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q6();
		}
	}
	void Q7(){
		System.out.println("==========");
		System.out.println("연락이 없어도 믿고 기다리는 편이다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			System.out.println("결과 A. 스페셜티 카페라떼 프리미엄 타입: 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		}else if(input_1.equals("N") || input_1.equals("n")){
			Q8();
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q7();
		}
	}
	void Q8(){
		System.out.println("==========");
		System.out.println("이성친구는 존재할 수 없다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			Q9();
		}else if(input_1.equals("N") || input_1.equals("n")){
			System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q8();
		}
	}
	void Q9(){
		System.out.println("==========");
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. ('Y' or 'N')");
		String input_1 = s.nextLine();
		if(input_1.equals("Y") || input_1.equals("y")){
			System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
		}else if(input_1.equals("N") || input_1.equals("n")){
			System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
		}else{
			System.out.println("'Y' 또는 'N'를 입력해주세요.");
			Q9();
		}
	}
	
	
	
	
	
	/*
	
			String Question1 = "나는 금사빠다.";
			String Question2 = "연애할 때 끌려다니는 타입";
			String Question3 = "데이트 코스";
			String Question4 = "나는 금사빠다.";
			String Question5 = "나는 금사빠다.";
			String Question6 = "나는 금사빠다.";
			String Question7 = "나는 금사빠다.";
			String Question8 = "나는 금사빠다.";
			String Question9 = "나는 금사빠다.";
			String Question10 = "나는 금사빠다.";
			
			String typeA = "타입 A";
			String typeB = "타입 B"; 
			String typeC = "타입 C"; 
			String typeD = "타입 D"; 
			
			//스캐너 생성
	
	
			void start(){
				System.out.println(Question1);
				String answer = s.nextLine();
				
				if(answer.equals("Y")){
					Question2();
				}else if(answer.equals("N")){
					Question3();
				}
				
			}
	
*/

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
