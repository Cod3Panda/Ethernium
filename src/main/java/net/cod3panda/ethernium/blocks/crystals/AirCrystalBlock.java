package net.cod3panda.ethernium.blocks.crystals;

import net.cod3panda.ethernium.blocks.BasicBlock;

/**
 * Created by Alanc on 3-7-2017.
 */
public class AirCrystalBlock extends BasicBlock {

    public AirCrystalBlock(String name, float hardness, float resistance, int harvestLevel) {

        super(name, hardness, resistance);
        setHarvestLevel("pickaxe", harvestLevel);

    }

}
