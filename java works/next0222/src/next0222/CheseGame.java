package next0222;

public class CheseGame implements MarioGame {

	@Override
	public void up() {
		System.out.println("Going up");
	}

	@Override
	public void down() {
		System.out.println("Going down");
	}

	@Override
	public void left() {
		System.out.println("turn up left");
	}

	
	@Override
	public void right() {
		System.out.println("Turn up right");
	}
}
