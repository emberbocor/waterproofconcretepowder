package io.github.emberbocor.waterproofconcretepowder;

import io.github.emberbocor.waterproofconcretepowder.platform.Services;
import java.util.function.Consumer;
import net.minecraft.world.level.ItemLike;

public final class WaterproofConcretePowder {
    public static final String MODID = "waterproofconcretepowder";

    private WaterproofConcretePowder() {
    }

    public static void addCreativeItems(Consumer<ItemLike> output) {
        for (PowderColor color : PowderColor.values()) {
            output.accept(Services.PLATFORM.block(color));
        }
    }
}
