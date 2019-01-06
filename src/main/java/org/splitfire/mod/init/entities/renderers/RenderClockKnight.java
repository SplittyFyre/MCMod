package org.splitfire.mod.init.entities.renderers;

import org.splitfire.mod.Reference;
import org.splitfire.mod.init.entities.mobs.clockworks.EntityClockKnight;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderClockKnight extends RenderLiving<EntityClockKnight>{

	

	private static final ResourceLocation CLOCKKNIGHT_TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entities/clockworks/clockknight.png");
	
	public RenderClockKnight(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, 0.25F);	
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityClockKnight entity) {
		
		return CLOCKKNIGHT_TEXTURE;
	}
	
	
}

