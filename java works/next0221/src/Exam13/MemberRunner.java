package Exam13;

public class MemberRunner {

	public static void main(String[] args) {
		Member mem = new Member();
		
		mem.setNum(1);
		mem.setUserName("kim");
		mem.setUserEmail("www.wwww@wwww");
		mem.setGender(false);
		mem.setCount(1000);
		mem.setAddress("kimposi");
		mem.setAge(000);
		
		System.out.println(mem.getNum());
		System.out.println(mem.getUserName());
		System.out.println(mem.getUserEmail());
		String g;
		if(mem.isGender()) {
		g = "girl";		
	}else {
		g = "men";
	}
	System.out.println(g);
	System.out.println(mem.getCount());
	System.out.println(mem.getAddress());
	System.out.println(mem.getAge());
	System.out.println(mem.toString());
	
	}
}
