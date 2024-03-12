package udemy;

public class Example {

		public void pulicMethod() {}
		public void protectedMethod() {}
		private void privateMethod() {}
		void defaultMethod() {}
		
		public static void main(String[] args) {
			Example example = new Example();
			example.privateMethod();
			example.protectedMethod();
			example.pulicMethod();
			example.defaultMethod();
}
}