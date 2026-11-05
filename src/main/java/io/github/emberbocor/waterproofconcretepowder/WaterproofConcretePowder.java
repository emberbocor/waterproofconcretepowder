package io.github.emberbocor.waterproofconcretepowder;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(WaterproofConcretePowder.MODID)
public class WaterproofConcretePowder {
    public static final String MODID = "waterproofconcretepowder";
    public static final Logger LOGGER = LogUtils.getLogger();

    public WaterproofConcretePowder(IEventBus modEventBus, ModContainer modContainer) {
    }
}
