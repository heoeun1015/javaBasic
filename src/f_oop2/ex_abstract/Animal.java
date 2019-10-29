package f_oop2.ex_abstract;

public abstract class Animal {
	
	void run(){
		System.out.println("▷▶▷ 달리는 중 ▷▶▷");
	}
	
	abstract void bark();

}

class Dog extends Animal{ //이걸 상속받으면 반드시 선언부를 구현해라, 라는 의미의 강제성을 지닌다.
	@Override
	void bark() {
		System.out.println("멍멍!"); 
	}
}

class cat extends Animal{
	@Override
	void bark() {
		System.out.println("야옹~");
	}
}

class cow extends Animal{
	@Override
	void bark() {
		System.out.println("음머~");
	}
}