package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("심리테스트입니다. 'Y'또는 'N'으로 답해주세요.");
		System.out.println("나는 금사빠다(금방 사랑에 빠진다).");
		String ans = s.nextLine();
		
		if(ans.equals("Y")){
		System.out.println("연애할 때 끌려다니는 타입이다."); //★
			ans = s.nextLine();
			if (ans.equals("Y")){
			System.out.println("감정 표현에 솔직한 편이다.");
				ans = s.nextLine();
				if (ans.equals("Y")){
				System.out.println("이성친구는 존재할 수 없다.");
					ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함을 느낀다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!"); //☆끝
						}else if(ans.equals("N")){
						System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
				}else if(ans.equals("N")){
				System.out.println("활동적인 데이트가 좋다.");
				}
			}else if(ans.equals("N")){
			System.out.println("데이트 코스는 미리 짜는게 편하다."); //☆
			}	ans = s.nextLine();
				if (ans.equals("Y")){
				System.out.println("활동적인 데이트가 좋다.");
					ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							ans = s.nextLine();
							if (ans.equals("Y")){
							System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							}else if(ans.equals("N")){
							System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!"); //☆ 끝
							}
						}else if(ans.equals("N")){
						System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					}	ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						}else if(ans.equals("N")){
						System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!"); // ☆ 끝
						}
				}else if(ans.equals("N")){
				System.out.println("감정 표현에 솔직한 편이다.");
				}	ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							ans = s.nextLine();
							if (ans.equals("Y")){
							System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							}else if(ans.equals("N")){
							System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
							}
						}else if(ans.equals("N")){
						System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("활동적인 데이트가 좋다.");
					}	ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
							ans = s.nextLine();
							if (ans.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								ans = s.nextLine();
								if (ans.equals("Y")){
								System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
								}else if(ans.equals("N")){
								System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
								}
							}else if(ans.equals("N")){
							System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
							}
						}else if(ans.equals("N")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						}	ans = s.nextLine();
							if (ans.equals("Y")){
							System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							}else if(ans.equals("N")){
							System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
							}
		}else if(ans.equals("N")){
		System.out.println("감정기복이 크지 않다."); //★
		}	ans = s.nextLine();
			if (ans.equals("Y")){
			System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				ans = s.nextLine();
				if (ans.equals("Y")){
				System.out.println("결과 A. 스페셜티 카페라떼 프리미엄 타입: 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
				}else if(ans.equals("N")){
				System.out.println("이성친구는 존재할 수 없다.");
				}	ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						}else if(ans.equals("N")){
						System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
			}else if(ans.equals("N")){
			System.out.println("감정 표현에 솔직한 편이다.");
			}	ans = s.nextLine();
				if (ans.equals("Y")){
				System.out.println("이성친구는 존재할 수 없다.");
					ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						}else if(ans.equals("N")){
						System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
					}
				}else if(ans.equals("N")){
				System.out.println("활동적인 데이트가 좋다.");
				}	ans = s.nextLine();
					if (ans.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
						ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							ans = s.nextLine();
							if (ans.equals("Y")){
							System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
							}else if(ans.equals("N")){
							System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
							}
						}else if(ans.equals("N")){
						System.out.println("결과 B. 스페셜치 카페라떼 타입: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
						}
					}else if(ans.equals("N")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
					}	ans = s.nextLine();
						if (ans.equals("Y")){
						System.out.println("결과 D. 아침에주스 유기농 타입: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
						}else if(ans.equals("N")){
						System.out.println("결과 C. 아침에주스 오렌지 타입: 이것은 의리인가 사랑인가… 친구같이 편안한 연애를 하는 타입!");
						}
		
			
			

		
	
		
		
	}

}
