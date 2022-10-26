package Main;

public class MainClass07 {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		
		for(int i=0;i< num.length; i++) {
			int tmp=num[i];
			System.out.println(tmp);
			
		}
		System.out.println("----확장 for 문을 사용하면----");
		
		for(int tmp:num) {
			System.out.println(tmp);
		}
	}
}
