package decorator;

public class Espresso implements Coffee {
	@Override
	public double getCost() {
		return 100.0;
	}
	
	@Override
	public String getDescription() {
		return "Espresso";
		
	}

}
