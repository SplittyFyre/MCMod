package org.splitfire.mod.init.blocks.crops;

import org.splitfire.mod.mod;
import org.splitfire.mod.init.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class StrawBerryPlant extends BlockCrops{
	
	public StrawBerryPlant(String name, float hardness, float resistance) {
		
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(mod.stdtab);
	}
	
	@Override
	protected Item getSeed()
	{
		return ItemInit.strawberry;
	}
	
	@Override
	protected Item getCrop() 
	{
		return ItemInit.strawberry;
	}
	
}
