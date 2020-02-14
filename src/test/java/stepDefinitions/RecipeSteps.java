package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screens.RecipeScreen;

import static testUI.Utils.AppiumHelps.sleep;

public class RecipeSteps {
    private RecipeScreen recipeScreen = new RecipeScreen();

    @Given("I open the app")
    public void iOpenTheApp() {
        recipeScreen.checkMainScreen("OurGroceries", "RECIPES", "SHOPPING LIST");
        sleep(3000);
    }

    @When("I add a new recipe through settings button with name {string}")
    public void iAddANewRecipeThroughSettingsButtonWithNameRecipeName(String recipeName) {
        recipeScreen.pressMoreOptions();
        recipeScreen.pressAddRecipeInMoreOptionsMenu();
        recipeScreen.inputRecipeNameAndConfirm(recipeName);
        sleep(3000);
    }

    @When("I add a new recipe through input field {string} with name {string}")
    public void iAddANewRecipeThroughInputFieldWithName(String fieldName, String recipeName) {
        recipeScreen.addRecipeThroughInputField(fieldName, recipeName);
        sleep(3000);
    }

    @Then("I see the new recipe added with name {string}")
    public void iSeeTheNewRecipeAddedWithNameRecipeName(String recipeName) {
        recipeScreen.checkIfRecipeWasAdded(recipeName);
        sleep(1000);
    }

    @When("I enter the recipe {string}")
    public void iEnterTheRecipeRecipeName(String recipeName) {
        recipeScreen.openTheRecipe(recipeName);
        sleep(3000);
    }

    @And("I add a new ingredient {string}")
    public void iAddANewIngredientBread(String itemName) {
        recipeScreen.openItemList();
        sleep(1000);
        recipeScreen.addItemToRecipe(itemName);
        sleep(3000);
    }

    @Then("I see the new added ingredient {string}")
    public void iSeeTheNewAddedIngredientBread(String itemName) {
        recipeScreen.checkIfItemWasAdded(itemName);
        sleep(1000);
    }

    @And("I delete the the recipe")
    public void iDeleteTheTheRecipe() {
        recipeScreen.pressMoreOptions();
        recipeScreen.pressRecipeDeleteButtonAndConfirm();
    }

}
