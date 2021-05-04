package process;

import java.util.Scanner;

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
		initGame();
		System.out.println("done init");
	}

	private void initGame() {
		try {
			String carNames = inputOutputUtil.getCarName();
			int numberOfGames = inputOutputUtil.getNumberOfGames();
			gameEngine.initGame(carNames, numberOfGames);
		} catch (Exception e) {
			inputOutputUtil.printError(e.getMessage());
		}
	}
}
