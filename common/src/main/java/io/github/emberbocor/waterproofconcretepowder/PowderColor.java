package io.github.emberbocor.waterproofconcretepowder;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public enum PowderColor {
    WHITE(DyeColor.WHITE, Blocks.CONCRETE_POWDER.white()),
    ORANGE(DyeColor.ORANGE, Blocks.CONCRETE_POWDER.orange()),
    MAGENTA(DyeColor.MAGENTA, Blocks.CONCRETE_POWDER.magenta()),
    LIGHT_BLUE(DyeColor.LIGHT_BLUE, Blocks.CONCRETE_POWDER.lightBlue()),
    YELLOW(DyeColor.YELLOW, Blocks.CONCRETE_POWDER.yellow()),
    LIME(DyeColor.LIME, Blocks.CONCRETE_POWDER.lime()),
    PINK(DyeColor.PINK, Blocks.CONCRETE_POWDER.pink()),
    GRAY(DyeColor.GRAY, Blocks.CONCRETE_POWDER.gray()),
    LIGHT_GRAY(DyeColor.LIGHT_GRAY, Blocks.CONCRETE_POWDER.lightGray()),
    CYAN(DyeColor.CYAN, Blocks.CONCRETE_POWDER.cyan()),
    PURPLE(DyeColor.PURPLE, Blocks.CONCRETE_POWDER.purple()),
    BLUE(DyeColor.BLUE, Blocks.CONCRETE_POWDER.blue()),
    BROWN(DyeColor.BROWN, Blocks.CONCRETE_POWDER.brown()),
    GREEN(DyeColor.GREEN, Blocks.CONCRETE_POWDER.green()),
    RED(DyeColor.RED, Blocks.CONCRETE_POWDER.red()),
    BLACK(DyeColor.BLACK, Blocks.CONCRETE_POWDER.black());

    private final String path;
    private final Block vanillaBlock;

    PowderColor(DyeColor color, Block vanillaBlock) {
        this.path = color.getName() + "_concrete_powder";
        this.vanillaBlock = vanillaBlock;
    }

    public String path() {
        return path;
    }

    public Block createBlock(ResourceKey<Block> key) {
        return new Block(BlockBehaviour.Properties.ofFullCopy(vanillaBlock).setId(key));
    }
}
