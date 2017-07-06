package net.cod3panda.ethernium.items.Crystals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Alanc on 3-7-2017.
 */
public class AirCrystal extends Item {

    public AirCrystal(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

    }
}
