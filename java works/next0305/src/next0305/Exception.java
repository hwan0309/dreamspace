package next0305;

public class Exception {

	public static void main(String[] args) {
try {
	Class.forName("java.lang.String2");
}catch(ClassNotFoundException e) {
	e.printStackTrace();
}
	}

}
