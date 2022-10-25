package test.main;

import test.mypac.Memory;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;


public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 1.MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아 보ㅔ요
		 * 단, MacBook 클래스르 절대 수정하지 마세요
		 */
		//2. mac1지역 변수에 들어있느 참조값을 사용해서 .doGame() 이라는 메소드 를 호출해보세요
		MacBook mac1=new MacBook(new Cpu(), new Memory(), new HardDisk());
		mac1.doGame();
		
		
				
	}

}
