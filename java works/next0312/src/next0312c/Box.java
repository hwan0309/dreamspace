package next0312c;

public class Box<T> {
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		
		//Object의 equals()메소드로 contennt 필드값 비교
		boolean result = content.equals(other.content);
		return result;
	}
}
