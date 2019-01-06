package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.Item;

public class ScienceMachine extends Item{
	
	public ScienceMachine(String name){
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(mod.stdtab);
		
	}

}
