package Java_DataType;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abced12345";
		int result=str.length();
		char result2=str.charAt(5);
		/*
		 * string 객체의 메소드를 활용해서 
		 * str 변수 안에 있는 문자를 모두 대문자로 변환해서
		 * str2 라는 이름의 변수에 담아보세요*/
		String str2=str.toUpperCase();
	
		
		String greet="Hello! mimi, Bye ! mimi";
		//위의 문자열에서 mimi라는 문자열을 mama라는 문자열로 변경해
		//greet 2에 담아보세요
		//단 string 객체의 매소드를 활용해서
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is kimhura";
		boolean isStart=message.startsWith("MY");
		int index=message.indexOf("i");
		
	}
}
