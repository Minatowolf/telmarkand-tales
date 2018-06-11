package com.minatowolf.talesoftelmarkandmod.blocks;

import java.util.Random;

import com.minatowolf.talesoftelmarkandmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlueIceBlock extends BlockBase
{

	public BlueIceBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.GLASS);
		setHardness(2.8F);
		setResistance(14.0F);
		setHarvestLevel("pickaxe", 2);
		//SetLightOpacity(1);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.BLUE_ICE_SHARD;
    }

    public int quantityDropped(Random random)
    {
        return 2;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
}
