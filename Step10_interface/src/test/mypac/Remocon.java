package test.mypac;
/*
 * [interface]
 * 
 * - 생성자가 없다(단독 개체 생성 불가)
 * - 구현된 메소드는 가질수 없다.(추상 메소드만 가질수 있다.)
 * - 필드는 static final 상수만 가질수 있다.
 * - data type 의 역할을 할수 있다.
 * - interface type의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야한다.
 * - 클래스 상속은 단일 상속이지만 인터페이스는 다중 구현이 가능하다.
 * - 인텊페이스도 추상 메소드와 마찬가지로 어떤 방식으로 사용될지 알수 없어 완성하지 않고 남겨둔 상태
 * - 모양은 완벽하기에 완성한 메소드를 어떤  방식으로 사용할지 미리 정해놀수 있다.
 */
public interface Remocon {
	public static final String COMPANY= "LG"; //staic final 은 생략가능
	
	//메소드는 추상메소드만 정의 가능
	public void up();
	public void down();
	
}
