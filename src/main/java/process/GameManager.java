package process;

import java.util.Scanner;

import engine.Cars;
import engine.GameEngine;
import ui.InputOutputUtil;

public class GameManager {
	private GameEngine gameEngine;
	private InputOutputUtil inputOutputUtil;

	public GameManager(Scanner scanner) {
		this.inputOutputUtil = new InputOutputUtil(scanner);
		this.gameEngine = new GameEngine();
	}

	public void startGame() {
		try {
			initGame();
			startMoving();
			getWinner();
		} catch (Exception e) {
			inputOutputUtil.printError(e.getMessage());
			startGame();
		}
	}

	private void startMoving() {
		System.out.println("실행 결과");
		while (gameEngine.isRunning()) {
			gameEngine.moveCar();
			inputOutputUtil.printCarsStatus(gameEngine.getCars());
		}
	}

	private void getWinner() {
		Cars winner = gameEngine.getWinner();
		inputOutputUtil.printWinner(winner);
	}

	private void initGame() throws Exception {
		String carNames = inputOutputUtil.getCarName();
		gameEngine.initGame(carNames);
		int numberOfGames = inputOutputUtil.getNumberOfGames();
		gameEngine.setNumberOfGames(numberOfGames);
	}
}
