package test.main;
/*2.증감연산자 테스트
 * 변수에 있ㄴㄴ 숫자 값을 1씩 증가 혹은 1씩 감소 시킬때 사용한다.
  ++,--
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=0;
		num++;
		num++;
		num++; //num이 최종 3 이된다.
		
		int num2=0;
		num2--;
		num2--;
		num2--; //num2가 최종 -3이된다.
		
		int num3=0;
		int result1=num3++; //result 1에 0이 대입되고 num3가 1이된다.
		
		int result2=++num3;//num4 가 1증가하고 result에 1이 대입된다.
		//0이 대입되고 증가 증가되고 대입
		
	}
}
