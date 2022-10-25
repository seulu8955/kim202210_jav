package test.main;

import test.MyPack.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 객체를 하나만 생성해 그 객체가 가진 
		//walk(),getNumber(),getGreeting() 메소드를 차례로 호출
		//단 메소드가 어떤 data를 리턶면 해당데이터를 지역변수에 담으세요.
		
		MyObject myo=new MyObject();
		
		myo.walk();
		int num= myo.getNumber();
		String greet= myo.getGreeting();
		
	}
}
