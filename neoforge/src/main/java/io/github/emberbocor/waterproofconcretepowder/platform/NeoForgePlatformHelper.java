package io.github.emberbocor.waterproofconcretepowder.platform;

import io.github.emberbocor.waterproofconcretepowder.NeoForgeContent;
import io.github.emberbocor.waterproofconcretepowder.PowderColor;
import net.minecraft.world.level.block.Block;

public final class NeoForgePlatformHelper implements PlatformHelper {
    @Override
    public Block block(PowderColor color) {
        return NeoForgeContent.block(color);
    }
}
