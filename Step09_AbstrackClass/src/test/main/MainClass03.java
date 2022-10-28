package test.main;

import test.mypack.Zoo;
import test.mypack.Zoo.Monkey;

public class MainClass03 {
	//zoo클래스에 있는 getMonkey 메소드를 호출해서 리턴값을 m1 이라는 지역변수에 담으세여
	public static void main(String[] args) {
		Zoo mon=new Zoo();
		Monkey m1=mon.getMonkey();
		m1.say();
		
		//메소드 안에도 클래스를 정의 할수 있다.
		//지역 변수 안의 클래스,Local Inner Class
		class Gura{
			public void say() {
				System.out.println("안녕 나는 구라");
			}
		}
	
	}
}
