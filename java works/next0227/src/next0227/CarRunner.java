package next0227;

public class CarRunner {

	public static void main(String[] args) {
		//Car 객체생성
		Car myCar = new Car();
		
		//Tire 객체 장작
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장작
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
