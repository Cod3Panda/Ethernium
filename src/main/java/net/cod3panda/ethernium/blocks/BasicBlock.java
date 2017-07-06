package net.cod3panda.ethernium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Alanc on 3-7-2017.
 */
public class BasicBlock extends Block {

    public BasicBlock(String name, float hardness, float resistance) {

        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);;
        setResistance(resistance);

    }

}
