package com.minatowolf.talesoftelmarkandmod.init;

import java.util.ArrayList;
import java.util.List;

import com.minatowolf.talesoftelmarkandmod.blocks.BlockBase;
import com.minatowolf.talesoftelmarkandmod.blocks.BlueIceBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	 
	public static final Block BLUE_ICE_BLOCK = new BlueIceBlock("blue_ice_block", Material.PACKED_ICE);
}
