package io.github.emberbocor.waterproofconcretepowder;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WaterproofConcretePowder.MODID)
public final class WaterproofConcretePowderForge {
    public WaterproofConcretePowderForge(FMLJavaModLoadingContext context) {
        BusGroup modBusGroup = context.getModBusGroup();
        ForgeContent.register(modBusGroup);
        BuildCreativeModeTabContentsEvent.BUS.addListener(WaterproofConcretePowderForge::buildCreativeContents);
    }

    private static void buildCreativeContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.COLORED_BLOCKS)) {
            WaterproofConcretePowder.addCreativeItems(event::accept);
        }
    }
}
