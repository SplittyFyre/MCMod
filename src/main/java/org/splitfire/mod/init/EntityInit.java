package org.splitfire.mod.init;

import org.splitfire.mod.mod;
import org.splitfire.mod.init.entities.mobs.clockworks.EntityClockKnight;
import org.splitfire.mod.init.entities.models.ModelClockKnight;
import org.splitfire.mod.init.entities.renderers.RenderClockKnight;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	
	private static ResourceLocation std = new ResourceLocation("std");

	public static void init() {
		EntityInit.register();
		EntityInit.registerEntity();
	}
	
	public static void register() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityClockKnight.class, 
				                                         new RenderClockKnight(Minecraft.getMinecraft().getRenderManager(), 
				                                         new ModelClockKnight(), 1.5F));
		
	}
	
	public static void registerEntity() {
		
		EntityRegistry.registerModEntity(std, EntityClockKnight.class, "entity_clock_knight", 100, mod.Instance, 64, 1, true);
		
	}
}
