package cn.mcmod_mmf.mm_lib.item;

import cn.mcmod_mmf.mm_lib.item.food.FoodContainItem;
import cn.mcmod_mmf.mm_lib.item.food.FoodInfo;
import cn.mcmod_mmf.mm_lib.item.food.ItemFoodBase;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {

	public static void register(String modid, ItemBase item) {
		Item.Properties itemProperties = new Item.Properties();
		itemProperties.maxStackSize(item.getStackSize());
		if(item.getCreativeTab()!=null)itemProperties.group(item.getCreativeTab());
		if(item.getContainerItem()!=null)itemProperties.containerItem(item.getContainerItem());
		Item newItem = new Item(itemProperties);
		for(String name:item.getSubNames()){
			newItem.setRegistryName(modid, name);
			ForgeRegistries.ITEMS.register(newItem);
		}
	}
	public static void register(String modid, ItemFoodBase item) {
		Item.Properties itemProperties = new Item.Properties();
		itemProperties.maxStackSize(item.getStackSize());
		if(item.getCreativeTab()!=null)itemProperties.group(item.getCreativeTab());
		if(item.getContainerItem()!=null)itemProperties.containerItem(item.getContainerItem());
		Item newItem = new Item(itemProperties);
		Food.Builder builder = new Food.Builder();
		if(item.isFastEat())builder.fastToEat();
		if(item.isAlwaysEdible())builder.setAlwaysEdible();
		for(FoodInfo info:item.getInfo()){
			if(info.isMeat())builder.meat();
			itemProperties.food(builder.hunger(info.getAmount()).saturation(info.getAmount()).build());
			if(!info.getContainer().isEmpty())newItem = new FoodContainItem(itemProperties);
			newItem.setRegistryName(modid, info.getName());
			ForgeRegistries.ITEMS.register(newItem);
		}
	}

}
