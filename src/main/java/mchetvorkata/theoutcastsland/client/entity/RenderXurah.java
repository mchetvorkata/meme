package mchetvorkata.theoutcastsland.client.entity;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.client.model.ModelXurah;
import mchetvorkata.theoutcastsland.entity.EntityXurah;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderXurah extends RenderLiving {

private static final ResourceLocation xurahTexture = new ResourceLocation(Reference.MOD_ID + ":textures/entity/xurah.png");
	
	public RenderXurah(RenderManager rendermanagerIn, ModelXurah model, float shadowSize) {
		super(rendermanagerIn, model, shadowSize);
	}
	protected ResourceLocation getEntityTexture(EntityXurah entity) {
		return this.getXurahtexture() == null ? new ResourceLocation(Reference.MOD_ID + ":textures/entity/xurah.png") : this.getXurahtexture();
		}
	public ResourceLocation getXurahtexture() {
		return xurahTexture;
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
