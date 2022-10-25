package test.mypac;

/*
 * [생성자]
 * 
 * 1. 클래스명과 동일하다
 * 2. 메소그 명과 유사하지만 리턴type 이 없다.
 * 3. 객체를 생성할때(new) 유리하다.
 * 4.객체르 생성한 시점에 무언가 준비작업을 할때 용이하다.
 * 5. 생성자르 명시적으로 정의하지 않아도 기본 생성자는 있닥 가정한다.
 */
public class Student {
	public static void main(String[] args) {
		System.out.println("Student 클래스의 생성자 호출됨");
	
		
	}
	public void study() {
		System.out.println("공부해요!");
	}
}
