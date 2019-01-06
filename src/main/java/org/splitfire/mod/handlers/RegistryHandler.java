package org.splitfire.mod.handlers;

import org.splitfire.mod.events.DankSwordEvents;
import org.splitfire.mod.init.BlockInit;
import org.splitfire.mod.init.CropInit;
import org.splitfire.mod.init.EntityInit;
import org.splitfire.mod.init.ItemInit;
import org.splitfire.mod.init.ToolInit;

import net.minecraftforge.common.MinecraftForge;

public class RegistryHandler {

	public static void Client()
	
	{	
		MinecraftForge.EVENT_BUS.register(new DankSwordEvents());
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
		
		EntityInit.init();
		EntityInit.register();
		
	}
	
	public static void Common()

	{	

		
		
		CropInit.init();
		CropInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ItemInit.init();
		ItemInit.register();
	}
	
}
	
