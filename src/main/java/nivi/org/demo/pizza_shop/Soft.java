package nivi.org.demo.pizza_shop;

public class Soft implements Base{
private int rate = 20;
private String type = "Soft";
	@Override
	public String type() {
		return type;
	}

	@Override
	public int price() {
		return rate;
	}

}
