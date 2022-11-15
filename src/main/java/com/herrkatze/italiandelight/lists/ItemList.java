package com.herrkatze.italiandelight.lists;

import com.herrkatze.italiandelight.ItalianDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemList {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ItalianDelight.MODID);

    public static final RegistryObject<Item> SALAMI = ITEMS.register("salami",() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(12).saturationMod(10).build()))); //Temporary Values for testing
}
