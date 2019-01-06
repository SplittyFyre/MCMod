package org.splitfire.mod.init.tools;

import net.minecraft.item.ItemPickaxe;

public class CustomTool extends ItemPickaxe {

	public CustomTool(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}

}
