package next0229;

public class Television2 implements TvControl {
	//필드
	private int volume;
	
	//TurnOn() 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("turn on Tv");
	}
	//TurnOff() 추상메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("turn off Tv");
	}
	//setvolume() 추상메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume > TvControl.MAX_VOLUME) {
			this.volume = TvControl.MAX_VOLUME;
		}else if (volume < TvControl.MIN_VOLUME) {
			this.volume = TvControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("control volume" + this.volume);
	}
	
}
