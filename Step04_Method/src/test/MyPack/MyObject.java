package test.MyPack;
/*
 * [메서드를 만들때 고려 해야 하는것]
 * 
 * 1. 접근 지정자
 * 2. static or non static
 * 리턴 type
 * 메소드명
 * 메소드에 전달하는 인자의 갯수와 데이터 type*/
public class MyObject {
	
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	public int getNumber() {
		return 10;
	}
	public String getGreeting( ) {
		return "안녕하세요";
	}
	public Car getCar() {
		return getCar();
	}
	public void setNum(int num) {
		System.out.println("num : "+num);
	}
	public void setName(String name) {
		System.out.println("name : "+name);
	}
	public void useCar(Car car) {
		car.drive();
	
	}
	public void doSomething(int num,String msg, Car c) {
		System.out.println("무언가를 전달합니다");
	}
	public void send() {
	      System.out.println("무언가를 전송해요");
	   }
	public void send(int num) {
	      System.out.println(num+" 을 전송해요");
	   }
	public void send(String name) {
	      System.out.println(name+" 을 전송해요");
	   }
	public void send(Car car) {
	      System.out.println("자동차를 전송해요");

	
	}
}
