package com.minatowolf.talesoftelmarkandmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(ModItems.BLUE_ICE_SHARD, 4), new ItemStack(ModItems.BLUE_ICE_INGOT, 1), 5.0f);
	}
}
