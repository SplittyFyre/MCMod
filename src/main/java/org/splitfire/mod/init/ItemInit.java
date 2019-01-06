package org.splitfire.mod.init;

import org.splitfire.mod.init.items.BlowGun;
import org.splitfire.mod.init.items.CactusSpike;
import org.splitfire.mod.init.items.CannedBeef;
import org.splitfire.mod.init.items.CookedEgg;
import org.splitfire.mod.init.items.CustomFAC;
import org.splitfire.mod.init.items.CustomMisc;
import org.splitfire.mod.init.items.Dapple;
import org.splitfire.mod.init.items.DarkStaff;
import org.splitfire.mod.init.items.EndNighBook;
import org.splitfire.mod.init.items.FireGem;
import org.splitfire.mod.init.items.FireWand;
import org.splitfire.mod.init.items.IceWand;
import org.splitfire.mod.init.items.ItemAether;
import org.splitfire.mod.init.items.ItemBacon;
import org.splitfire.mod.init.items.ItemBanana;
import org.splitfire.mod.init.items.ItemEnergy;
import org.splitfire.mod.init.items.ItemOldGun;
import org.splitfire.mod.init.items.MusketCharge;
import org.splitfire.mod.init.items.PlantBook;
import org.splitfire.mod.init.items.ScienceMachine;
import org.splitfire.mod.init.items.SeedStrawberry;
import org.splitfire.mod.init.items.TinCan;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{	
	public static Item itemthing;
	public static ItemFood fish_and_chips;
	public static Item can;
	public static ItemFood banana;
	public static ItemFood canned_beef;
	public static ItemFood diamond_apple;
	public static ItemBow blow_gun;
	public static ItemFood bacon;
	public static ItemBow musket;
	public static Item musket_charge;
	public static ItemFood cooked_egg;
	public static Item fire_staff;
	public static Item ice_staff;
	public static Item dark_staff;
	public static Item fire_gem;
	public static Item spike;
	public static Item science;
	public static Item energy;
	public static Item aether;
	public static ItemSeedFood strawberry;
	public static Item endnighbook;
	public static Item plantbook;
	
	public static void init() {
		itemthing = new CustomMisc("itemthing");
		fish_and_chips = new CustomFAC("fish_and_chips");
		can = new TinCan("can");
		banana = new ItemBanana("banana");
		canned_beef = new CannedBeef("canned_beef");
		diamond_apple = new Dapple("diamond_apple");
		blow_gun = new BlowGun("blow_gun");
		bacon = new ItemBacon("bacon");
		musket = new ItemOldGun("musket");
		musket_charge = new MusketCharge("musket_charge");
		cooked_egg = new CookedEgg("cooked_egg");
		fire_staff = new FireWand("fire_staff");
		ice_staff = new IceWand("ice_staff");
		dark_staff = new DarkStaff("dark_staff");
		fire_gem = new FireGem("fire_gem");
		spike = new CactusSpike("spike");
		science = new ScienceMachine("science");
		energy = new ItemEnergy("energy");
		aether = new ItemAether("aether");
		strawberry = new SeedStrawberry("strawberry");
		endnighbook = new EndNighBook("endnighbook");
		plantbook = new PlantBook("plantbook");
	}
	
	public static void register() {
		registerItem(itemthing);
		registerItem(fish_and_chips);
		registerItem(can);
		registerItem(banana);
		registerItem(canned_beef);
		registerItem(diamond_apple);
		registerItem(blow_gun);
		registerItem(bacon);
		registerItem(musket);
		registerItem(musket_charge);
		registerItem(cooked_egg);
		registerItem(fire_staff);
		registerItem(ice_staff);
		registerItem(dark_staff);
		registerItem(fire_gem);
		registerItem(spike);
		registerItem(science);
		registerItem(energy);
		registerItem(aether);
		registerItem(strawberry);
		registerItem(endnighbook);
		registerItem(plantbook);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
