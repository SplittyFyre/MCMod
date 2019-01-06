package org.splitfire.mod.init;

import org.splitfire.mod.init.tools.CustomTool;
import org.splitfire.mod.init.tools.DarkSword;
import org.splitfire.mod.init.tools.SwissKnife;
import org.splitfire.mod.init.tools.WeaponSpear;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit {
	
		public static final ToolMaterial paxel_material = EnumHelper.addToolMaterial ("paxel_material", 3, 1500, 8.0F, 5.0F, 10);
		public static final ToolMaterial dankness = EnumHelper.addToolMaterial("dankness", 3, 1500, 10.0F, 22.1337F, 1);
		public static final ToolMaterial swas = EnumHelper.addToolMaterial("swas", 3, 1000, 7.0F, 6.0F, 1);
		public static final ToolMaterial flint = EnumHelper.addToolMaterial("flint", 1, 149, 2.0F, 2.0F, 2);
		
		public static Item paxel;
		public static Item dark_sword;
		public static Item swiss;
		public static Item spear;
		
		public static void init() {
			paxel = new CustomTool("paxel", paxel_material);
			dark_sword = new DarkSword("dark_sword", dankness);
			swiss = new SwissKnife("swiss", swas);
			spear = new WeaponSpear("spear", flint);
		}
		
		public static void register() {
			registerItem(paxel);
			registerItem(dark_sword);
			registerItem(swiss);
			registerItem(spear);
			
		}
		
		public static void registerItem(Item item) {
			ForgeRegistries.ITEMS.register(item);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}

		
}
