package next0222;

public class GameConosole implements MarioGame {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("down");
	}

	@Override
	public void left() {
		System.out.println("Left");
	}

	
	@Override
	public void right() {
		System.out.println("Right");
	}
}
