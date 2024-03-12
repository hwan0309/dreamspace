package next0312;

public class GenExam {

	public static void main(String[] args) {
		
		//K는 Tv로 대체, M은 String으로 대체
		Product<Tv, String> product1 = new Product<>();
		
		//setter 매개값은 반드시 tv와 string 제공
		product1.setKind(new Tv());
		product1.setModel("smart Tv");
		
		//Getter 리턴값은 tv와 string이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		//K는 car로 대체 , M은 String으로 대체
		Product<Car,String>product2 = new Product<>();
		
		//Setter 매개값은 반드시 Car와 String 제공
		product2.setKind(new Car());
		product2.setModel("sub Model");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
	}

}
