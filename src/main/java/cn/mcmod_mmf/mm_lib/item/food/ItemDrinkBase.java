package cn.mcmod_mmf.mm_lib.item.food;

import cn.mcmod_mmf.mm_lib.item.ItemBase;
import net.minecraft.item.ItemGroup;

public class ItemDrinkBase extends ItemBase {
	private final DrinkInfo[] info;
	private boolean fastEat;
	private boolean alwaysEdible;

	public ItemDrinkBase(String modid,ItemGroup creativeTab, int stackSize,DrinkInfo[] info) {
		super(modid, creativeTab, stackSize, null, new String[]{});
		this.info=info;
	}

	public DrinkInfo[] getInfo() {
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
