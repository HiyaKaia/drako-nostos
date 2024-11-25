package io.april.drakosnostos.items;

import io.april.drakosnostos.DrakosNostos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DrakosNostosCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrakosNostos.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DRAKOS_NOSTOS = CREATIVE_MODE_TABS.register("drakosnostos", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.drakosnostos"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> DrakosNostosItems.EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(DrakosNostosItems.EXAMPLE_ITEM.get());
                output.accept(DrakosNostosItems.EXAMPLE_BLOCK_ITEM);
            }).build());
}
