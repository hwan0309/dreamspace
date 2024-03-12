package next0305;

public class ThorwException {
	public static void main(String[] args) {
		try {
			method1();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
public static void method1() throws ClassNotFoundException {
	Class.forName("Java.lang.String2");
	
}
}
