package nivi.org.demo.pizza_shop;

public class Standard implements Base{
	private int rate = 10;
	private String type = "Standard";
		@Override
		public String type() {
			return type;
		}

		@Override
		public int price() {
			return rate;
		}
}
