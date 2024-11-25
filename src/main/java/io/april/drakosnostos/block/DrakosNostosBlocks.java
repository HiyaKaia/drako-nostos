package io.april.drakosnostos.block;

import io.april.drakosnostos.DrakosNostos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DrakosNostosBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DrakosNostos.MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
