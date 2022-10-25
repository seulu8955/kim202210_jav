package test.mypac;

public class MacBook {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	public MacBook(Cpu cpu,Memory memory,HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	public void doGame() {
		if(this.cpu==null || memory==null || hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할수 업습니다.");
			return; //메소드를 여기서 끝낸다는 표시
		}
		System.out.println("신나게 게임을 해요!");
	}
}
