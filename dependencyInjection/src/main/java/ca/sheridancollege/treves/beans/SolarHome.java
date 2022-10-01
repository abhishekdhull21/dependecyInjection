package ca.sheridancollege.treves.beans;

public class SolarHome {
	private String style;
	private int size ;
	private int index;
	private String cardinalDirection;
	private String heatingType;
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getCardinalDirection() {
		return cardinalDirection;
	}
	public void setCardinalDirection(String cardinalDirection) {
		this.cardinalDirection = cardinalDirection;
	}
	public String getHeatingType() {
		return heatingType;
	}
	public void setHeatingType(String heatingType) {
		this.heatingType = heatingType;
	}
	@Override
	public String toString() {
		return "SolarHome [style=" + style + ", size=" + size + ", index=" + index + ", cardinalDirection="
				+ cardinalDirection + ", heatingType=" + heatingType + "]";
	}
	
	
}
