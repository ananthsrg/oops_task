package nivi.org.demo.pizza_shop;

import java.util.ArrayList;

public class Pizza extends AbstractPizza{

	@Override
	public AbstractPizza addBase(Base base) {
		this.base = base;
		return this;
	}

	@Override
	public AbstractPizza addTopping(Topping top) {
		if(this.toping == null) {
			this.toping = new ArrayList<Topping>();
		}
		this.toping.add(top);
		return this;
	}

}
