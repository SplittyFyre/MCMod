package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemFood;

public class CustomFAC extends ItemFood{

	public CustomFAC(String name) {
		super(20, 2.5F, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setAlwaysEdible();
		setMaxStackSize(5);
		
	}


		
}

	


