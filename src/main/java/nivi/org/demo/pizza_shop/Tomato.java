package nivi.org.demo.pizza_shop;

public class Tomato implements Topping{
	private int rate = 2;
	private String type = "Tomato";
		@Override
		public String type() {
			return type;
		}

		@Override
		public int price() {
			return rate;
		}
}
