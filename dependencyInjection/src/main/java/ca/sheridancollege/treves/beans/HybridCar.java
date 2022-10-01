package ca.sheridancollege.treves.beans;

public class HybridCar {
	private String make;
	private String model;
	private int year;
	private String engineType;
	private double index;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public double getIndex() {
		return index;
	}

	public void setIndex(double index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "HybridCar [make=" + make + ", model=" + model + ", year=" + year + ", engineType=" + engineType
				+ ", index=" + index + "]";
	}

}
