package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class FireWand extends Item{
	
	public FireWand(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setMaxDamage(99);
	}
	
	

	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.damageItem(1, playerIn);;
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_WITHER_SHOOT, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {	
        
        	 EntitySnowball entitysnowball = new EntitySnowball(worldIn, playerIn);
             entitysnowball.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
             worldIn.spawnEntity(entitysnowball);
             EntityLargeFireball balz = new EntityLargeFireball(worldIn);
             balz.setPosition(entitysnowball.posX, entitysnowball.posY, entitysnowball.posZ);
             worldIn.spawnEntity(balz);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }
}
		

        
