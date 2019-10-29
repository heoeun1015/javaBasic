package e_oop.class_making;

import java.util.Scanner;

public class Farm {

	public static void main(String[] args) {
		
		
		Farm farm = new Farm();
		
		
		
		farm.greet();
		
		
		

	}

	Scanner s = new Scanner(System.in);

	//물, 비료, 잡초 비용
	final int fertilizer = 100; //비료
	final int water = 20;
	final int weed = 80;
	
	//씨앗
	final int beet_sell = 60;
	final int potato_sell = 80;
	final int cabbage_sell = 100;
	final int gourd_sell = 120;
	final int melon_sell = 150;
	
	
	int level;
	int experience; 
	int money;
	int day;
	int day_2;
	int rain;
	
	
	boolean fer;
	boolean fer_1;
	boolean water_1;
	boolean level_1;
	
	//입력값
	String cname;
	String farm_name_1;
	String seed_input;
	int seed_input_2;
	
	
	//씨앗
	int beet_seed;
	int potato_seed;
	int cabbage_seed;
	int gourd_seed;
	int melon_seed;
	
	//작물
	int beet;
	int potato;
	int cabbage;
	int gourd;
	int melon;
	
	Farm(){
		
		money = 0;
		beet_seed = 1;
		potato_seed = 1;
		cabbage_seed = 0;
		gourd_seed = 0;
		melon_seed = 0;
		
		beet = 0;
		potato = 0;
		cabbage = 0;
		gourd = 0;
		melon = 0;
		
		day = 1;
		day_2 = 0;
		money = 500;
		experience = 0;
		level = 1;
		
		fer = false;
		fer_1 = true;
		water_1 = false;
		level_1 = false;
		
	}
	
	void greet(){
		System.out.println();
		System.out.println("▷ 농장 게임에 오신 것을 환영합니다.");
		System.out.println("▷ 게임을 시작하려면 START를 입력해주세요.");
		System.out.println(" (게임을 종료하시려면 '나가기' 또는 '종료'를 입력해주세요.)");
		System.out.println();
		System.out.println("---------------------------------");
		String inp = s.nextLine();
			if(inp.equals("start") || inp.equals("START") || inp.equals("스타트")){
				f1();
			}else if(inp.equals("나가기") || inp.equals("종료")){
				System.out.println("---------------------------------");
				game_fail();
			}else{
				greet();}
	}
	
	void f1(){
		System.out.println("---------------------------------");
			System.out.println();
			System.out.println("▷ 게임 안내를 도와드리겠습니다.");
			System.out.println();
			System.out.println("- 캐릭터 생성");
			System.out.println("- 농작물 키우기(땅 개간, 물주기, 비료주기, 잡초제거)");
			System.out.println("- 10레벨을 달성한 경우 게임 종료");
			System.out.println();
			System.out.println("('Y: 게임시작' or 'N: 돌아가기')");
			System.out.println();
			System.out.println("---------------------------------");
			String inp = s.nextLine();
				if(inp.equals("Y") || inp.equals("y") || inp.equals("네")){
					name();
				}else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
					greet();
				}else{
					f1();}
		}
	
	
	void name(){
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("▷ 캐릭터의 이름을 입력해주세요.");
		cname = s.nextLine();
		System.out.println();
		System.out.println("▷ [" + cname + "] 님이 맞습니까? ('Y' or 'N')");
		String inp = s.nextLine();
			if(inp.equals("Y") || inp.equals("y") || inp.equals("네")){
				farm_name();}
			else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
				name();}
	}
	
	
	
	void farm_name(){
		System.out.println();
		System.out.println("▷ 농장 이름을 입력해주세요.");
		farm_name_1 = s.nextLine();
		System.out.println();
		System.out.println("▷ [" + farm_name_1 + "] 농장이 맞습니까? ('Y' or 'N')");
		String inp = s.nextLine();
			if(inp.equals("Y") || inp.equals("y") || inp.equals("네")){
				guide_1();
			}else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
				farm_name();
			}else{
				System.out.println("게임을 종료합니다.");
				game_fail();
			}
			
	}
	
	
	void guide_1(){
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println("[" + farm_name_1 + " 농장] / [농장주: " + cname + "]");
		System.out.println();
		System.out.println("▷ 농작물을 기르기 위해선 땅에 씨앗을 심고 길러야 합니다.");
		System.out.println("  작물에 물을 주지 않으면 작물은 자라지 않으며,");
		System.out.println("  비료를 줄 경우 획득하는 경험치가 증가합니다.");
		System.out.println();
		System.out.println("▷ 소지한 금액이 0이 될 경우, 게임이 종료됩니다.");
		System.out.println("  게임이 종료된 경우엔 처음 화면으로 돌아가 다시 시작할 수 있습니다.");
		System.out.println();
		System.out.println("▷ 게임을 시작합니다. ('Y' or 'N')");
		System.out.println();
		System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals("Y") || inp.equals("y") || inp.equals("네")){
				gameMain();
			}else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
				game_fail();
			}else{
				System.out.println("다시 입력해주세요.");
				guide_1();
			}
			
	}
	
	
	void gameMain(){
		
		if(0<= experience && experience < 10 && level_1){level = 1;}
		else if(10<= experience && experience < 30 && level_1 && !(level == 2)){level = 2;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				beet_seed++; potato_seed += 2;
			System.out.println("- 비트 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 감자 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
				String inp = s.nextLine();
				if(inp.equals(" ")){}
		}
		else if(30<= experience && experience < 60 && level_1 && !(level == 3)){level = 3;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				cabbage_seed += 2;
			System.out.println("- 양배추 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}			
		else if(60<= experience && experience < 150 && level_1 && !(level == 4)){level = 4;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
			beet_seed++; potato_seed++; cabbage_seed += 2;
			System.out.println("- 비트 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 감자 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 양배추 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(150<= experience && experience < 210 && level_1 && !(level == 5)){level = 5;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				/*beet_seed += 2; potato_seed += 3; cabbage_seed += 3;
			System.out.println("- 비트 씨앗 2개를 획득하셨습니다.");
			System.out.println("- 감자 씨앗 3개를 획득하셨습니다.");
			System.out.println("- 양배추 씨앗 3개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");*/
				gourd_seed += 2;
			System.out.println("- 호박 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(210<= experience && experience < 280 && level_1 && !(level == 6)){level = 6;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				/*gourd_seed += 2;
			System.out.println("- 호박 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println("==================");*/
				cabbage_seed ++; gourd_seed ++;
			System.out.println("- 양배추 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 호박 씨앗 1개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(280<= experience && experience < 360 && level_1 && !(level == 7)){level = 7;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				/*cabbage_seed ++; gourd_seed += 2;
			System.out.println("- 양배추 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 호박 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");*/
				melon_seed ++;
			System.out.println("- 메론 씨앗 1개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(360<= experience && experience < 450 && level_1 && !(level == 8)){level = 8;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				/*melon_seed ++;
			System.out.println("- 메론 씨앗 1개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println("==================");*/
				gourd_seed++; melon_seed += 4;
			System.out.println("- 호박 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 메론 씨앗 4개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(450<= experience && experience < 550 && level_1 && !(level == 9)){level = 9;
			level_1 = false;
			System.out.println("==================");
			System.out.println();
			System.out.println("★    레벨이 오르셨습니다! Lv." + (level - 1) + " → Lv." + level + " ★");
			System.out.println();
				beet_seed++; potato_seed++; cabbage_seed++; gourd_seed++; melon_seed += 2;
			System.out.println("- 비트 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 감자 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 양배추 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 호박 씨앗 1개를 획득하셨습니다.");
			System.out.println("- 메론 씨앗 2개를 획득하셨습니다.");
			System.out.println();
			System.out.println("▷ 확인: (공백 입력)");
			System.out.println();
			System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){}
			}
		else if(experience > 550){level = 10;}
		
		
		
		day_2 = 0;
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("【 " + farm_name_1 + " 농장】 : Lv." + level + " " + cname);
		System.out.println();
		if(level < 2){
			item_menu();
		}else{end();}
		
	}
	
	
	void item_menu(){
		System.out.println("【 " + day + "일】");
		System.out.println();
		day_2 = 0;
		System.out.println("※ 씨앗의 경우, 수확까지 걸리는 일 수가 표시됩니다.");
		System.out.println();
		System.out.println("《 현재 아이템 목록 》");
		System.out.println();
		System.out.println("====【 씨앗 】====");
		System.out.println(" 소지 금액: " + money + "원");
			if(beet_seed != 0){System.out.println("- 비트 씨앗: " + beet_seed + "개" + "(1일)");}
			if(potato_seed != 0){System.out.println("- 감자 씨앗: " + potato_seed + "개" + "(1일)");}
			if(cabbage_seed != 0){System.out.println("- 양배추 씨앗: " + cabbage_seed + "개" + "(1일)");}
			if(gourd_seed != 0){System.out.println("- 호박 씨앗: " + gourd_seed + "개" + "(1일)");}
			if(melon_seed != 0){System.out.println("- 메론 씨앗: " + melon_seed + "개" + "(1일)");}
		System.out.println();
		System.out.println("===【 수확물 】===");
			if(beet != 0){System.out.println("- 비트: " + beet + "개");}
			if(potato != 0){System.out.println("- 감자: " + potato + "개");}
			if(cabbage != 0){System.out.println("- 양배추: " + cabbage + "개");}
			if(gourd != 0){System.out.println("- 호박: " + gourd + "개");}
			if(melon != 0){System.out.println("- 메론: " + melon + "개");}
		System.out.println();
		System.out.println("▷ 심을 씨앗을 선택해주세요.");
		System.out.println("▷ 물건을 팔고 싶은 경우엔 '되팔기'을 입력해주세요.)");
		System.out.println();
		System.out.println("---------------------------------");
			seed_input = s.nextLine();
			if(seed_input.equals("비트")){
				if(beet_seed > 0){
				beet_seed--;
				System.out.println("==================");
				System.out.println();
				System.out.println("- 비트를 심었습니다.");
				System.out.println();
				System.out.println("==================");
				item();
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 씨앗이 모자라 작물을 심을 수 없습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					item_menu();
				}
			}
			if(seed_input.equals("감자")){
				if(beet_seed > 0){
				potato_seed--;
				System.out.println("==================");
				System.out.println();
				System.out.println("- 감자를 심었습니다.");
				System.out.println();
				System.out.println("==================");
				item();
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 씨앗이 모자라 작물을 심을 수 없습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					item_menu();
				}
			}
			if(seed_input.equals("양배추")){
				if(cabbage_seed > 0){
				cabbage_seed--;
				System.out.println("==================");
				System.out.println();
				System.out.println("- 양배추를 심었습니다.");
				System.out.println();
				System.out.println("==================");
				item();
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 씨앗이 모자라 작물을 심을 수 없습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					item_menu();
				}
			}
			if(seed_input.equals("호박")){
				if(gourd_seed > 0){
				gourd_seed--;
				System.out.println("==================");
				System.out.println();
				System.out.println("- 호박을 심었습니다.");
				System.out.println();
				System.out.println("==================");
				item();
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 씨앗이 모자라 작물을 심을 수 없습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					item_menu();
				}
			}
			if(seed_input.equals("메론")){
				if(melon_seed > 0){
				melon_seed--;
				System.out.println("==================");
				System.out.println();
				System.out.println("- 메론을 심었습니다.");
				System.out.println();
				System.out.println("==================");
				item();
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 씨앗이 모자라 작물을 심을 수 없습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					item_menu();
				}
			}
			
			if(beet_seed == 0 && potato_seed == 0 && cabbage_seed == 0 && gourd_seed == 0 && melon_seed == 0){
				System.out.println("==================");
				System.out.println("보유하고 계신 씨앗의 개수가 0이 되었습니다.");
				game_fail();
				}
			
			if(seed_input.equals("되팔기")){
				sell_input();
			}else{
				item_menu();
			}
	}
	
	
	void sell_input(){
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("▷ 판매할 수확물의 종류를 입력해주세요. (씨앗 이름)");
		seed_input = s.nextLine();
		if(seed_input.equals("비트") || seed_input.equals("감자") || seed_input.equals("양배추") ||
			seed_input.equals("호박") || seed_input.equals("메론") || seed_input.equals("멜론")){
			sell_input_2();
		}else{
			System.out.println("다시 입력해주세요");
			sell_input();}
		
	}
	
	
	void sell_input_2(){
		
		System.out.println("▷ 판매할 수확물의 개수를 입력해주세요. (숫자)");
		seed_input_2 = Integer.parseInt(s.nextLine());
			if(seed_input.equals("비트")){
				if(seed_input_2 > beet){
					System.out.println("---------------------------------");
					System.out.println("- 보유하고 있는 작물의 개수보다 많습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					sell_input_2();
					}
			}if(seed_input.equals("감자")){
				if(seed_input_2 > potato){
					System.out.println("---------------------------------");
					System.out.println("- 보유하고 있는 작물의 개수보다 많습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					sell_input_2();
					}
			}if(seed_input.equals("양배추")){
				if(seed_input_2 > cabbage){
					System.out.println("---------------------------------");
					System.out.println("- 보유하고 있는 작물의 개수보다 많습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					sell_input_2();
					}
			}if(seed_input.equals("메론")){
				if(seed_input_2 > melon){
					System.out.println("---------------------------------");
					System.out.println("- 보유하고 있는 작물의 개수보다 많습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					sell_input_2();
					}
			}if(seed_input.equals("멜론")){
				if(seed_input_2 > melon){
					System.out.println("---------------------------------");
					System.out.println("- 보유하고 있는 작물의 개수보다 많습니다.");
					System.out.println("- 다시 입력해주세요.");
					System.out.println("---------------------------------");
					sell_input_2();
					}
			}else{sell();}
		
	}
	
	
	
	
	
	void item(){
		
		fer = false;
		water_1 = false;
		
		String inp = "";
		
			int tmp = 0;
				if(seed_input.equals("비트")){tmp = 1;}
				else if(seed_input.equals("감자")){tmp = 2;}
				else if(seed_input.equals("양배추")){tmp = 3;}
				else if(seed_input.equals("호박")){tmp = 4;}
				else if(seed_input.equals("메론")){tmp = 5;}
				
		if(money > 0){				
			switch(tmp){
			case 1: if(day_2 < 1){select();}
						if(fer_1){experience += 10; level_1 = !level_1; 
								beet++;
							System.out.println("==================");
							System.out.println();
							System.out.println("- 비트를 얻었습니다!");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
						}else{experience += 10 * 1.5;}
								level_1 = !level_1;
								beet++;
								fer_1 = true;
							System.out.println();
							System.out.println("  《대수확!》");
							System.out.println();
							System.out.println("- 질 좋은 비트를 얻으셨습니다.");
							System.out.println("  (획득 경험치가 *1.5배 증가합니다.)");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
			case 2: if(day_2 < 1){select();}
						if(fer_1){experience += 15; level_1 = !level_1; 
								potato++;
							System.out.println("==================");
							System.out.println();
							System.out.println("- 감자를 얻었습니다!");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
						}else{experience += 15 * 1.5;}
								level_1 = !level_1;
								potato++;
								fer_1 = true;
							System.out.println();
							System.out.println("  《대수확!》");
							System.out.println();
							System.out.println("- 질 좋은 감자를 얻으셨습니다.");
							System.out.println("  (획득 경험치가 *1.5배 증가합니다.)");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
			case 3: if(day_2 < 1){select();}
						if(fer_1){experience += 40; level_1 = !level_1; 
								cabbage++;
							System.out.println("==================");
							System.out.println();
							System.out.println("- 양배추를 얻었습니다!");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
							inp = s.nextLine();
							if(inp.equals(" ")){gameMain();}
						}else{experience += 40 * 1.5;}
								level_1 = !level_1;
								cabbage++;
								fer_1 = true;
							System.out.println();
							System.out.println("  《대수확!》");
							System.out.println();
							System.out.println("- 질 좋은 양배추를 얻으셨습니다.");
							System.out.println("  (획득 경험치가 *1.5배 증가합니다.)");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
				case 4: if(day_2 < 1){select();}
						if(fer_1){experience += 50; level_1 = !level_1;
								gourd++;
							System.out.println("==================");
							System.out.println();
							System.out.println("- 호박을 얻었습니다!");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
						}else{experience += 50 * 1.5;}
								level_1 = !level_1;
								gourd++;
								fer_1 = true;
							System.out.println();
							System.out.println("  《대수확!》");
							System.out.println();
							System.out.println("- 질 좋은 호박을 얻으셨습니다.");
							System.out.println("  (획득 경험치가 *1.5배 증가합니다.)");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
			case 5: if(day_2 < 1){select();}
						if(fer_1){experience += 70; level_1 = !level_1; 
								melon++;
							System.out.println("==================");
							System.out.println();
							System.out.println("- 멜론을 얻었습니다!");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
						}else{experience += 70 * 1.5;}
								level_1 = !level_1;
								melon++;
								fer_1 = true;
							System.out.println();
							System.out.println("  《대수확!》");
							System.out.println();
							System.out.println("- 질 좋은 메론을 얻으셨습니다.");
							System.out.println("  (획득 경험치가 *1.5배 증가합니다.)");
							System.out.println();
							System.out.println("▷ 확인: (공백 입력)");
							System.out.println();
							System.out.println("==================");
								inp = s.nextLine();
								if(inp.equals(" ")){gameMain();}
			}
		}else{
			System.out.println();
			System.out.println("▷ 보유하고 있는 돈을 전부 소진하셨습니다!");
			System.out.println("▷ 파산하여 농장을 운영할 수 없게 됐습니다.");
			System.out.println("▷ 다시 한 번 도전하고 싶으시면, 'replay' 를 입력해주세요.");
			System.out.println("  (게임을 종료하시려면 'N'을 눌러주세요.");
			System.out.println();
			System.out.println("---------------------------------");
				inp = s.nextLine();
				if(inp.equals("replay") || inp.equals("REPLAY")){
					greet();
				}else if(inp.equals("N") || inp.equals("n")){
					System.out.println("---------------------------------");
					game_fail();
				}
		}
				
	}
	
	
	void select(){
		if(fer && !water_1){
			select_2();
		}else if(!fer && water_1){
			select_3();
		}else if(fer && water_1){
			item();
		}else{
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("▷ 작물에 물이나 비료를 줄 수 있습니다. (보유 금액: " + money + "원)");
			System.out.println("  - 물: " + water + "원 / 비료: " + fertilizer + "원");
			System.out.println("▷ ('물' 또는 '비료'를 입력해주시고,");
			System.out.println("   하루를 종료하고 싶으시면 '종료'를 눌러주세요.)");
			System.out.println();
			System.out.println("---------------------------------");
				String inp = s.nextLine(); 
				if(inp.equals("물")){
					water();
				}else if(inp.equals("비료")){
					fertilizer();
				}else if(inp.equals("종료")){
					System.out.println("---------------------------------");
					System.out.println("▷ 물을 주지 않으면 작물이 자라지 않습니다.");
					System.out.println("▷ 정말 종료하시겠습니까?");
					System.out.println("---------------------------------");
						String inp_2 = s.nextLine();
					if(inp_2.equals("Y") || inp_2.equals("y") || inp_2.equals("네")){
						day++;
						item();
						System.out.println("---------------------------------");
					}else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
						select_2();
					}
				}else{
					System.out.println("---------------------------------");
					System.out.println("- 다시 입력해주세요.");
					select();
			}
		}
		
	}
	
	
	
	void select_2(){
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("▷ 작물에 물을 줄 수 있습니다. (보유 금액: " + money + "원)");
		System.out.println("  - 물: " + water + "원 / 비료: " + fertilizer + "원");
		System.out.println("▷ (하루를 종료하고 싶으시면 '종료'를 눌러주세요.)");
		System.out.println();
		System.out.println("---------------------------------");
			String inp = s.nextLine(); 
			if(inp.equals("물")){
				day_2++;
				day++;
				water();
			}else if(inp.equals("종료")){
				System.out.println("---------------------------------");
				System.out.println("▷ 물을 주지 않으면 작물이 자라지 않습니다.");
				System.out.println("▷ 정말 종료하시겠습니까?");
				System.out.println("---------------------------------");
					String inp_2 = s.nextLine();
				if(inp_2.equals("Y") || inp_2.equals("y") || inp_2.equals("네")){
					day++;
					item();
				}else if(inp.equals("N") || inp.equals("n") || inp.equals("아니오")){
					select_2();
				}
			}else if(inp.equals("비료")){
				System.out.println("---------------------------------");
				System.out.println("- 이미 비료를 주셨습니다.");
				System.out.println("- 다시 입력해주세요.");
				select_2();
			}else{
				System.out.println("---------------------------------");
//				System.out.println("- 다시 입력해주세요.");
				select_2();
			}
		
		
	}
	
	
	void select_3(){
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("▷ 작물에 비료를 추가로 줄 수 있습니다. (보유 금액: " + money + "원)");
		System.out.println("  - 물: " + water + "원 / 비료: " + fertilizer + "원");
		System.out.println("▷ (하루를 종료하고 싶으시면 '종료'를 눌러주세요.)");
		System.out.println();
		System.out.println("---------------------------------");
			String inp = s.nextLine(); 
			if(inp.equals("비료")){
				day_2++;
				day++;
				fertilizer();
			}else if(inp.equals("종료")){
				day_2++;
				day++;
				System.out.println("---------------------------------");
				item();
			}else if(inp.equals("물")){
				System.out.println("---------------------------------");
				System.out.println("- 이미 물을 주셨습니다.");
				System.out.println("- 다시 입력해주세요.");
				select_3();
			}else{
				System.out.println("---------------------------------");
				System.out.println("- 다시 입력해주세요.");
				select_3();
			}
		
	}
	
	
	
	void water(){
		double random = (int)(Math.random() * 100) + 1;
		if(random % 2 == 0){rain();}
		
		double random_2 = (int)(Math.random() * 100) + 1;
		if(random_2 % 2 == 0){
			System.out.println("---------------------------------");
				money -= water;
				water_1 = !water_1;
			System.out.println();
			System.out.println("- 작물에 물을 줬습니다.");
			System.out.println("- 작물이 싱싱해진 것 같습니다.");
			System.out.println();
			System.out.println("---------------------------------");
				weed();
		}else{
			System.out.println("---------------------------------");
				money -= water;
				water_1 = !water_1;
			System.out.println();
			System.out.println("- 작물에 물을 줬습니다.");
			System.out.println("- 작물이 싱싱해진 것 같습니다.");
			System.out.println();
			System.out.println("---------------------------------");
				select();}
	}
	
	
	void fertilizer(){
		System.out.println("---------------------------------");
			money -= fertilizer;
			fer = !fer;
			fer_1 = !fer_1;
			System.out.println();
			System.out.println("- 작물에 비료를 줬습니다.");
			System.out.println("- 작물이 건강하게 자라는 것이 보입니다.");
			System.out.println();
			System.out.println("---------------------------------");
			
			double random = (int)(Math.random() * 100) +1;
			if(random % 2 == 0){weed();}
			
			select();
	}
	

	void weed(){
		System.out.println("==================");
		System.out.println();
		System.out.println("《  잡초가 자랐습니다!》");
		System.out.println("- 잡초를 방치하면 작물을 수확할 수 없습니다.");
		System.out.println("- 80원으로 잡초 제거제를 사용했습니다.");
			money -= weed;
		System.out.println("(보유 금액: " + money + "원)");
		System.out.println();
		System.out.println("▷ 확인: (공백 입력)");
		System.out.println();
		System.out.println("==================");
			String inp = s.nextLine();
				if(inp.equals(" ")){select();
				}else{
					select();
				}
				
			
	}
	
	
	
	void rain(){
		System.out.println("==================");
		System.out.println();
		System.out.println("《 비가 내리고 있습니다!》");
		System.out.println("- 비가 오는 날은 물을 따로 주지 않아도 됩니다.");
		System.out.println();
			water_1 = !water_1;
		System.out.println("▷ 확인: (공백 입력)");
		System.out.println();
		System.out.println("==================");
			String inp = s.nextLine();
			if(inp.equals(" ")){
				double random_2 = (int)(Math.random() * 100) + 1;
					if(random_2 % 2 == 0){weed();
					}else{select();}
			}else{
				double random_2 = (int)(Math.random() * 100) + 1;
				if(random_2 % 2 == 0){weed();
				}else{select();}
			}
	}
	
	
	
	void sell(){
		int sum = 0;
		int tmp = 0;
			if(seed_input.equals("비트")){tmp = 1;}
			else if(seed_input.equals("감자")){tmp = 2;}
			else if(seed_input.equals("양배추")){tmp = 3;}
			else if(seed_input.equals("호박")){tmp = 4;}
			else if(seed_input.equals("메론")){tmp = 5;}
			else if(seed_input.equals("멜론")){tmp = 5;}
			
			
		switch(tmp){
		case 1: money += seed_input_2 * beet_sell;
					System.out.println();
					System.out.println("==================");
					System.out.println("비트: " + beet_sell + "원");
					System.out.println();
					System.out.println("- 판매 금액: " + seed_input_2 * beet_sell + "원");
					System.out.println("- 소지 금액: " + money + "원");
					System.out.println();
						beet -= seed_input_2;
					System.out.println("▷ 확인: (공백 입력)");
					System.out.println("==================");
						String inp = s.nextLine();
						if(inp.equals(" ")){gameMain();}
		case 2: money += seed_input_2 * potato_sell;
					System.out.println();
					System.out.println("==================");
					System.out.println("감자: " + potato_sell + "원");
					System.out.println();
					System.out.println("- 판매 금액: " + seed_input_2 * potato_sell + "원");
					System.out.println("- 소지 금액: " + money + "원");
					System.out.println();
					potato -= seed_input_2;
					System.out.println("▷ 확인: (공백 입력)");
					System.out.println("==================");
						inp = s.nextLine();
						if(inp.equals(" ")){gameMain();}
		case 3: money += seed_input_2 * cabbage_sell;
					System.out.println();
					System.out.println("==================");
					System.out.println("양배추: " + cabbage_sell + "원");
					System.out.println();
					System.out.println("- 판매 금액: " + seed_input_2 * cabbage_sell + "원");
					System.out.println("- 소지 금액: " + money + "원");
					System.out.println();
						cabbage -= seed_input_2;
					System.out.println("▷ 확인: (공백 입력)");
					System.out.println("==================");
						inp = s.nextLine();
						if(inp.equals(" ")){gameMain();}
		case 4: money += seed_input_2 * gourd_sell;
					System.out.println();
					System.out.println("==================");
					System.out.println("호박: " + gourd_sell + "원");
					System.out.println();
					System.out.println("- 판매 금액: " + seed_input_2 * gourd_sell + "원");
					System.out.println("- 소지 금액: " + money + "원");
					System.out.println();
						gourd -= seed_input_2;
					System.out.println("▷ 확인: (공백 입력)");
					System.out.println("==================");
						inp = s.nextLine();
						if(inp.equals(" ")){gameMain();}
		case 5: money += seed_input_2 * melon_sell;
					System.out.println();
					System.out.println("==================");
					System.out.println("메론: " + melon_sell + "원");
					System.out.println();
					System.out.println("- 판매 금액: " + seed_input_2 * melon_sell + "원");
					System.out.println("- 소지 금액: " + money + "원");
					System.out.println();
						melon -= seed_input_2;
					System.out.println("▷ 확인: (공백 입력)");
					System.out.println("==================");
						inp = s.nextLine();
						if(inp.equals(" ")){gameMain();}
		}
	}
	
	
	

	
	void end(){
		System.out.println("==================");
		System.out.println();
		System.out.println("-【 10 레벨을 달성하셨습니다.】");
		System.out.println();
		System.out.println();
		System.out.println("【 총 " + day + "일 】");
		System.out.println();
		System.out.println("=====【 수확물 】=====");
		System.out.println();
			if(beet != 0){System.out.println("- 비트: " + beet + " * " + beet_sell + " : " + (beet * beet_sell) + "원");}
			if(potato != 0){System.out.println("- 감자: " + potato + " * " + potato_sell + " : " + (potato * potato_sell) + "원");}
			if(cabbage != 0){System.out.println("- 양배추: " + cabbage + " * " + cabbage_sell + " : " + (cabbage * cabbage_sell) + "원");}
			if(gourd != 0){System.out.println("- 호박: " + gourd + " * " + gourd_sell + " : " + (gourd * gourd_sell) + "원");}
			if(melon != 0){System.out.println("- 메론: " + melon + " * " + melon_sell + " : " + (melon * melon_sell) + "원");}
		System.out.println();
			if(money != 0){System.out.println("보유 금액: " + money + "원");}
			int sum = (beet * beet_sell) + (potato * potato_sell) + (cabbage * cabbage_sell) + (gourd * gourd_sell) + (melon * melon_sell) + money;
				
			String number = Integer.toString(sum);
			String property = "";
			int cnt = 0;
			for(int i = number.length() - 1; i >= 0; i--){
				property = number.charAt(i) + property;
				cnt++;
				if(cnt % 3 == 0 && cnt != number.length()){ //i가 0이 아닐 때도 된다.
					property = "," + property;}
			}
		System.out.println();
		System.out.println("총 재산 (보유 금액 + 수확물): " + property + "원.");
		System.out.println();
		System.out.println("==================");
		System.out.println();
		System.out.println();
		System.out.println("【" + farm_name_1 + "】 농장이 번성했습니다!");
		System.out.println();
		System.out.println("훌륭한 농장주가 되신 것을 축하합니다.");
		System.out.println();
		System.out.println("(최종 레벨을 달성하였으므로 게임을 종료합니다.)");
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		game_end();
		
		
	}
	
	
	void game_fail(){
		System.out.println("==================");
		System.out.println("게임이 종료되었습니다.");
		System.out.println("==================");
	}
	
	
	void game_end(){
		System.out.println(" - GAME END - ");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("게임을 재시작 하시겠습니까? ('Y' or 'N')");
			String inp = s.nextLine();
				switch(inp){
				case "Y": greet();
				case "y": greet();
				case "N": break;
				case "n": break;
			}
		
	}
	
	
	
}













