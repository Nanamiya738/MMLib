package cn.mcmod_mmf.mm_lib.item.food;

import cn.mcmod_mmf.mm_lib.item.ItemBase;
import net.minecraft.item.ItemGroup;

public class ItemFoodBase extends ItemBase {
	private final FoodInfo[] info;
	private boolean fastEat;
	private boolean alwaysEdible;

	public ItemFoodBase(String modid,ItemGroup creativeTab, int stackSize,FoodInfo[] info) {
		super(modid, creativeTab, stackSize, null, new String[]{});
		this.info=info;
	}

	public FoodInfo[] getInfo() {
		return info;
	}

	public boolean isFastEat() {
		return fastEat;
	}

	public void setFastEat(boolean fastEat) {
		this.fastEat = fastEat;
	}

	public boolean isAlwaysEdible() {
		return alwaysEdible;
	}

	public void setAlwaysEdible(boolean alwaysEdible) {
		this.alwaysEdible = alwaysEdible;
	}

}
