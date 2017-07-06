package net.cod3panda.ethernium.init;

import net.cod3panda.ethernium.Reference;
import net.cod3panda.ethernium.items.Crystals.*;
import net.cod3panda.ethernium.items.Wands.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Alanc on 3-7-2017.
 */
public class ItemInit {

    public static Item airCrystal, fireCrystal, waterCrystal, earthCrystal, darkCrystal, lightCrystal;
    public static Item basicWand, ironWand, goldWand, ironBead, goldBead;

    public static void init() {
        //Crystals
        airCrystal = new AirCrystal("air_crystal");
        fireCrystal = new FireCrystal("fire_crystal");
        waterCrystal = new WaterCrystal("water_crystal");
        earthCrystal = new EarthCrystal("earth_crystal");
        darkCrystal = new DarkCrystal("dark_crystal");
        lightCrystal = new LightCrystal("light_crystal");
        //Wands
        basicWand = new BasicWand("basic_wand");
        ironWand = new IronWand("iron_wand");
        goldWand = new GoldWand("gold_wand");
        ironBead = new IronBead("iron_bead");
        goldBead = new GoldBead("gold_bead");

    }

    public static void register() {
    //Crystals
    registerItem(airCrystal);
    registerItem(fireCrystal);
    registerItem(waterCrystal);
    registerItem(earthCrystal);
    registerItem(darkCrystal);
    registerItem(lightCrystal);
    //Wands
        registerItem(basicWand);
        registerItem(ironWand);
        registerItem(goldWand);
        registerItem(ironBead);
        registerItem(goldBead);

    }

    public static void registerItem(Item item) {

        ForgeRegistries.ITEMS.register(item);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
