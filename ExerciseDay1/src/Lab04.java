import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lab04 {
	private static List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
public static void main(String args[])
{
	Predicate<Item> morethanrwenty = Item::checkMorethanTwenty;
	Function<Item, Double> discount = Item::discount;
	
	

	
	System.out.println(items.stream().filter(morethanrwenty).map(discount).reduce((first,next) -> first+ next).get());
	
	
}

}
 class Item {
	private String name;
	private double price;
	
	double total;
	

	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	public boolean checkMorethanTwenty()
	{
		return this.getPrice() > 20d;
	}
	
	public double discount()
	{
		this.price = getPrice()- getPrice() * .2d;
		return this.price;
	}
}