package org.splitfire.mod.init;

import org.splitfire.mod.init.blocks.crops.StrawBerryPlant;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class CropInit {
	
	public static Block strawberry_plant;
	
	public static void init() {
		
		strawberry_plant = new StrawBerryPlant("strawberry_plant", 0.1F, 0.1F);
		
	}
	
	public static void register() {
		registerBlock(strawberry_plant);
		
	}

	public static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}