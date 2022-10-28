package test.auto;
/*
 * -접근 지정자 접근범위
 * 
 * public : 어디에서나 접근 가능
 * protected : 동일한 pakage 혹은 상속관계에서 자식에게 접근 가능
 * default : 동일한 package 안에서만 접근 가능
 * private : 동일한 클래스 혹은 동일한 객체 안에서만 접근
 * 
 * - 접근 지정자를 붙이는 위치
 * 
 * 1. 클래스 생성시
 * 2. 생성자
 * 3. 필드
 * 4. 메소드
 * 
 * 클래스는 default 와 public 두가지의 접근 지정자만 지정 가능
 * 접근 지정자를 생량한것이 default 접근 지정자이다.
 */

public class Car {
	
	//필드
	protected Car engine;
	//Engine 객체를 인자로 전달받는 생성자
	public Car(Car engine) {
		//생성자를 전달 받은 Engine 객체의 참조값을 필드에 저장
		this.engine=engine;
	}
	public Car(Engine engine2) {
		
	}
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
			return;
		}
		System.out.println("달려요~");
	}
}
