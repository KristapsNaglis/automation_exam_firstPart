package screens;

import testUI.elements.UIElement;

import static testUI.Utils.By.*;
import static testUI.elements.TestUI.E;

public class RecipeScreen {

    // Variables
    private final UIElement moreOptionsButton = E(byAccesibilityId("More options"));
    private final UIElement shoppingListInput = E(byAndroidUIAutomator("textContains(\"Add recipe\")"));
    private final UIElement deleteRecipeButton = E(byAndroidUIAutomator("textContains(\"Delete recipe\")"));
    private final UIElement recipeNameInputField = E(byId("editText"));
    private final UIElement confirmButton = E(byId("android:id/button1"));
    private final UIElement addItemField = E(byId("android:id/text1"));


    // Methods
    public RecipeScreen checkMainScreen(String... args) {
        for (String arg : args) {
            UIElement element =
                    E(byAndroidUIAutomator("textContains(\"" + arg + "\")"));
            element.waitFor(5).untilIsVisible();
        }

        return this;
    }

    public void pressMoreOptions(){
        moreOptionsButton.waitFor(5).untilIsVisible();
        moreOptionsButton.click();
    }

    public void pressAddRecipeInMoreOptionsMenu(){
        shoppingListInput.waitFor(5).untilIsVisible();
        shoppingListInput.click();
    }

    public void inputRecipeNameAndConfirm(String recipeName){
        recipeNameInputField.waitFor(5).untilIsVisible();
        recipeNameInputField.sendKeys(recipeName);
        confirmButton.waitFor(5).untilIsVisible();
        confirmButton.click();
    }

    public RecipeScreen checkIfRecipeWasAdded(String recipeName) {
        UIElement newRecipe = E(byAndroidUIAutomator("textContains(\"" + recipeName + "\")"));
        newRecipe.waitFor(5).untilIsVisible();

        return this;
    }

    public void openTheRecipe(String recipeName){
        UIElement newRecipe = E(byAndroidUIAutomator("textContains(\"" + recipeName + "\")"));
        newRecipe.waitFor(5).untilIsVisible();
        newRecipe.click();
    }

    public void openItemList(){
        addItemField.waitFor(5).untilIsVisible();
        addItemField.click();
    }

    public void addItemToRecipe(String itemName){
        UIElement itemBread = E(byAndroidUIAutomator("textContains(\"" + itemName + "\")"));
        itemBread.click();
    }

    public RecipeScreen checkIfItemWasAdded(String itemName) {
        UIElement newItem = E(byAndroidUIAutomator("textContains(\"" + itemName + "\")"));
        newItem.waitFor(5).untilIsVisible();

        return this;
    }

    public void pressRecipeDeleteButtonAndConfirm(){
        deleteRecipeButton.waitFor(5).untilIsVisible();
        deleteRecipeButton.click();
        confirmButton.waitFor(5).untilIsVisible();
        confirmButton.click();
    }

    public void addRecipeThroughInputField(String fieldName, String recipeName){
        UIElement newRecipeField = E(byAndroidUIAutomator("textContains(\"" + fieldName + "\")"));
        newRecipeField.waitFor(5).untilIsVisible();
        newRecipeField.click();

        inputRecipeNameAndConfirm(recipeName);
    }

}
