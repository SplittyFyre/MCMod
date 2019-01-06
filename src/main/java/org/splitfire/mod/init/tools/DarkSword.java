package org.splitfire.mod.init.tools;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemSword;

public class DarkSword extends ItemSword{

	public DarkSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setMaxDamage(99);
		setCreativeTab(mod.stdtab);
	}
	
	
}
			
		
	


