package ca.sheridancollege.treves.beans;

public class ReusableRocket {
	private String name;
	private int height;
	private int capacity;
	private int reuses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int hieght) {
		this.height = hieght;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getReuses() {
		return reuses;
	}

	public void setReuses(int reuses) {
		this.reuses = reuses;
	}

	@Override
	public String toString() {
		return "ReusableRocket [name=" + name + ", hieght=" + height + ", capacity=" + capacity + ", reuses=" + reuses
				+ "]";
	}

}
