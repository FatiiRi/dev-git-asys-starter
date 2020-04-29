package starter.fritouni.core.bdd.acceptanceTests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcceptanceTestsStepDefinitions {
	
	private DrinkCatalog drinkCatalog = new DrinkCatalog();
	private SuperSmoothieSchema superSmoothieSchema = new SuperSmoothieSchema(drinkCatalog);
	private MorningFreshnessMember michael;
	
	@Given("the fallowing drink categories")
	public void the_fallowing_drink_categories(List<Map<String,String>> drinkCategories) {
	   drinkCategories.stream().forEach(
			   drinkCategory -> {
				   String drink = drinkCategory.get("Drink");
				   String category = drinkCategory.get("Category");
				   Integer points = Integer.parseInt(drinkCategory.get("Points"));

				   drinkCatalog.addDring(drink, category);
				   superSmoothieSchema.setPointsPerCategory(category, points);
			   }
			   );
	}

	@Given("^(.*) is a morning Freshness Member$")
	public void micheal_is_a_morning_Freshness_Member(String name) {
		
		michael = new MorningFreshnessMember(name,superSmoothieSchema);
	}

	@When("^(.*) purchases (\\d+) (.*) drinks?")
	public void michael_purchases_2_Dring_drinks(String name,
			Integer amount, 
			String drink) {
		michael.orders(amount, drink);

	}

	@Then("he should earn {int} points")
	public void he_should_earn_points(Integer expectedPoints) {
	    assertThat(michael.getPoints()).isEqualTo(expectedPoints);
	}

}
