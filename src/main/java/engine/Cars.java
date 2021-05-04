package engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
	private List<Car> carList;

	public Cars(String carNames) throws Exception {
		List<String> carNamesList = Arrays.asList(carNames.split(","));
		List<Car> carList = new ArrayList<>();
		for (String carName : carNamesList) {
			carList.add(new Car(carName));
		}
		this.carList = carList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void moveCars() {
		for (Car car : carList) {
			car.moveCar();
		}
	}

}
