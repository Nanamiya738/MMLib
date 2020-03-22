package cn.mcmod_mmf.mm_lib.item.food;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FoodContainItem extends Item {

	public FoodContainItem(Properties properties) {
		super(properties);
	}
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		super.onItemUseFinish(stack, worldIn, entityLiving);
		if (entityLiving instanceof PlayerEntity) {
			PlayerEntity entityplayer = (PlayerEntity) entityLiving;
			if(stack.getMaxStackSize()>1){
				if(!entityplayer.inventory.addItemStackToInventory(getContainerItem(stack)))
					entityplayer.dropItem(getContainerItem(stack), true);
				stack.shrink(1);
		        return stack;
			}
		}
		return getContainerItem(stack);
	}
}
