package net.cod3panda.ethernium.handlers;

import net.cod3panda.ethernium.init.BlockInit;
import net.cod3panda.ethernium.init.ItemInit;

/**
 * Created by Alanc on 3-7-2017.
 */
public class RegistryHandler {

    public static void Client() {

    ItemInit.register();
    BlockInit.registerRenders();

    }

    public static void Common() {

        ItemInit.init();
        BlockInit.init();
        BlockInit.register();

    }

}
