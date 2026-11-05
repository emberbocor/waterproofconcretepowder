package io.github.emberbocor.waterproofconcretepowder;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(WaterproofConcretePowder.MODID)
public final class WaterproofConcretePowderNeoForge {
    public WaterproofConcretePowderNeoForge(IEventBus modEventBus) {
        NeoForgeContent.register(modEventBus);
        modEventBus.addListener(WaterproofConcretePowderNeoForge::buildCreativeContents);
    }

    private static void buildCreativeContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS)) {
            WaterproofConcretePowder.addCreativeItems(event::accept);
        }
    }
}
