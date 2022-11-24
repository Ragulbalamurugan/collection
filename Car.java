package Collection;

public class Car {

	private String brand;
	private int price;
	private String color;
	private boolean isAutogear;

	public Car(String brand, int price, String color, boolean isAutogear) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isAutogear = isAutogear;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setprice(int price) {
		this.price = price;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBoolean(boolean isAutogear) {
		this.isAutogear = isAutogear;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public boolean isAutogear() {
		return isAutogear;
	}

	public String toString() {
		return "brand = " + brand + ", price = " + price + ", color = " + color + ", IsAutogear = " + isAutogear;
	}

}
