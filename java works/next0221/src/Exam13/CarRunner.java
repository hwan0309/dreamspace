package Exam13;

public class CarRunner {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed = (-10);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed = (100);
		System.out.println(myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
	}

}
