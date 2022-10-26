package Main;

public class MainClass01 {
	//int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역변수에 담기
	// 자바에서의 배열은 자바스크립트와 달라 활용도가 조금 낮다.
	int[] nums={10, 20, 30, 40, 50};
	// double type 5개를 저장하고 있는 배열
	double[] nums2= {10,20,30,40,50};
	//boolean type 5 개를 저장하고 있는 배열
	boolean[] truth= {true,true,false,false,false};
	//Stringtype 5 개를 저장하고 있는 배열
	String[] names= {"김구라","해골","원숭이","주댕이","덩어리"};
	
	//배열의 각 방 참조하기(자바스크립트와 유사)
	int result1=nums[0];
	double result2=nums2[2];
	boolean result3=truth[1];
	String result4=names[5];
	
	//배열 객체의 메소드와 필드 사용해 보기
	int[] clone=nums.clone(); //복제본을 만드는 clone
	//cloned 를통해 복제된 복제본과 원본은 상호 영향이 없다. 
	int[] copied=nums; //참조값 복사해주기
	//cope
	int size=nums.length;
	
	
	
}
