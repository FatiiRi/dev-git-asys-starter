package starter.fritouni.core.bdd.acceptanceTests;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

	Map<String, String> drinkCategories = new HashMap<>();
	
	public void addDring(String drink, String category) {
		
		drinkCategories.put(drink, category);
	}

	public Object getCategoryOf(String drink) {
		return drinkCategories.get(drink);
	}
	

}
