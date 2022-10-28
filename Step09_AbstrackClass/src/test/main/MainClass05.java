package test.main;

import java.util.Scanner;

import test.mypack.Weapon;

public class MainClass05 {
	//필드를 선언하면서 값을 얻어내서 대입하는 코드
	int num=999;
	String name="king";
	Scanner scan=new Scanner(System.in);
	//필드는 선언만 하면 기본값이 들어간다.
	int weight;//0
	boolean isRun;//false
	String msg;//null
	Scanner scan2;//null
	
	
	//static 영역에 올리고 싶은 필드는 static 예약어를 사용해서 만든다.
	static String greet="안녕";
	
	static Weapon w1=new Weapon() {//static 안이라면 static 선언을 안해도 된다.
		//Anonymous Inner Class 를 이용해서 Weapon type 참조값 얻어내기
		
		@Override
		public void attack() {
			System.out.println("무엇인지 모르겠지만 아무거나 공격하자");
			
		}
	};// 객체 선언을 그냥 하면 오류가 나지만 {}로 묶고 overide를 통해 attack을 정의하면 Weapon 타입의 참조값이 나온다.
	// class A {} -A라는 클래스를 만들때 사용하는 것고 같은 원리로 위에서도 익명의 클래스를 만든것이다.
	// Weapon()의 뒤에 {} 가 왔기때문에 extends Weapon을 상속받은 것으로 여겨진다.
	
	
	
	
	public static void main(String[] args) {
		//Anonymous Local Inner Class 를 이용해서 Weapon type의 참조값 얻어내기
		useWeapon(w1);//null포인트 익셉션
		
		Weapon w2=new Weapon() {
			@Override
		public void attack() {
			System.out.println("고오옹격");
			
		}
			
		};
		useWeapon(w2);
		
		useWeapon(new Weapon() {
			@Override
		public void attack() {
			System.out.println("신기하게 공격"
					+ "");
			
		}
			
		});// 변수 선언하는 과정을 거치지 않고 매개변수 자리에 입력해서 과정을 줄일 수 있음
		
	}

	 public static void useWeapon(Weapon w) {
	      w.prepare();
	      w.attack();
	   }
}
