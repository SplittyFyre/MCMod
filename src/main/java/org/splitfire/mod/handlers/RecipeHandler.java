package org.splitfire.mod.handlers;

import org.splitfire.mod.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerCrafting()
	{
		GameRegistry.addShapelessRecipe(new ResourceLocation("makeboom"), new ResourceLocation("vanilla"), new ItemStack(Items.GUNPOWDER, 3)
				, new Ingredient[] {Ingredient.fromItems(Items.SUGAR), Ingredient.fromStacks (new ItemStack(Items.COAL, 1, 1)), Ingredient.fromItem(Items.REDSTONE), Ingredient.fromItem(ItemInit.science.setContainerItem(ItemInit.science))
	});
		GameRegistry.addShapedRecipe (new ResourceLocation("makemetalcans"), new ResourceLocation("notvanilla"),(new ItemStack(ItemInit.can)), new Object[] {"   ", " I ", " B ", 'I', Items.IRON_INGOT, 'B', Items.BUCKET});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("cannedbeef"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.canned_beef), new Ingredient[] {Ingredient.fromItem(Items.COOKED_BEEF), Ingredient.fromItem(ItemInit.can)});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("betterpork"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.bacon), new Ingredient[] {Ingredient.fromItem(Items.COOKED_PORKCHOP)});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("catsdish"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.fish_and_chips), new Ingredient[] {Ingredient.fromItem(Items.COOKED_FISH), Ingredient.fromItem(Items.BAKED_POTATO)});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("makeammo"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.musket_charge), new Ingredient[] {Ingredient.fromItem(Items.IRON_NUGGET), Ingredient.fromItem(Items.PAPER), Ingredient.fromItem(Items.GUNPOWDER), Ingredient.fromItem(ItemInit.science.setContainerItem(ItemInit.science))});
		
		GameRegistry.addShapedRecipe (new ResourceLocation("makeguns"), new ResourceLocation("notvanilla"),(new ItemStack(ItemInit.musket)), new Object[] {"I  ", " IS", "WIF", 'I', Items.IRON_INGOT, 'F', Items.FLINT_AND_STEEL, 'W', Blocks.PLANKS, 'S', ItemInit.science.setContainerItem(ItemInit.science)});
		
		GameRegistry.addShapedRecipe (new ResourceLocation("makeredgem"), new ResourceLocation("notvanilla"),(new ItemStack(ItemInit.fire_gem)), new Object[] {"BRB", "RER", "BRB", 'B', Items.BLAZE_POWDER, 'R', Items.REDSTONE, 'E', Blocks.EMERALD_BLOCK});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("makefirestaff"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.fire_staff), new Ingredient[] {Ingredient.fromItem(Items.STICK), Ingredient.fromItem(ItemInit.fire_gem), Ingredient.fromItem(Items.STONE_SWORD)});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("spikes"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.spike, 12, 0), new Ingredient[] {Ingredient.fromItem(Item.getItemFromBlock(Blocks.CACTUS))});
		
		GameRegistry.addShapedRecipe (new ResourceLocation("wilson"), new ResourceLocation("notvanilla"),(new ItemStack(ItemInit.science)), new Object[] {"SNS", "MDL", "WWW", 'S', Blocks.STONE, 'N', Items.GOLD_NUGGET, 'M', Items.RECORD_WARD, 'L', Blocks.LEVER, 'W', Items.STICK, 'D', Blocks.DIAMOND_BLOCK});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("makeenergy"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.energy), new Ingredient[] {Ingredient.fromItem(Items.NETHER_STAR), Ingredient.fromItem(Items.NETHER_STAR), Ingredient.fromItem(Item.getItemFromBlock(Blocks.BEACON)), Ingredient.fromItem(Item.getItemFromBlock(Blocks.TNT)),Ingredient.fromItem(ItemInit.science.setContainerItem(ItemInit.science))});
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("makenull"), new ResourceLocation("notvanilla"), new ItemStack(ItemInit.aether), new Ingredient[] {Ingredient.fromItem(Items.FIRE_CHARGE), Ingredient.fromItem(Items.BLAZE_POWDER), Ingredient.fromItem(Item.getItemFromBlock(Blocks.GRASS)), Ingredient.fromItem(Item.getItemFromBlock(Blocks.STONE)), Ingredient.fromItem(Items.WATER_BUCKET), Ingredient.fromItem(Items.GLASS_BOTTLE), Ingredient.fromItem(Items.ELYTRA), Ingredient.fromItem(ItemInit.energy), Ingredient.fromItem(Items.END_CRYSTAL)});
	

	}

	public static void registerSmelting() {
		
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ItemInit.cooked_egg), 10);
	}
	
}
	
