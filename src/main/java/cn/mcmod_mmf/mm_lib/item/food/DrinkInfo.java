package cn.mcmod_mmf.mm_lib.item.food;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;

public class DrinkInfo {
	private final String name;
	private final ItemStack container;
	private final EffectInstance[] effect;
	//TFC-TNG FoodHandler parameters
	private final float carbohydrates;
	private final float fat;
	private final float protein;
	private final float vitamins;
	private final float minerals;
	private final boolean isNonDecaying;
	private final float decayModifier;

	public DrinkInfo(String name,ItemStack container,EffectInstance[] effect) {
		this(name,container,effect,1f,0f,0f,0f,0f,1f);
	}
	
	public DrinkInfo(String name,ItemStack container,EffectInstance[] effect, float carbohydrates, float fat, float protein, float vitamins,
			float minerals, float decayModifier) {
		this.name = name;
		this.container = container;
		this.effect = effect;
		//TFC-TNG FoodHandler parameters
		this.carbohydrates = carbohydrates;
		this.fat = fat;
		this.protein = protein;
		this.vitamins = vitamins;
		this.minerals = minerals;
		this.decayModifier = decayModifier;
		this.isNonDecaying = decayModifier <= 0;

	}

	public float getDecayModifier() {
		return decayModifier;
	}

	public float[] getNutrients() {
		return new float[] { carbohydrates, fat, protein, vitamins, minerals };
	}

	public boolean isNeverDecay() {
		return isNonDecaying;
	}

	public String getName() {
		return name;
	}

	public ItemStack getContainer() {
		return container;
	}

	public EffectInstance[] getEffect() {
		return effect;
	}

}
