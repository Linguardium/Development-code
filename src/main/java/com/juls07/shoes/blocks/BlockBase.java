package com.juls07.shoes.blocks;

import com.juls07.shoes.Shoes;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
    public BlockBase() {
        //             ↓ he saysProperties(net.minecraft.block.material.Material, net.minecraft.block.material.MaterialColor)' has private access in 'net.minecraft.block.Block.Properties
        // and says this net.minecraft.block.Block.Properties @Contract(pure = true) private Properties(net.minecraft.block.material.Material materialIn,net.minecraft.block.material.MaterialColor mapColorIn)
        super(Properties.create(Material.ROCK));

    }
}