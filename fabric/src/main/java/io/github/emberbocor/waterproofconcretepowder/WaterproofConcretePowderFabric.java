package io.github.emberbocor.waterproofconcretepowder;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

public final class WaterproofConcretePowderFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FabricContent.register();
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS)
                .register(entries -> WaterproofConcretePowder.addCreativeItems(entries::accept));
    }
}
