package next0222;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList list = new MyCustomList();
		list.addElement("Element 1");
		list.addElement("Element 2");
		
		MyCustomList list2 = new MyCustomList();
		list.addElement(Integer.valueOf(5));
		list.addElement(Integer.valueOf(7));
		
	}

}
