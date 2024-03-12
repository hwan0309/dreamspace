package next0312d;

public class Box<T>{

	//필드
	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	
	//setter 메소드
	public void set(T t) {
		this.t = t;
	}
}
