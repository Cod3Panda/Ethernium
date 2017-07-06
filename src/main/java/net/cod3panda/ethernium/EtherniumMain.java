package net.cod3panda.ethernium;

import net.cod3panda.ethernium.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alanc on 3-7-2017.
 */

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class EtherniumMain {

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    proxy.preInit(event);

    }
    @EventHandler
    public static void init(FMLInitializationEvent event) {

    proxy.init(event);

    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    proxy.postInit(event);

    }

}
