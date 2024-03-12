package next0223;

public class Inheritance {
	
	//필드
	public String model;
	public String color;
	
	//생성자 기본생성자 Phone(){}
	
	//메소드
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public void sendVoice(String message) {
		System.out.println("나 : " + message);
	}
	public void reveiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
	
	public static void main(String[] args) {
		
		
	}
}
