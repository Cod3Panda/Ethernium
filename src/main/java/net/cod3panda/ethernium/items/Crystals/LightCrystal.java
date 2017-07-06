package net.cod3panda.ethernium.items.Crystals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Alanc on 6-7-2017.
 */
public class LightCrystal extends Item {

    public LightCrystal(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

    }
}
