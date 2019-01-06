package org.splitfire.mod.tabs;

import org.splitfire.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs{
	
	public ModTab(String label) {
		
		super("modtab");
		this.setBackgroundImageName("custom.png");
	}

	
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemInit.itemthing);
	
	}

}
