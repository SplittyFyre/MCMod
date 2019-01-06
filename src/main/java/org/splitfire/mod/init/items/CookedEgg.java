package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemFood;

public class CookedEgg extends ItemFood{

	public CookedEgg(String name) {
		super(3, 0.4F, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setAlwaysEdible();
		setMaxStackSize(64);
	}
	
	

}
