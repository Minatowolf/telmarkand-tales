package com.minatowolf.talesoftelmarkandmod.items.tools;

import com.minatowolf.talesoftelmarkandmod.Main;
import com.minatowolf.talesoftelmarkandmod.init.ModItems;
import com.minatowolf.talesoftelmarkandmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolWeapon extends ItemSword implements IHasModel
{
	public ToolWeapon(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
