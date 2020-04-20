//RegistryHandler this is where i register my items forwarding it to Items/BlockBase
package com.juls07.shoes.util;

import com.juls07.shoes.blocks.BlockBase;
import com.juls07.shoes.items.ItemBase;
import com.juls07.shoes.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {



    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister(ForgeRegistries.BLOCKS,Shoes.MOD_ID);

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,Shoes.MOD_ID);

    public static void init() { ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);



    // this guy has no red line its all in the BlockBase
    // Blocks
    public static final RegistryObject<Block> TEST = BLOCKS.register("test", BlockBase::new);
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test", () -> new BlockItem(TEST.get(), new Item.Properties().group(Shoes.TAB)));



}