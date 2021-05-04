package engine;

public class Car {
	private String name;
	private int location;
	private static final int STANDARD = 4;

	public Car(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("이름은 5 이하 입니다.");
		}
		if (name.length() == 0) {
			throw new IllegalArgumentException("이름을 입력해 주세요");
		}
		this.name = name;
		this.location = 0;
	}

	public void moveCar() {
		int rand = (int)(Math.random() * 10);
		if (STANDARD <= rand) {
			this.location++;
		}
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public int getLocation() {
		return location;
	}
}
