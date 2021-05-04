import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import engine.Cars;
import engine.GameEngine;

public class GameEngineTest {

	private GameEngine gameEngine;

	@BeforeEach
	void setUp() throws Exception {
		String carNames = "a,b,c,d";
		this.gameEngine = new GameEngine();
		this.gameEngine.initGame(carNames);
	}

	@DisplayName("우승자를 정확히 반환하는 Test")
	@Test
	void getWinner_WhenCalled_ShouldReturnCar() throws Exception {
		Cars cars = gameEngine.getCars();
		for (int i = 0; i < cars.getCarList().size(); i++) {
			cars.getCarList().get(i).setLocation(i);
		}
		assertThat(gameEngine.getWinner().getCarList().get(0).getName()).isEqualTo("d");
	}
}
