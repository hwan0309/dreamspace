package next0229;

public class RemoteComtrolRunner {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc변수에 Television객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc변수에 Audio객체를 대입 (교체시킴)
		rc = new Audio();
		rc.turnOn();
		
	}

}
