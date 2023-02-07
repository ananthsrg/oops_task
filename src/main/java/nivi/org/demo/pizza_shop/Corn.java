package nivi.org.demo.pizza_shop;

public class Corn implements Topping{
	private int rate = 5;
	private String type = "Corn";
	
		@Override
		public String type() {
			return type;
		}

		@Override
		public int price() {
			return rate;
		}
}
