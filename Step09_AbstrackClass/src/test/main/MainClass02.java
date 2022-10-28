package test.main;

import test.mypack.Gun;
import test.mypack.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		test("안녕");
		// 직접 클래스를만들고 객체를 생성해서 아래의 useWeapon()메소드를 호출해보세여
		Weapon g1=new Gun();
		useWeapon(g1);
	}
	
	public static void test(String msg) {
		System.out.println(msg+"하세요");
	}
	//인자로 전달된 Weapon type 을 인자로 전달받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
}
