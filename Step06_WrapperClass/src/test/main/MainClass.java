package test.main;
/*
 *  [기본 data type 의 참조 data type]
 *  
 *  byte	: Byte
 *  short 	: Short
 *  int		: Integer
 *  long	: Long
 *  
 *  float	: Float
 *  double	: Double
 *  
 *  char	: Character
 *  boolean	: Boolean
 *  
 *  - 떄로느 기본데이터 type 의 참조데이터 type 이 필요할 때가 있다. 
 *  - 기본데이터 type 을 객체에 포장(boxing)하는 형태이다.
 *  - boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경쓸 필요는 없다.
 */
public class MainClass {
	private void mian() {
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조 데이터 type 이지만 기본 데이터 type 처럼 사용할수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		int result=Integer.parseInt("999");
		
		
	}

}
