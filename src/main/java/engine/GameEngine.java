package engine;

public class GameEngine {

	private Cars cars;
	private int numberOfGames;

	public void startGame() {

	}

	public void initGame(String carNames, int numberOfGames) throws Exception {
		this.cars = new Cars(carNames);
		this.numberOfGames = numberOfGames;
	}
}
