package io.github.emberbocor.waterproofconcretepowder.platform;

import io.github.emberbocor.waterproofconcretepowder.FabricContent;
import io.github.emberbocor.waterproofconcretepowder.PowderColor;
import net.minecraft.world.level.block.Block;

public final class FabricPlatformHelper implements PlatformHelper {
    @Override
    public Block block(PowderColor color) {
        return FabricContent.block(color);
    }
}
