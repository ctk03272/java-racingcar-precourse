import java.util.Scanner;

import process.GameManager;

public class Application {
	public static void main(String[] args) {
		GameManager gameManager=new GameManager(new Scanner(System.in));
		gameManager.startGame();
	}
}
