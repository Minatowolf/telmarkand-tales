package com.minatowolf.talesoftelmarkandmod.init;

import java.util.ArrayList;
import java.util.List;

import com.minatowolf.talesoftelmarkandmod.items.ItemBase;
import com.minatowolf.talesoftelmarkandmod.items.tools.ToolPickaxe;
import com.minatowolf.talesoftelmarkandmod.items.tools.ToolSpade;
import com.minatowolf.talesoftelmarkandmod.items.tools.ToolWeapon;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_BLUE_ICE = EnumHelper.addToolMaterial("material_blue_ice", 3, 400, 7.0F, 4.0F, 32);
	public static final ToolMaterial MATERIAL_ICE_SWORD = EnumHelper.addToolMaterial("material_ice_sword", 3, 400, 7.0F, 5.0F, 32);
	//iTEMS
	public static final Item BLUE_ICE_INGOT = new ItemBase("blue_ice_ingot");
	public static final Item BLUE_ICE_SHARD = new ItemBase("blue_ice_shard");
	public static final Item TENSILE_MERCURY_FLASK = new ItemBase("tensile_mercury_flask");
	public static final Item BACK_DOOR_KEY = new ItemBase("back_door_key");
	public static final Item FRONT_DOOR_KEY = new ItemBase("front_door_key");
	public static final Item FAIRY_WING_PILLS = new ItemBase("fairy_wing_pills");
	//Tools
	public static final ItemSword BLUE_ICE_SPEAR = new ToolWeapon("blue_ice_spear", MATERIAL_BLUE_ICE);
	public static final ItemSword BLUE_ICE_SWORD = new ToolWeapon("blue_ice_sword", MATERIAL_ICE_SWORD);
	public static final ItemSpade BLUE_ICE_SHOVEL = new ToolSpade("blue_ice_shovel", MATERIAL_BLUE_ICE);
	public static final ItemPickaxe BLUE_ICE_PICKAXE = new ToolPickaxe("blue_ice_pickaxe", MATERIAL_BLUE_ICE);
}
