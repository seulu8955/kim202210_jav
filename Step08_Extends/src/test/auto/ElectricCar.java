package test.auto;

public class ElectricCar extends Car{
	
	//부모객체가 생성되기 위해서 필요한 자식 객ㄱ체를 자식 생성자의 생성자로 받어서
	public ElectricCar(Engine engine) {
		//부모 생성자에 전해주어야한다.
		super(engine);
		
	
	}
	public void charge() {
		System.out.println("충전을 해요");
	}
	
}
