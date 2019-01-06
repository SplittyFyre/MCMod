package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EndNighBook extends Item{
	
	public EndNighBook(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setMaxStackSize(1);
		setMaxDamage(19);
	}
	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.damageItem(1, playerIn);;
        }

        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_ENDERDRAGON_GROWL, SoundCategory.HOSTILE, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {	
        
        	 EntityLightningBolt entitybolt1 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt1.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt1);
             EntityLightningBolt entitybolt2 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt2.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt2);
             EntityLightningBolt entitybolt3 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt3.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt3);
             EntityLightningBolt entitybolt4 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt4.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt4);
             EntityLightningBolt entitybolt5 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt5.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt5);
             EntityLightningBolt entitybolt6 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt6.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt6);
             EntityLightningBolt entitybolt7 = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
        	 entitybolt7.setPosition(playerIn.posX + Math.random() * (12 - -12) + -12, playerIn.posY, playerIn.posZ + Math.random() * (12 - -12) + -12);
             worldIn.addWeatherEffect(entitybolt7);
             
             
             
             
             
             
             
             
             
        }

        return EnumActionResult.SUCCESS;
    }
}
