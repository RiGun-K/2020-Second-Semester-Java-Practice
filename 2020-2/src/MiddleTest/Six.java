package MiddleTest;

public class Six {
	int age;
	private int offer;		// private 사용시 클래스 내부에서만 사용 가능
	boolean sex;
	
	int ch() {
		return age; 
	}
	
	int value(int x, int y) {	// 변수 value의 자료형 int와 동일하게 선언해줘야함.
		return x+y;
	}
	double value(double x) {	// 메소드 이름이 같아도 매개변수가 다르면 중첩가능 = 변수 value의 자료형이 달라야함
		return x;
	}
	
	public int getOffer() {return offer;}	// get : 접근자 설정
	public void setOffer(int offer) {this.offer=offer;}	// set : 설정자 설정 
	// 데이터 타입 구하는법 ,생성자 접근자 구하는법
	
	public static void main(String[] args) {
		Six tv = new Six();
		tv.age = 27;
		tv.offer = 20;
		tv.sex = true;
		System.out.println("나의 나이는" + tv.age + "입니다.");
		
		int gun = tv.age;
		System.out.println("나의 나이는" + gun + "입니다.");
		
		int place = tv.ch();
		System.out.println("나의 나이는" + place + "입니다."); 
		
		int rely = tv.value(17,10);	// 변수 value와 자료형이 같아야 선언됨.
		System.out.println("나의 나이는" + rely + "입니다.");
		
		double relo = tv.value(27);	// double 형 변수를 받음
		System.out.println("나의 나이는" + relo + "입니다.");
		
		System.out.println(tv.value(2));	// 인자 하나만 받으면 자동적으로 int형 변수의 값을 받아옴
		System.out.println(tv.value(2,5));	
		
		String s = new String("Hello World!!");		// String 객체 생성
		System.out.println(s.length());				// 변수s가 참조하는 값의 문자열 길이 
		System.out.println(s.concat("환영합니다"));		// s의 값에서 + 문자열을 추가한다.
		System.out.println(s.charAt(0));			// N번째 인덱스 값을 반환한다. 인덱스는 0번쨰부터 시작
		
		// 랩퍼클래스 : 문자열 "123"을 숫자형으로 변환해주는 클래스 .  정수나 실수 같은 기초 자료형을 제외하고 모든것이 객체로 되어있다
		//        : 하지만 랩퍼 클래스를 이용해 기초 자료형도 객체로 만들 수 있다.
		int i = Integer.parseInt("2001291");	// int형 변수에 랩퍼 클래스 Integer를 사용하여 문자열을 담은 객체를 생성했다.	
		System.out.println(i);					// " " 에 문자가 들어가면 안됨 ... 
		
		
		System.out.println("나이 나이는" + tv.getOffer() + "입니다.");	// 접근자와 설정자를 사용하고 있다.
		System.out.println("나이 나이는" + tv.offer + "입니다.");
	
		
		
	}
	
}