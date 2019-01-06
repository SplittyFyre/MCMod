package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;
import org.splitfire.mod.init.entities.mobs.clockworks.EntityClockKnight;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomMisc extends Item {
	
	public CustomMisc(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
	}
	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ){
		
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
        EntityClockKnight ant = new EntityClockKnight(worldIn);
        ant.setPosition((double)((float)pos.getX() + hitX), (double)((float)pos.getY() + hitY), (double)((float)pos.getZ() + hitZ));
		worldIn.spawnEntity(ant);
        
	return EnumActionResult.SUCCESS;
	
	}
	
}

