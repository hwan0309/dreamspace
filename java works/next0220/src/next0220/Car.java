package next0220;

public class Car {
	static int speed;	//인스턴스 필드 선언
	
	static void run() {	//인스턴스 메소드 선언
		System.out.println(speed+"ing");
	}
	
	static void simulate() {
		Car myCar = new Car();	//객체 선언
		
		myCar.speed = 200;	//인스턴스 맴버 사용
		myCar.run();
	}
	public static void main(String[] args) {	
		
		simulate();
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
	}
}
