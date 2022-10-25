package test.main;
//4.논리연산자 테스트
public class MainClass04 {
	public static void main(String[] args) {
		//or 연산
		/*
		 * 또는 이라고 읽으면 된다 
		 * 어느하나가 참이면 결과도 참
		 * 모두가 거짓이면 결과도 거짓
		 * */
		boolean result1 =false||false;
		boolean result2 =false||true;
		boolean result3 =true||true;
		boolean result4 = true||true;
		
		//and 연산자
		/*
		 * 그리고 라고 읽는다.
		 * 
		 * 모두 참 일때만 결과가 참이되고 
		 * 하나라도 거짓일 경우 결과도 거짓이 된다.*/
		boolean result5= false&&false;
		boolean result6= false&&true;
		boolean result7= true&&false;
		boolean result8= true&&true;
		//not 연산
		/*
		 * 
		 * ~가 아니면 이라고 읽는다.
		 * 
		 * boolean 값을 반전 시킨다.*/
		
	}
}
