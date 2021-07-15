package MiddleTest;

public class Five {
		int channal;		// 필드 정의 , 객체의 속성을 나타냄   // 클래스 정의 는 단순히 객체를 찍어내기 위한 틀을 생성하는것, 실제 객체는 생성 X
		int volume;			
		boolean onOff;	
	
		int age;
		boolean sex;
		String country;
		
		int getChannal() {	// int 변수명() { return 채널; }
			return channal;
		}
		
		// main 메소드를 클래스 안에 넣어도 됨.. 클래스 > main 
	public static void main(String[] args) { // tv는 참조변수 선언 (Five 클래스의 객체를 참조할수 있는) // tv = new Five() (Five 객체 생성하고 tv에 참조값 저장
		Five tv = new Five();	// new 연산자를 사용하여 객체 생성 (이 방법뿐) , 클래스 명과 동일하게 작성  // Five tv ( 객체 참조변수 선언) 
		tv.channal = 7;			// 객체의 멤버에 접근할 경우 멤버 연산자(.) 사용
		tv.volume = 9;			// tv가 참조하는 객체로 부터 volume 이라는 필드(인스턴스)에 접근하여 9를 저장
		tv.onOff = true;
		System.out.println("tv는" +tv.channal + tv.volume + tv.onOff);
		
		Five my = new Five();
		my.channal = 7;			// Five tv의 channel과는 다르다 (별개의 객체) , 객체는 여러 개 생성가능 
		my.age = 27;
		my.sex = true;
		my.country = "대한민국";
		System.out.println("나의 나이는"+my.age+"성별은"+my.sex+"나라는"+my.country+"입니다.");
		
		int x = 10, y = 20;
		y = x;	// 기초 변수는 값이 복사되어 전달됨..
		System.out.println(x+y);
		
		int ch = tv.getChannal();		// return값을 변수로 만들어줌 
		System.out.println("현재 채널은"+ch+"입니다");	// 변수명 호출 : 여기서 return값을 호출할수 있음 
		
		
	//	tv.channel = 11;	
	//  Five tv2 = tv; 			// 참조 변수를 복사하면 참조값이 복하되서 동일한 객체 참조...	
	//	tv2.channel = 11;  		// tv 객체의 channel 값 11 을 동일하게 참조 
		
	/*	OOP ( 객체 지향 프로그래밍 )
	 * 이 세상 모든것이 객체 , 모든 객체는 특정한 기능을 수행하고 메세지를 보내고 받으면서 상호 작용
	 * 이와 같은 방식을 적용하는 것이 객체 지향  ex ) 화면의 윈도우 버튼 등 
	 */
	
	/*
	 * 객체(Object) - 상태(번호,볼륨,전원상태)와 			    동작(켜기,끄기,채널 변경 등 )으로 나뉨.
	 *			   - ↑필드 (객체의 상태,변수 /int volume;) , ↑메소드 (동작 수행 /changeVolume() ) 으로 나뉘어진다.
	 */
	
	/*
		캡슐화 - 이전의 코드들을 재사용 하기 위함 , 객체가 하나의 캡슐 ,  필드(데이터) 메소드(알고리즘)
			      서로 관련되어 있는 데이터와 알고리즘을 묶는것 , 캡슐로 감싸 객체 내부를 보호(정보은닉)
	 			필수적인 데이터들(필드/channal,onOff,volume)는 안에 보호 ,, 
	 			외부와의 통신을 위하는 메소드(turnOn(),change Volume()는 외부로 공개

	 	상   속 - extends / 기존의 작성된(부모 클래스)를 이어 받아 새로운 (자식 클래스)를 생성하는것 , 자식은 부모로부터 모든 속성과 동작을 물려받음 , 
			     자식 클래스에서 필요한 기능을 추가 또는 변경가능 
	
		다형성 - 객체의 동작이 상황에 따라서 달라짐 speak()를 출력하면 개는 '멍멍' 고양이는 '야옹'으로 반응
	  	추상화 - 불필요한 정보는 숨기고 중요한 정보만을 표현
	*/

	
	/* 자바에서는 일반적으로 하나의 소스파일에는 하나의 클래스만을 담는것이 원칙
	 * 하지만 하나의 소스파일에 여러개의 클래스도 넣을수있다. 이경우 파일에 포함된 여러개 의 클래스들 중에서 
	 * public 이 앞에 붙어있는 클래스의 이름과 소스 파일의 이름이 일치하여야 한다.
	 */
	 
	
	// 클래스 기초 - 같은 종류의 객체는 하나만 있는것이 아니다.. , 첫 글자는 대문자 
	
	/* 클래스는 객체를 찍어내는 틀(template)과 같다. 즉, 객체에 대한 설계도 이다.
	 * 클래스로부터 만들어지는 각각의 객체를 인스턴스(instance)라고 한다.
	 * 
	 * 필드,메소드로 구성되며 이것을 클래스의 멤버(member)라고 한다.
	 * 필드 - 자료형과 변수로 구성 
	 * 
	 * 클래스 정의 는 단순히 객체를 찍어내기 위한 틀을 생성하는것, 실제 객체는 생성 X
	 */
	
	/* 기초 변수 : 기초 자료형의 값을 저장 , 실제 데이터값 저장 		// int double byte 등
	 * 참조 변수 : 객체의 참조값(객체의 주소) 저장 , 객체가 저장 X , 객체의 이름  // 배열,클래스,인터페이스 등
	 * 
	 */
	}
}
