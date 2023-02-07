package nivi.org.demo.pizza_shop;

import java.util.List;

public abstract class AbstractPizza {
	public Base base;
	public List<Topping> toping;
	
	public int getPrice() {
		int toppingRate = 0;
		for(Topping t : toping) {
			toppingRate += t.price();
		}
		return toppingRate;
		}
	
	public abstract AbstractPizza addBase(Base base);
	public abstract AbstractPizza addTopping(Topping top);

}