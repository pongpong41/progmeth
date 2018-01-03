package model.food;

import java.util.Arrays;

public class Food {
	private static final int AMOUNT_INGREDIENT = 2;
	private Boolean[] ingredients = new Boolean[AMOUNT_INGREDIENT];
	
	public Food(boolean haveMeat, boolean haveS) {
		ingredients[0] = haveMeat;
		ingredients[1] = haveS;
	}
	
	@Override
	public boolean equals(Object o) {
		Food food = (Food) o;
		for (int i=0; i<AMOUNT_INGREDIENT; i++) {
			if (this.ingredients[i] != food.ingredients[i]) return false;
		}
		return true;
	}
	
	public boolean IsfoodEmpty() {
		for (int i=0; i<AMOUNT_INGREDIENT; i++) {
			if (ingredients[i] == true) return false;
		}
		return true;
	}
	
	public boolean getIngredient(int i) {
		return ingredients[i];
	}
	
	public int printFood() {
		//return Arrays.toString(ingredients);
		return ingredients.length;
	}
	
	public void setIngredient(int i, boolean have) {
		ingredients[i] = have;
	}
}
