package io.github.emberbocor.waterproofconcretepowder;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;

public final class WaterproofConcretePowderFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FabricContent.register();
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS)
                .register(entries -> WaterproofConcretePowder.addCreativeItems(entries::accept));
    }
}
