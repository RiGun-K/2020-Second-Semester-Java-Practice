package MiddleTest;

import java.util.Scanner;

class oni {
	public static int count;
	int a = 27;
	private int b;
	String name;
	
//	String getname() {return name = "jo";}
//	String setname() {return name = "hi";}

	String s = new String("Hi");		// new 연산자를 사용하여 , 문자열을 담은 객체 생성
	String c = "Bye";					// new 연산자 생략 , " ~~~ " 으로 생성 가능 !!!
	int str = s.length();
	int stc = c.length();
//	System.out.println(s.length() + c.length());	// 5
	
	
	int t;
	oni(int value) {			// 생성자 , 클래스와 이름이 동일 
		t = value;
	}
	
	oni(int w, int e) {			// 생성자 , 변수 a ,b 에 값을 대입 , 생성자는 여러 개 올수 있다 ! 
		this.a = w;				
		this.b = e;
	}
	
	oni() {
		this(1,20);
	}
	
	
	void print() {			// 호출 실행 
		System.out.println(a*b);
	}
}

class oni1 {
	int id;
	static int numbers = 0;		// 정적 변수 생성
	oni1() {
	id = ++numbers;			// 생성자 안에서 만 가능
			}
	
	static int cars() {			// 정적 메소드 생성
		return numbers;
	}
}
public class Final {
	String name;
	double salary;
	
	static int count = 0;
	
	Final(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		
		Final e1;
		e1 = new Final("김리건", 2001291);
		
		int nn = Final.getCount();
		System.out.println("현재 직원수"+nn);
		
		
		oni q = new oni(100);			// oni 클래스의 객체들을 'q'라는 변수로 호출 , value 에 100 할당
		oni qq = new oni(20,10);		// 변수 w,e 에 값을 할당
		qq.print();						// 호출
		
		new oni();
		
		
		q.a = 10;
		q.name = "hierea";
		
		System.out.println(q.t);
		
//		System.out.println(q.getname() );
//		System.out.println(q.setname() );
		
//		//
	
		
		
//		int n = oni1.numbers;	//
		int n = oni1.cars();	// 정적 메소드 호출
		System.out.println(n);
		
		
	}
}
