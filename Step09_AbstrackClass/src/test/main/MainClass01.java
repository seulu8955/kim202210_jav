package test.main;

import test.mypack.MyWeapon;
import test.mypack.Weapon;
/*
 * - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * - 형태만 정의되고 실제 구현은 되지 않은 메솓가 존재할수 있다.
 * -형태만 정의된 메소드를 만들때는 abstract 예약어를 붙여 메소드를 정의한다.
 * - 생성자는 존재하지만 단돋으로 객체 생성은 불가하다
 * - 추상클래스 Type 의 id 가 필요하다면 추상 클래스를 상속받은 자식클래스를 정의해서 객체를 생성한다.
 * - 추상클래스를 상속받은 자식 클래스는 부모의 추상메소드를 모두 오버라이드 해야한다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1=null;
		
		//Weapon w2=new Weapon();
		
		Weapon w2=new MyWeapon(); //위의 w2는 동작하지 않는다.
		//하지만 추상클래스의 추상메소드를 MyWeapon을 통해 구체화하면 동작함
		
		w2.prepare();
		w2.attack();
	}

}
