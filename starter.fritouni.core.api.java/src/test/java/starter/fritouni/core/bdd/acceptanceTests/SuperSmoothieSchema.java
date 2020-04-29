package starter.fritouni.core.bdd.acceptanceTests;

import java.util.HashMap;
import java.util.Map;

public class SuperSmoothieSchema {

	private Map<String, Integer> pointsPerCategory = new HashMap<>();
	private DrinkCatalog catalog;
	
	public SuperSmoothieSchema( DrinkCatalog catalog) {
		this.catalog = catalog;
	} 
	
	public void setPointsPerCategory(String category, Integer points) {
		pointsPerCategory.put(category, points);
	
	}

	public int getPointsFor(String drink) {
		return pointsPerCategory.get(CategoryOf(drink));
	}

	

	private Object CategoryOf(String drink) {
		return catalog.getCategoryOf(drink);
	}

}
