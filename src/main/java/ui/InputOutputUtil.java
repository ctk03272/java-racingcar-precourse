package ui;

import java.util.Scanner;

import engine.Car;
import engine.Cars;

public class InputOutputUtil {

	private final Scanner scanner;

	public InputOutputUtil(Scanner scanner) {
		this.scanner = scanner;
	}

	public void printError(String message) {
		printError();
		System.out.println(message);
	}

	public String getCarName() {
		System.out.println("경주할자동차이름을입력하세요.(이름은쉼표(,)기준으로구분)");
		return scanner.next();
	}

	public int getNumberOfGames() throws Exception {
		System.out.println("시도할회수는몇회인가요?");
		return Integer.valueOf(scanner.next());
	}

	public void printError() {
		System.out.println("에러입니다.");
	}

	public void printCarsStatus(Cars cars) {
		for (Car car : cars.getCarList()) {
			printCarStatus(car);
		}
		System.out.println();
	}

	private void printCarStatus(Car car) {
		StringBuilder sb = new StringBuilder();
		sb.append(car.getName());
		sb.append(" : ");
		for (int i = 0; i < car.getLocation(); i++) {
			sb.append("-");
		}
		System.out.println(sb.toString());
	}

	public void printWinner(Cars cars){
		StringBuilder sb=new StringBuilder();
		for (Car car:cars.getCarList()){
			sb.append(car.getName());
			sb.append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString()+"가 최종 우승했습니다.");
	}
}
