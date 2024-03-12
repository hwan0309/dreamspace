package next0220;

public class TelevisionExam {

	public static void main(String[] args) {
		
		
		System.out.println(Television.info);
		
		Television tv = new Television();
		Television.method2();
		System.out.println(tv.pay);
		
		tv.method1(5000000);

	}

}
