package Java_DataType;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		double avg=(kor + eng)/2d;
		System.out.println(avg);
		// 정수끼리 연산하면 정수만 결과로 나오고 실수가 포함된 연산을 하면 실수가 나온다.
		// 어느 한 숫자 뒤에 d,f 더블타입 혹은 플로트 타입 데이터라는 표시를 넣어 주어야 정확한 값이 나온다.
		
	}
}
