package cn.mcmod_mmf.mm_lib.item.food;

import net.minecraft.item.ItemStack;

public class FoodInfo {
	private final String name;
	private final int amount;
	private final float calories;
	private final boolean isMeat;
	private final ItemStack container;
	//TFC-TNG FoodHandler parameters
	private final float water;
	private final float carbohydrates;
	private final float fat;
	private final float protein;
	private final float vitamins;
	private final float minerals;
	private final boolean isNonDecaying;
	private final float decayModifier;
	private final boolean heatable;
	private final float heatCapacity;
	private final float cookingTemp;

	public FoodInfo(String name,int amount,float calories,boolean iswolffood,ItemStack container) {
		this(name,amount, calories, iswolffood, container, 1f, 1f,0f,0f,0f,0f,1f,0f,0f);
	}
	
	public FoodInfo(String name,int amount,float calories,boolean iswolffood,ItemStack container, float water, float carbohydrates, float fat, float protein, float vitamins,
			float minerals, float decayModifier, float heatCapacity, float cookingTemp) {
		this.name = name;
		this.amount = amount;
		this.calories = calories;
		this.isMeat = iswolffood;
		this.container = container;
		//TFC-TNG FoodHandler parameters
		this.water = water;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
		this.protein = protein;
		this.vitamins = vitamins;
		this.minerals = minerals;
		this.decayModifier = decayModifier;
		this.isNonDecaying = decayModifier <= 0;
		this.heatable = cookingTemp >= 0;
		this.heatCapacity = heatCapacity;
		this.cookingTemp = cookingTemp;
	}

	public int getAmount() {
		return amount;
	}
	
	public boolean isMeat() {
		return isMeat;
	}
	
	public float getCalories() {
		return calories;
	}

	public float getDecayModifier() {
		return decayModifier;
	}

	public float getWater() {
		return water;
	}

	public float[] getNutrients() {
		return new float[] { carbohydrates, fat, protein, vitamins, minerals };
	}

	public boolean isHeatable() {
		return heatable;
	}
	
	public boolean isNeverDecay() {
		return isNonDecaying;
	}

	public float getHeatCapacity() {
		return heatCapacity;
	}

	public float getCookingTemp() {
		return cookingTemp;
	}

	public String getName() {
		return name;
	}

	public ItemStack getContainer() {
		return container;
	}

}
