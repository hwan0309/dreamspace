package next0229;

public class TvControlRunner2 {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언
		TvControl rc;
		
		//Television객체를 생성하고 인터페이스에 변수 대입
		rc = new Television2();
		
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio객체를 생성하고 인터페이스 변수에 대입
		rc = new AudioControl();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
	}
	

}
