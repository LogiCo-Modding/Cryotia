package logico.cryotia;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import logico.cryotia.client.handlers.ClientPacketHandler;
import logico.cryotia.client.handlers.ServerPacketHandler;
import logico.cryotia.CommonProxy;

@NetworkMod(clientSideRequired=true,serverSideRequired=false,
clientPacketHandlerSpec = @NetworkMod.SidedPacketHandler(channels = {"Cryotia"}, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec = @NetworkMod.SidedPacketHandler(channels = {"Cryotia"}, packetHandler = ServerPacketHandler.class))

@Mod(modid = "cryotia", name = "Cryotia", version = "0.1")

public class ModCryotia {
    @Mod.Instance("cryotia") public static ModCryotia instance = new ModCryotia();
    
    @SidedProxy(clientSide = "logico.cryotia.client.ClientProxy", serverSide = "logico.cryotia.CommonProxy")
	public static logico.cryotia.CommonProxy proxy;
    
    @Mod.PreInit public void preInit (final FMLPreInitializationEvent event) {}
    
    @Mod.Init public void init (final FMLInitializationEvent event) {}
    
    @Mod.PostInit public void postInit (final FMLPostInitializationEvent event) {}
}
