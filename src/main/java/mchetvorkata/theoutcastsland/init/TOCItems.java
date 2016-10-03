package mchetvorkata.theoutcastsland.init;

import mchetvorkata.theoutcastsland.Reference;
import mchetvorkata.theoutcastsland.TheOutcastsLand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOCItems {
	
	public static Item weak_health_orb;
	
	public static void init() {
		weak_health_orb = new Item ().setUnlocalizedName("weak_health_orb").setCreativeTab(TheOutcastsLand.tabTOL);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(weak_health_orb, weak_health_orb.getUnlocalizedName().substring(5));
}

	public static void registerRenders()
{
		registerRender(weak_health_orb);
}
		public static void registerRender(Item item)
		{
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
}
}

