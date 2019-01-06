package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;
import org.splitfire.mod.init.ItemInit;

import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;

public class Dapple extends ItemAppleGold{

	public Dapple(String name) {
		super(20, 10.0F, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		setCreativeTab(mod.stdtab);
		setDamage(new ItemStack(ItemInit.diamond_apple), 2);
		
	}

	
		
}
	

	
	
