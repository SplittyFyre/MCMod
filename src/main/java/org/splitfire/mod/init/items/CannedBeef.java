package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemFood;

public class CannedBeef extends ItemFood{

	public CannedBeef(String name) {
		super(10, 1.2F, true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setMaxStackSize(20);
		setAlwaysEdible();
		
	}

	
		
	}


