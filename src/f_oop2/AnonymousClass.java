package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		//하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스
		
		Button b = new Button();
		
		b.addActionListener(new ActionListener() { //ActionListener 를 생성한게 아니라 ActionListener 를 상속받은 클래스를 생성함.
			//ActionListener 를 상속받은 자식 클래스
			@Override
			public void actionPerformed(ActionEvent e){ //ActionListener 의 추상클래스 actionPerformed 를 불러 오버라이딩 해 사용.
				System.out.println("버튼을 누르면 실행");
			}
		});

	}

}
