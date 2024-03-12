package next0222;

public class GameRunner {

	public static void main(String[] args) {
//		GameConosole game = new GameConosole();
		CheseGame game = new CheseGame();
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
