package next0226;

public class Car {
	//필드
	public int speed;
	//메소드
	public void speedUp() {
	
	speed += 11;
}

//자동차 정지
public final void stop() {
	System.out.println("stop the Car");
	speed = 0;
}
}
