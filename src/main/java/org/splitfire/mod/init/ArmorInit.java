package org.splitfire.mod.init;

import org.splitfire.mod.Reference;
import org.splitfire.mod.init.armor.CustomArmor;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmorInit {
	
		public static final ArmorMaterial hiking_stuff = EnumHelper.addArmorMaterial("hiking_material", Reference.MOD_ID + ":hiking_boots", 30, new int[] {0, 0, 0, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.4F);
		
		public static Item hiking_boots;
		
		public static void init() {
			hiking_boots = new CustomArmor("hiking_boots", hiking_stuff, 1, EntityEquipmentSlot.FEET);
		}
		
		public static void register() {
			registerItem(hiking_boots);
			
		}
		
		public static void registerItem(Item item) {
			ForgeRegistries.ITEMS.register(item);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}

}
