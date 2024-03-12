package next0312b;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();
	}

}
