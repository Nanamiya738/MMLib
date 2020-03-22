package cn.mcmod_mmf.mm_lib.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase {
	private final String modid;
	private final String[] subNames;
	private final int stackSize;
	private final Item containerItem;
	private final ItemGroup creativeTab;
	public ItemBase(String modid,ItemGroup creativeTab, int stackSize,Item containerItem, String... subNames) {
		this.modid = modid;
		this.creativeTab=creativeTab;
		this.stackSize = stackSize;
		this.subNames = subNames;
		this.containerItem = containerItem;
	}
	public String[] getSubNames() {
		return subNames;
	}
	public int getStackSize() {
		return stackSize;
	}
	public Item getContainerItem() {
		return containerItem;
	}
	public String getModid() {
		return modid;
	}
	public ItemGroup getCreativeTab() {
		return creativeTab;
	}

}
