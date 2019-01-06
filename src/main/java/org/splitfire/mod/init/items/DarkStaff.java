package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DarkStaff extends Item{
	
	public DarkStaff(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setMaxDamage(99);
		
	
	}
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
   
	if (!worldIn.isRemote)
        {
            ItemStack itemstack = player.getHeldItem(hand);
            EntityLightningBolt entitysmite = new EntityLightningBolt(worldIn, hitZ, hitZ, hitZ, bFull3D);
            entitysmite.setPosition((double)((float)pos.getX() + hitX), (double)((float)pos.getY() + hitY), (double)((float)pos.getZ() + hitZ));
            worldIn.addWeatherEffect(entitysmite);
            worldIn.addWeatherEffect(entitysmite);

            if (!player.capabilities.isCreativeMode)
            {
                itemstack.damageItem(1, player);
                player.addExperience(-10);
            }
        }

        return EnumActionResult.SUCCESS;
    }


}