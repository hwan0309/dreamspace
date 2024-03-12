package next0220;

public class Rectangle {
	//state	
		private int length;
		private int width;
		
	//creation
	 public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int area() {
		return length * width;
	}
	public int perimeter() {
		return 2 * (length + width);
	}
	//operations
	 
	 public String toString() {
	 return String.format("length - %d  width - %d area - %d perimeter - %d",
			 length, width, area(), perimeter());
}
	public void setWidth(int width) {
		this.width = width;
	}
}