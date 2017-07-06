package net.cod3panda.ethernium.init;

import net.cod3panda.ethernium.Reference;
import net.cod3panda.ethernium.blocks.crystals.AirCrystalBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Alanc on 3-7-2017.
 */
public class BlockInit {

    public static Block airCrystalBlock;

    public static void init() {

        airCrystalBlock = new AirCrystalBlock("aircrystal_block", 2.0F, 4.0F, 2);

    }

    public static void register() {

    registerBlock(airCrystalBlock);

    }

    public static void registerBlock(Block block) {

        ForgeRegistries.BLOCKS.register(block);
        block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(item);

    }

    public static void registerRenders() {

        registerRender(airCrystalBlock);

    }


    public static void registerRender(Block block) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5)));

    }

}
