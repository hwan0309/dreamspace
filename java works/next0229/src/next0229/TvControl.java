package next0229;

public interface TvControl {
	//상수필드
int MAX_VOLUME = 10;
int MIN_VOLUME = 0;

//추상메소드
void turnOn();
void turnOff();
void setVolume(int volume);

//디폴트 인스턴스 메소드
default void setMute(boolean mute){
	if(mute) {
		
		System.out.println("mute");
		setVolume(MIN_VOLUME);
	}else {
		System.out.println("unmute");
		setVolume(MAX_VOLUME); 	//mute false가 원래 볼륨 복원하는 코드
	}
}
}
