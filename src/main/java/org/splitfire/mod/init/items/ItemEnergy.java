package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.Item;

public class ItemEnergy extends Item{
	
	public ItemEnergy(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
	}

}
