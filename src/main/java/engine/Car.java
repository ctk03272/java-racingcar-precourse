package engine;

public class Car {
	private String name;
	private int location;
	private static final int STANDARD=4;

	public Car(String name) {
		if (name.length() > 5) {
			throw new IllegalArgumentException("이름은 5 이하 입니다.");
		}
		this.name = name;
		this.location = 0;
	}

	public void moveCar() {
		int rand = (int)(Math.random() * 10);
		if (STANDARD<=rand){
			this.location++;
		}
	}

	public String getName() {
		return name;
	}

	public int getLocation() {
		return location;
	}
}
