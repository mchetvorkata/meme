package mchetvorkata.theoutcastsland.proxy;


import mchetvorkata.theoutcastsland.client.entity.RenderXurah;
import mchetvorkata.theoutcastsland.client.model.ModelXurah;
import mchetvorkata.theoutcastsland.entity.EntityXurah;
import mchetvorkata.theoutcastsland.init.TOCBlock2;
import mchetvorkata.theoutcastsland.init.TOCBlock3;
import mchetvorkata.theoutcastsland.init.TOCBlocks;
import mchetvorkata.theoutcastsland.init.TOCItems;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		TOCBlocks.registerRenders();
		TOCBlock2.registerRenders();
		TOCBlock3.registerRenders();
		TOCItems.registerRenders();
	}
	
	@Override
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityXurah.class, new RenderXurah(Minecraft.getMinecraft().getRenderManager(), new ModelXurah(), 0.7f));
			
		
	}
	
}
