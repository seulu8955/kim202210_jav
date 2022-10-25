package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr; 
	
	//생성자를 하나라도 정의하면 기본 생성자는 없다고 간주되기 때문에
	//기본생성자도 필요한 경우 명시적으로 정의 해주면 기본 생성자도 사용이 가능하다.
	public Member( ) {
		
	}
	
	public Member(int num,String name,String addr) {
		//생성자에도 매게변수를 생성할 수 있다.
		this.num=num;
		this.name=name;
		this.addr=addr;
				
	}
	
	//메소드
	public void showInfo( ) {
		//필드에 저장된 내용을 활용해서 정보 출력하기
		System.out.println("번호 : " +this.num+"이름 : "+this.name+"주소 : "+this.addr);
	}
}
