package org.splitfire.mod.init.items;

import org.splitfire.mod.mod;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class IceWand extends Item{
	
	public IceWand(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(mod.stdtab);
		setMaxDamage(99);
	}
	
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		   
		if (!worldIn.isRemote)
	        {
	            ItemStack itemstack = player.getHeldItem(hand);
	            Block blk = Blocks.PACKED_ICE;
	            BlockPos yay1 = new BlockPos(pos.getX() + 1, pos.getY() + 1, pos.getZ());
	            BlockPos yay2 = new BlockPos(pos.getX() + 1, pos.getY() + 2, pos.getZ());
	            BlockPos yay3 = new BlockPos(pos.getX() + 1, pos.getY() + 3, pos.getZ());//+, null
	            BlockPos yay4 = new BlockPos(pos.getX() - 1, pos.getY() + 1, pos.getZ());
	            BlockPos yay5 = new BlockPos(pos.getX() - 1, pos.getY() + 2, pos.getZ());
	            BlockPos yay6 = new BlockPos(pos.getX() - 1, pos.getY() + 3, pos.getZ());//-, null
	            BlockPos yay7 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() + 1);
	            BlockPos yay8 = new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ() + 1);
	            BlockPos yay9 = new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ() + 1);//null, +
	            BlockPos yay10 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() - 1);
	            BlockPos yay11 = new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ() - 1);
	            BlockPos yay12 = new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ() - 1);//null, -
	            BlockPos yay13 = new BlockPos(pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1);
	            BlockPos yay14 = new BlockPos(pos.getX() + 1, pos.getY() + 2, pos.getZ() + 1);
	            BlockPos yay15 = new BlockPos(pos.getX() + 1, pos.getY() + 3, pos.getZ() + 1);//+, +
	            BlockPos yay16 = new BlockPos(pos.getX() - 1, pos.getY() + 1, pos.getZ() - 1);
	            BlockPos yay17 = new BlockPos(pos.getX() - 1, pos.getY() + 2, pos.getZ() - 1);
	            BlockPos yay18 = new BlockPos(pos.getX() - 1, pos.getY() + 3, pos.getZ() - 1);//-, -
	            BlockPos yay19 = new BlockPos(pos.getX() + 1, pos.getY() + 1, pos.getZ() - 1);
	            BlockPos yay20 = new BlockPos(pos.getX() + 1, pos.getY() + 2, pos.getZ() - 1);
	            BlockPos yay21 = new BlockPos(pos.getX() + 1, pos.getY() + 3, pos.getZ() - 1);//+, -
	            BlockPos yay22 = new BlockPos(pos.getX() - 1, pos.getY() + 1, pos.getZ() + 1);
	            BlockPos yay23 = new BlockPos(pos.getX() - 1, pos.getY() + 2, pos.getZ() + 1);
	            BlockPos yay24 = new BlockPos(pos.getX() - 1, pos.getY() + 3, pos.getZ() + 1);//-, +
	            BlockPos yay25 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
	            BlockPos yay26 = new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ());
	            BlockPos yay27 = new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ());//null, null
	            
	            worldIn.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.PLAYERS, 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
	            
	            worldIn.setBlockState(yay1, blk.getDefaultState());
	            worldIn.setBlockState(yay2, blk.getDefaultState());
	            worldIn.setBlockState(yay3, blk.getDefaultState());
	            worldIn.setBlockState(yay4, blk.getDefaultState());
	            worldIn.setBlockState(yay5, blk.getDefaultState());
	            worldIn.setBlockState(yay6, blk.getDefaultState());
	            worldIn.setBlockState(yay7, blk.getDefaultState());
	            worldIn.setBlockState(yay8, blk.getDefaultState());
	            worldIn.setBlockState(yay9, blk.getDefaultState());
	            worldIn.setBlockState(yay10, blk.getDefaultState());
	            worldIn.setBlockState(yay11, blk.getDefaultState());
	            worldIn.setBlockState(yay12, blk.getDefaultState());
	            worldIn.setBlockState(yay13, blk.getDefaultState());
	            worldIn.setBlockState(yay14, blk.getDefaultState());
	            worldIn.setBlockState(yay15, blk.getDefaultState());
	            worldIn.setBlockState(yay16, blk.getDefaultState());
	            worldIn.setBlockState(yay17, blk.getDefaultState());
	            worldIn.setBlockState(yay18, blk.getDefaultState());
	            worldIn.setBlockState(yay19, blk.getDefaultState());
	            worldIn.setBlockState(yay20, blk.getDefaultState());
	            worldIn.setBlockState(yay21, blk.getDefaultState());
	            worldIn.setBlockState(yay22, blk.getDefaultState());
	            worldIn.setBlockState(yay23, blk.getDefaultState());
	            worldIn.setBlockState(yay24, blk.getDefaultState());
	            worldIn.setBlockState(yay25, blk.getDefaultState());
	            worldIn.setBlockState(yay26, blk.getDefaultState());
	            worldIn.setBlockState(yay27, blk.getDefaultState());
	               
	        }

	        return EnumActionResult.SUCCESS;
	    }
}

	

		

        




	



