package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public MainClass06() {
		// 자식에게 사준 일반 핸드폰(인터넷 안됨)
		HandPhone p1=new HandPhone();
		//엄마! 나도 스마트폰!
		
		//엄마가 새로운 설명서를 가지고 왔어 이제 그폰은 스마트 폰이야
		//SmartPhone p2=(SmartPhone)p2; 실행 불가
		//진짜?
		//나이제 인터넷 한다
		//p2.doInternet(); 실행불가
	}
}
