package Main;

public class MainClass02 {
	private void pubmain() {
		// 0으로 최기화된 방 3개짜리 int[] 객체를 만들어 참조값을 지역변수 nums에 담기
		int[] nums= {0,0,0};
		//0 번방에 10,1번방에 20, 2번방에 30을 저장해 보세요.
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0으로 초기화된 방 100개짜리 in[] 객체를 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2=new int[100];
		//첫 문제를 줄이면
		int[] nums3=new int[100];
		nums3[0]=100;
		nums3[1]=200;
		nums3[2]=300;
		nums3[101]=400; //자바에서 배열은 한번 방의 갯수가 정해지면늘리거나 줄일수 없다.
		//arry index Out Of Bounds expection
	}

}
