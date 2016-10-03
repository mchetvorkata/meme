package mchetvorkata.theoutcastsland.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelXurah extends ModelBase {
	
	private ModelRenderer shape119;
	
	public ModelXurah() {
		shape119 = new ModelRenderer(this, 0, 0);
		this.shape119.addBox(-1F, 0, -1F, 10, 20, 10);
		this.shape119.setTextureOffset(256, 256);
	}
	
	@Override
	public void render(Entity entitiyIn, float p_78088_2_, float p_78088_3_,
			float p_78088_4_, float p_78088_5_, float p_78088_6_,
			float scale) {
		this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale, entitiyIn);
		this.shape119.render(scale);
	}
	
	
}
