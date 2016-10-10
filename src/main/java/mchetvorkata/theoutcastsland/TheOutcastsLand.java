package mchetvorkata.theoutcastsland;


import mchetvorkata.theoutcastsland.init.ModEntities;
import mchetvorkata.theoutcastsland.init.TOCBlock2;
import mchetvorkata.theoutcastsland.init.TOCBlock3;
import mchetvorkata.theoutcastsland.init.TOCBlocks;
import mchetvorkata.theoutcastsland.init.TOCItems;
import mchetvorkata.theoutcastsland.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version =Reference.VERSION)
public class TheOutcastsLand {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Instance
	public static TheOutcastsLand instance;
	
	public static final TOLTab tabTOL = new TOLTab("tabTOL");
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
    	proxy.registerEntityRenders();
    	ModEntities.generateSpawnEgg();
    }
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		TOCBlocks.init();
		TOCBlocks.register();
		TOCBlock2.init();
		TOCBlock2.register();
		TOCBlock3.init();
		TOCBlock3.register();
		TOCItems.init();
		TOCItems.register();
		ModEntities.registerEntities();
	}
}
