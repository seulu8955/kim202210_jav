package test.main;

import test.mypac.IRemocon;
import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1=new MyRemocon();
		Remocon r2=r1;
		Object r3=r1;
		//직접 클래스를 test.mypac 패키지에 만들어서 useRemocon() 메소드를 여기서 호출해 보세요.
	}
	public static void useIRemocon(IRemocon r2) {
		r2.down();
		r2.up();
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
