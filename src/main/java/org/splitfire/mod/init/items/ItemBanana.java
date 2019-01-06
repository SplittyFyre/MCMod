package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemFood;

public class ItemBanana extends ItemFood{

	public ItemBanana(String name) {
		super(4, 0.5F, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setAlwaysEdible();
		setMaxStackSize(64);
		
	}

}
