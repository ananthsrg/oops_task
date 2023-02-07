package nivi.org.demo.newyeargift;

public abstract class AbstractChocolate implements Sweet {

	protected int price;
	protected int rank;
	protected int weight;
	
	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public int getRank() {
		return this.rank;
	}

	@Override
	public int weight() {
		return this.weight;
	}

	@Override
	public int compare(Sweet o1, Sweet o2) {
		return o1.getRank() == o2.getRank() ? 0 : (o1.getRank() < o2.getRank() ? 1 : -1);
	}

}
