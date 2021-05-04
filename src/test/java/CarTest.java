import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import engine.Car;

public class CarTest {

	@Test
	@DisplayName("잘못된 길이의 이름으로 차 생성 ExceptionTest")
	void newCar_WhenConstructedWithWrongLength_ShouldReturnException() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Car("abcdef"));
	}

	@Test
	@DisplayName("차이름 없 ExceptionTest")
	void newCar_WhenConstructedWithBlank_ShouldReturnException() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Car(""));
	}
}
