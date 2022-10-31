package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1=new Joinner() {
			
			@Override
			public String join(String one, String two) {
				
				return one+two;
			}
		};
		String result1=j1.join("안녕","하세요");
		
		Joinner j2=(one,two)->{//화살표 함수 형태에서 타입은 생략이 가능하다
			
			return one+two;
			
		};
		
		//메소드 안에 특별히 실행할 코드가 업다면 아래와 같이 중괄호마저 생략하고 리턴할 값만 명시할수도 있다.
		Joinner j3=(one,two)->one+two; //람다식
		
	}

}
