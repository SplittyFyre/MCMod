package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.Item;

public class FireGem extends Item{
	
	public FireGem(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
	}
	

}
