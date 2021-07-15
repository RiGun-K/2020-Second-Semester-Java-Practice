package Model;

public class Person{
	private String name;	
	private int age;
	
	// 생성자 만들기 ( 일반적으로 클래스 이름과 동일한 기본 생성자 )
	public Person() {
		
	}
	
	// 필드를 전달받아 만드는 오버로드 된 생성자
	Person(String name, int age) { // 이름과 나이를 받아서 
		this.name = name;	// this 는 외부에서 name이라는 변수를 통해서 넘어온 값 , 초기화 작업 
		this.age = age; 	
	}
	
	// Setter 만들기 : 마우스 오른쪽 + Source + 제너레이트 소스 and Setter 클릭 
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	// toString 메소드 생성 
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	// 메소드안에 코드가 많아지면 여러 메소드로 분리 , 메소드가 클래스 안에 많아지게되면 클래스 또한 여러가지로 만들어야 함, 클래스가 '' 패키지로 만듬
	
}