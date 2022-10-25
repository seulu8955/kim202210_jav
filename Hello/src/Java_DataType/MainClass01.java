package Java_DataType;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647-사용 빈도수가 가장 높은 타입
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  	크기에 맞는 타입을 사용하면 데이터 크기를 줄일 수 있다.
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {	
	public static void main(String [] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		byte iByte=10;
		short iShort=10;
		int iInt=10000;
		long iLong=10;
			
		int tmp=iShort;
		
		byte tmp2=(byte)iShort; //캐스팅을 통해 숏 타입 데이터가 바이트 타입에 들어감을 확인해줌
	
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; //d,f를 붙이지 않으면 double type 로 간주된다.
		
		//float type 에 있는 값을 double type에 담기
		double tmp3=num1;
		//casting연산자가 필요하다
		
		float tmp4=(float)num2;
		
	}
	/*
	 * int type 변수에 byte type 변수에 담긴 내용을 대입한다면?
	 * -표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능 범위가 더 넓은 변수에 대입하는 것은
	 * 문제가 없다 따라서 에러를 일으키지 않는다.
	 */
		
		
		
	
}
