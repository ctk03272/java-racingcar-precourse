package engine;

public class GameEngine {

	private Cars cars;
	private int numberOfGames;
	private int stage;

	public GameEngine() {
		this.stage = 0;
	}

	public void startGame() {
		for (int i = 0; i < numberOfGames; i++) {

		}
	}

	public boolean isRunning() {
		if (numberOfGames > stage) {
			return true;
		}
		return false;
	}

	public void initGame(String carNames, int numberOfGames) throws Exception {
		this.cars = new Cars(carNames);
		this.numberOfGames = numberOfGames;
	}

	public void moveCar() {
		cars.moveCars();
		stage++;
	}

	public Cars getCars() {
		return this.cars;
	}

}
