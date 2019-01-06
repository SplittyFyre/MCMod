package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemFood;

public class ItemBacon extends ItemFood{

	public ItemBacon(String name) {
		super(8, 1.0F, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		setCreativeTab(mod.stdtab);
		
	}
	

}
