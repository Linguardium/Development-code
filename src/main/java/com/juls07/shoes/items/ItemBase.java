//ItemBase where i register new Items
package com.juls07.shoes.items;

import com.juls07.shoes.Shoes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Block;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Shoes.TAB));

    }
}