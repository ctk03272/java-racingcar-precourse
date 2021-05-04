package engine;

import java.util.ArrayList;

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

	public void initGame(String carNames) throws Exception {
		this.cars = new Cars(carNames);
	}
	public void setNumberOfGames(int numberOfGames){
		this.numberOfGames=numberOfGames;
	}

	public void moveCar() {
		cars.moveCars();
		stage++;
	}

	public Cars getCars() {
		return this.cars;
	}

	public Cars getWinner() {
		int maxLocation = getMaxLocation();
		Cars winners = new Cars();
		for (Car car : cars.getCarList()) {
			if (car.getLocation() == maxLocation) {
				winners.getCarList().add(car);
			}
		}
		return winners;
	}

	public int getMaxLocation() {
		int min = Integer.MIN_VALUE;
		for (Car car : cars.getCarList()) {
			if (min < car.getLocation()) {
				min = car.getLocation();
			}
		}
		return min;
	}
}
