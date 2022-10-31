package test.main;

import test.mypac.Remocon;

public class MainClass03 {//Anonymous Inner Class 를 이용해서 intergac type 의 참조값 얻어내기
	static Remocon r1=new Remocon() {//class ? implements Remocon 이 생략
		
		@Override
		public void up() {
			System.out.println("온도를 높여요");
			
		}
		
		@Override
		public void down() {
			System.out.println("온도를 내려요");
			
		}
	};
	public static void main(String[] args) {
		useRemocon(r1);
		Remocon r2=new Remocon() {
			//Anonymous Local Inner Class 를 이용해서 intergac type 의 참조값 얻어내기
			
			@Override
			public void up() {
				System.out.println("난이도를 올려요");
				
			}
			
			@Override
			public void down() {
				System.out.println("난이도를 내려요");
				
			}
		};
		useRemocon(r2);
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("난이도를 더 올려요");
				
			}
			
			@Override
			public void down() {
				System.out.println("난이도를 더 내려요");
				
			}
		});
		
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
