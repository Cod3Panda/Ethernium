package net.cod3panda.ethernium.proxy;

import net.cod3panda.ethernium.handlers.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alanc on 3-7-2017.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

        RegistryHandler.Common();

    }
    public void init(FMLInitializationEvent event) {



    }
    public void postInit(FMLPostInitializationEvent event) {



    }

}
