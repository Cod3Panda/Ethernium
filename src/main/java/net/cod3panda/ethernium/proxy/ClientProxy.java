package net.cod3panda.ethernium.proxy;

import net.cod3panda.ethernium.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alanc on 3-7-2017.
 */
public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    super.preInit(event);

    }
    public void init(FMLInitializationEvent event) {

    super.init(event);
        RegistryHandler.Client();
    }
    public void postInit(FMLPostInitializationEvent event) {

    super.postInit(event);

    }

}
