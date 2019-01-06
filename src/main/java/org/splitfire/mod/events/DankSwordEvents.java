package org.splitfire.mod.events;

import org.splitfire.mod.init.ToolInit;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DankSwordEvents {
	
	@SubscribeEvent
	public void onEvent(LivingHurtEvent event) {
		if(event.getSource().getTrueSource() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.getSource().getTrueSource();
			if(player.getHeldItemMainhand().getItem() == ToolInit.dark_sword) {
				player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 100, 1));
				if(!player.isCreative()) {
					player.setHealth(player.getHealth() - 2);
				}
			}
			
		}
	}

}
