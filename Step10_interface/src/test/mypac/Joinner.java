package test.mypac;

//추상 메소드를 1개만 만들도록 강제하는 역할(@FunctionalInterface)
//()->{} 형태로 사용할수 있도록 하는 효과
@FunctionalInterface
public interface Joinner {
	public String join(String one, String two);
}
