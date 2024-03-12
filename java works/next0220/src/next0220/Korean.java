package next0220;

public class Korean {
final String nation = "KOR";
final String ssn;

String name;
public Korean(String ssn) {
	this.ssn=ssn;
}

void KoreanInit(String getName) {
	
	this.name = getName;
	System.out.println(this.ssn+ "" + this.name);
	
}
}

