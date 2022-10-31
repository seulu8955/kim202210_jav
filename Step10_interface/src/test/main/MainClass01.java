package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		Remocon r1=null;
		
		//Remocon re2=new Remocon(); 인터페이스 단독객체 생성 불가
		
		Remocon r2=new MyRemocon();
		r2.up();
		r2.down();
		
		String r3=Remocon.COMPANY;
		
	}
	
	
}
