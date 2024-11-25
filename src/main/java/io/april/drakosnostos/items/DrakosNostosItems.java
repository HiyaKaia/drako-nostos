package io.april.drakosnostos.items;

import io.april.drakosnostos.DrakosNostos;
import io.april.drakosnostos.block.DrakosNostosBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DrakosNostosItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DrakosNostos.MODID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(1).saturationModifier(2f).build()));

    public static final DeferredItem<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("Example_Block", () -> new ItemNameBlockItem(DrakosNostosBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()));

}
