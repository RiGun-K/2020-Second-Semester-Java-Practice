package MiddleTest;

public class Five1 extends Five {
	/*
	 * 메소드 : 특정한 작업을 수행하는 문장들  , 입력 받아서 처리한 후 결과를 반환하는 상자 
	 * 	    : 일반적으로 데이터를 변경하거나 값을 외부로 보낼때 사용 
	 * 반환형 : 반환하는 데이터 타입지정, 없으면 void라고 지정 
	 * 
	 * 반환형 메소드이름 (매개변수 1 , 2 ...)  = int add(int x, int y)  // add는 정수 2개를 받아서 합을 반환 
	 * [ // 메소드 몸체  ]					{ return x+y; }
	 * 
	 */
	int add(int x, int y) {	// x, y는 add()의 매개변수
		return x+y;
	}
	
	void print() {
		System.out.println("채널은" +channal+"이고 볼륨은"+ volume+"입니다");
		// 멤버 연산자(.) 사용 X !!
	}
	
	void setChannel(int ch) {	// 매개 변수를 가지는 메소드   ??????????물어 보기 ????????????????
		channal = ch;
	}
	
	/*
	 * 메소드 종료 : return; 만나면 종료 
	 */
	void test() {
		for ( int i =0; i<10; i++) {
			if ( i == 7 )
				return;		// return으로 반환된 값은 main메소드에서 호출이 가능하고 변수도 아님 , 단지 return으로 값을 받는다는 것 뿐 !!
				}			
			}


	int getChannel() {
		return channal;		// void 메소드는 X, channal에 속한 값을 반환 , int형으로 맞춰야함 
	}
	
	public static void main(String[] args) {
		int sum;
		Five1 obj = new Five1();
		sum = obj.add(3, 4);		// 3,4는 인수로써 add()에 전달 // return x+y로 계산후 호출
		System.out.println(sum);
		sum = obj.add(5, 5);
		System.out.println(sum);
		
		
		System.out.println();
	}		

}

