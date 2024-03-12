package next0312b;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car();
	}

}
