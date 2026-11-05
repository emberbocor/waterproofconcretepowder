package io.github.emberbocor.waterproofconcretepowder.platform;

import io.github.emberbocor.waterproofconcretepowder.ForgeContent;
import io.github.emberbocor.waterproofconcretepowder.PowderColor;
import net.minecraft.world.level.block.Block;

public final class ForgePlatformHelper implements PlatformHelper {
    @Override
    public Block block(PowderColor color) {
        return ForgeContent.block(color);
    }
}
