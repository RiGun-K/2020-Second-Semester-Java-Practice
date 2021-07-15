package Source1;

// 메소드 오버로딩 실습

public class Practice1 {
	
	public int plus ( int x , int y) {  		// 메소드 정의
		return x + y;
	}
	
	public int plus ( int x , int y , int z) {
		return x + y + z;
	}
	
	public String plus ( String x , String y) {
		return x + y;
	}
	
	// plus 라는 똑같은 메소드 이름을 정의함 ( 메소드 오버로딩 ) , 매개변수(x,y,z)의 타입(int,String)과 수가 중요 (이름은 중요 x)
	
	public static void main(String[] args) {			// 오버로딩된 메소드를 이용 메인메소드를 이용하여
		Practice1 mypr = new Practice1();				// 클래스이름 매개변수명 = new 클래스이름();
		
		System.out.println(mypr.plus(3, 5));			// 매개변수명.  , 3 + 5 해서 값을 리턴하여 출력
		System.out.println(mypr.plus("나는", "학생이다"));
		System.out.println(mypr.plus(3, 4, 5));
	}
}
