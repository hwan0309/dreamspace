package next0220;

public class Objects1Runner {

	public static void main(String[] args) {
		Objects1 objects1 = new Objects1("Manufacturer 1", 0.34567, "Green");
		objects1.switchOn();
		System.out.println(objects1);
		
		objects1.setSpeed((byte)3);
		System.out.println(objects1);
		
		objects1.switchOff();
		System.out.println(objects1);
	}
}
