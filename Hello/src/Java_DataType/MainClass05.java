package Java_DataType;
/*
 * [Java 참도 데이터 type]
 * 
 * sring type
 * 
 * - 문자열을 다룰 때 사용하느 데이터 type 이다.*/

public class MainClass05 {
	public static void main(String[] args) {
		//"김구라"라는 string type 객체를 heap영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name="김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사해 주기
		String tmp=name;
		//"원숭이"라는 스트링 타입 객체를 heap 영역 안에  만들고 그 참조값을 name 변수에 덮어쓰기
		name="원숭이";
		//name 변수를 비우기(null은 참조 데이터 type이 담길수 있는 빈 공간을 의미한다.)
		name=null;
	}
}
