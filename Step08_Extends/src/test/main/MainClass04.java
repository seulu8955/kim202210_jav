package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	
	
	public static void main(String[] args) {
		Object p3=new HandPhone();
		//HandPhone 객체를 생성해서 그 참조값을 Object type 지역변수 p3에 담는다.
		
		Phone p2=(Phone)p3;
		//object type 변수에 담긴 ㄱ밧을 Phone type 변수에 담기
		//일반적으로 부모타입을 자식타입에 담을 수는 없지만 캐스팅을 통해 담아지게 만들수 있다.
		HandPhone p1=(HandPhone)p3;
	}

}
