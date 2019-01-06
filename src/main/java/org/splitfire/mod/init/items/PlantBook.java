package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PlantBook extends Item{
	
	public PlantBook(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setCreativeTab(mod.stdtab);
	
	
}
	public EnumActionResult onItemUse(EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand handIn, EnumFacing facing, float hitX, float hitY, float hitZ){
	
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		IBlockState iblockstate = worldIn.getBlockState(pos);
		
	if (iblockstate.getBlock() instanceof IGrowable)
    {
        IGrowable igrowable = (IGrowable)iblockstate.getBlock();

        if (igrowable.canGrow(worldIn, pos, iblockstate, worldIn.isRemote))
        {
            if (!worldIn.isRemote)
            {
                if (igrowable.canUseBonemeal(worldIn, worldIn.rand, pos, iblockstate))
                {
                    igrowable.grow(worldIn, worldIn.rand, pos, iblockstate);    //idealy make it insta-grow
                }


                
            }
            
        }
        
    }
	return EnumActionResult.SUCCESS;
	
	}
	
}
	

 