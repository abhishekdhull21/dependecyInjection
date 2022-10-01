package ca.sheridancollege.treves;

public class Volume {
	private int height;
	private int width;
	private int length;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int widht) {
		this.width = widht;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int calculate() {
		System.out.print(height);
		return height * width * length;

	}
}
