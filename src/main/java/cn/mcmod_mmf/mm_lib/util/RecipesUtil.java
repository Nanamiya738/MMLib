package cn.mcmod_mmf.mm_lib.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

public class RecipesUtil {

    public static CompoundNBT getItemTagCompound(ItemStack stack) {
        return stack.getOrCreateTag();
    }
    
}
