package udemy;

public class MethodAccessRunnerInsideSamePackage{

	public static void main(String[] args) {
		
		Example example = new Example();
		//example.privateMethod();	//컴파일 에러 접근불가
		example.protectedMethod();
		example.pulicMethod();
		example.defaultMethod();
		
	}

}
