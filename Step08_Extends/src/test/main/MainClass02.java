package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 *  지역변수나 필드앞에 선언하는 data type은 (참조 데이터 타입)
 *  
 *  그안에 들어있는 참조값의 설명서 라고 생각하면된다.
 *  
 *  그렇기 때문에 그 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용 할 수 있다.
 *  
 *  java의 모든 객체는 다형성을 가질수 있다.
 *  
 *  다형성은 타입이 여러개라는 의미이다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1=new HandPhone();
		// 객체의 참조값을 부모 type으로 바꿀수 있다.
		Phone p2=new HandPhone();
		Object p3=new HandPhone();
/*
 *  p1은 HandPhone 타입으로 선언돼 HandPhone이 원래 가진 계승받은 기능에더해 
 *  계승받은 Phone 과 기본적으로 계승받는 object의 기능을 모두 사용할수 있다.
 *  하지만 Phone 타입으로 선언된 p2는 Phone과 object를, Object 타입으로 선언된 
 *  p3는 object 타입의 기능만 사용가능하다.
 *  
 *  아직은 자세한 이유는 이해하기 힘들지만 부모 타입을 쓰면 프로그래밍이 유연해진다.
 */
			
		
				
				
		
		
	}

}
