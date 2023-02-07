package nivi.org.demo.pizza_shop;

public class Mushroom implements Topping{
	private int rate = 4;
	private String type = "Mushroom";
		@Override
		public String type() {
			return type;
		}

		@Override
		public int price() {
			return rate;
		}
}
