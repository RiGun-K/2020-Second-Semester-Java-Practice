package MiddleTest;

class name {
	public name() {
		System.out.println("부모 클래스 메소드");
	}
};

class Rectangle extends name {
	Rectangle() {
		System.out.println("자식 클래스 메소드");
	}
};

public class Final1 {
//	void print() {
//		super.print();	// 부모 클래스 필드 호출
//		super();		// 부모 클래스 명시적 호출
//		System.out.println("자식 클래스 메소드");
//		System.out.println("이게 되네...");
//	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();	// 필드가 아닌 생성자 호출 ( 부모 클래스 생성자 까지 호출 ) 
		
		
//	Final1 obj = new Final1();
//	obj.print();		// Final1 의 메소드를 호출한다는 뜻 ...
	}

	
}

