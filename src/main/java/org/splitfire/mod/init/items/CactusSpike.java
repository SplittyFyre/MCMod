package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.Item;

public class CactusSpike extends Item{
	
	public CactusSpike(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
	}

}
