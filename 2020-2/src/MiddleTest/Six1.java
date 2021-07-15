package MiddleTest;

class A {
	protected int counter;
	A(int value) {		
		counter = value;	// 생성자 생성 ( 클래스 이름과 같아야 함 ) , 매개변수 value를 가진다 . 
	}
	
	
}

public class Six1 {
	public static void main(String[] args) {
		A obj = new A(27);	// 생성자가 매개 변수를 가진다.
		System.out.println("나의 나이는" + obj.counter + "입니다.");
	
		
		String s = "This is a String";
		if (s instanceof String) {	// 변수 s의  instanceof 타입 
			System.out.println("String 으로부터 만들어진 객체가 맞습니다");
		} else {
			System.out.println("String 으로부터 만들어진 객체가 아닙니다.");
		}
		
	}
	

}
//	04/26 p249 03 생성자 ~ p340 06 상속과 다형성

	



	
