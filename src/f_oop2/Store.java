package f_oop2;

public class Store {

	public static void main(String[] args) {
		
		Customer c = new Customer(); //손님을 만듦.
		
		Product p = new Desktop(); //객체 자식, 타입 부모. 자식에서 부모로 형변환 함.(업캐스팅)
		p.info(); //물건의 정보 확인
		c.buy(p); //Product 타입의 변수를 넘겨줬다.
		
		p = new TV();
		p.info();
		c.buy(p);
		
		c.showItem();
		//Product 타입의 변수 p가 Desktop도 될 수 있고, TV도 될 수 있다.
		//이렇게 여러가지 형태를 가지는 특징을 다형성이라고 한다.

	}

}


class Product{
	
	String name;
	int price;
	
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	void info(){//출력할 수 있는 메서드
		System.out.println("--------------------");
		System.out.println("상품명: " + name);
		System.out.println("금  액: " + price + "원");
		System.out.println("--------------------");
	}
}


class Desktop extends Product{
	//상속 받을 자식 클래스 생성. Product 생성자의 파라미터가 있기 때문에 오류가 난다.
	//컴파일러가 그냥 만들어서 넣을 수가 없는데 아무것도 없으니 네가 넣어줘라, 이런 뜻.
	
	Desktop(){
		super("삼성 컴퓨터", 500000); //부모 클래스(Product)의 생성자 호출
	}
}


class TV extends Product{
	TV(){
		super("LG TV", 1000000);
	}
}


class Customer{
	int money = 2000000000;
	//TV, Desktop 배열 하나씩, 둘 다 담고 싶을 땐 Product(부모배열) 생성.
	Product[] item = new Product[10]; //장바구니
	
	void buy(Product p){ //프로덕트 파라미터로 받은 물건을 구매할 것. 형변환 생략.
		if(money < p.price){
			System.out.println("돈이 부족하다.");
			return;
		}
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){ //빈 곳을 찾아야 하니까 null을 반복.
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다."); //구매한 상품의 이름 출력.
	}
	
	
	void showItem(){//현재 구매한 아이템 목록
		System.out.println("------ 장바구니 -------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				System.out.println(i + 1 + ". " + item[i].name);
			}
		}
		System.out.println("--------------------");
	}
	
	
}












