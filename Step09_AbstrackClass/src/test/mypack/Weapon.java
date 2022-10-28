package test.mypack;

public abstract class Weapon {
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	
	public abstract void attack(); 
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지않기
	//미완성된 추상 메소드를 만들기 윟서는 abastract 예약어가 필요하다. 메소드와 클래스 모두
	
	
}
