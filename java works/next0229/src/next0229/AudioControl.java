package next0229;

public class AudioControl implements TvControl {
	
	//필드
	private int volume;
	
	//turnOn() 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("turn on Audio");
	}
	
	//turnOff() 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("turn off Audio");
	}
	
	//setVolume() 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {
		if(volume > TvControl.MAX_VOLUME) {
			this.volume = TvControl.MAX_VOLUME;
		}else if (volume < TvControl.MIN_VOLUME) {
			this.volume = TvControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("set volume Audio"+ volume);
	}
		
	//필드
	private int memoryVolume;
	
	//디폴트 메소드 재정의 
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("mute");
			setVolume(TvControl.MIN_VOLUME);
		}else {
			System.out.println("unmute");
			setVolume(TvControl.MAX_VOLUME); 	//mute false가 원래 볼륨 복원하는 코드
		}
	}
	
	}


