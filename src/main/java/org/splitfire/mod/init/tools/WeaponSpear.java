package org.splitfire.mod.init.tools;

import org.splitfire.mod.mod;

import net.minecraft.item.ItemSword;

public class WeaponSpear extends ItemSword{

	public WeaponSpear(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(mod.stdtab);
		setMaxDamage(149);
	}

}
