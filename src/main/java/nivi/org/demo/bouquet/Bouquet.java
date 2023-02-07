package nivi.org.demo.bouquet;


public class Bouquet {
private int price;
private int rose = 1;
private int jasmine = 2;
private int lily = 3;
	
	public Bouquet createBouquet(int noOfRose, int noOfJasmine, int noOfLily) {
		price = noOfRose * this.rose + noOfJasmine * this.jasmine + noOfLily * this.lily;
		return this;
	}
	
	public int getPrice() {
		return this.price;
	}
}
