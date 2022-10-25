package test.main;

import test.MyPack.Car;
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
		
		
		myo.setNum(1);
		myo.setName("김");
		myo.useCar(new Car());
		
		//메소드 호출하면서 인자로 전달하고자 하는 값이 이미 존재하는 경우
		int a=999;
		String b="누구게";
		Car c1=new Car();
		
		//전달할 값을 변수명으로 전달할 수 있다.
		myo.setNum(a);
		myo.setName(b);
		myo.useCar(c1);
		
		//doSomethnig 메소드를 호출해보세요
		
		myo.doSomething(1,"김",new Car());
	}
}
