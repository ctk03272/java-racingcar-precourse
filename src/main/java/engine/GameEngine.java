package engine;

import java.util.ArrayList;

public class GameEngine {

	private Cars cars;
	private Count numberOfGames;
	private Count stage;

	public GameEngine() {
		this.stage=new Count();
	}

	public boolean isRunning() {
		if (numberOfGames.getCount() > stage.getCount()) {
			return true;
		}
		return false;
	}

	public void initGame(String carNames) throws Exception {
		this.cars = new Cars(carNames);
		this.numberOfGames = new Count();
		this.stage = new Count();
	}

	public void setNumberOfGames(int numberOfGames) {
		this.numberOfGames.setCount(numberOfGames);
	}

	public void moveCar() {
		cars.moveCars();
		this.stage.setCount(this.stage.getCount() + 1);
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
