package next0227;

public class DriverRunner {

	public static void main(String[] args) {
		//Driver객체 생성
		Driver driver = new Driver();
		
		//매개값으로 bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		//매개값으로 taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);;
	}

}
