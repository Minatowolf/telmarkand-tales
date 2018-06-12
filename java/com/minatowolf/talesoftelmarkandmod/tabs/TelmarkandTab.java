package com.minatowolf.talesoftelmarkandmod.tabs;

import com.minatowolf.talesoftelmarkandmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TelmarkandTab extends CreativeTabs
{
	public TelmarkandTab(String label)
	{
		super("telmarkandtab");
		//this.setBackgroundImageName("telmarkand.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.BLUE_ICE_SPEAR);
	}
}
