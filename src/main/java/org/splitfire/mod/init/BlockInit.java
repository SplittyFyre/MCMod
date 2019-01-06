package org.splitfire.mod.init;

import org.splitfire.mod.init.blocks.CustomBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
	
	public static Block blockpoop;
	
	public static void init() {
		
		blockpoop = new CustomBlock("blockpoop", 0.1F, 0.1F);
		
	}
	
	public static void register() {
		registerBlock(blockpoop);
		
	}

	public static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
