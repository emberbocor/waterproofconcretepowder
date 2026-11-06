package io.github.emberbocor.waterproofconcretepowder;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public enum PowderColor {
    WHITE(DyeColor.WHITE, Blocks.WHITE_CONCRETE_POWDER),
    ORANGE(DyeColor.ORANGE, Blocks.ORANGE_CONCRETE_POWDER),
    MAGENTA(DyeColor.MAGENTA, Blocks.MAGENTA_CONCRETE_POWDER),
    LIGHT_BLUE(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_CONCRETE_POWDER),
    YELLOW(DyeColor.YELLOW, Blocks.YELLOW_CONCRETE_POWDER),
    LIME(DyeColor.LIME, Blocks.LIME_CONCRETE_POWDER),
    PINK(DyeColor.PINK, Blocks.PINK_CONCRETE_POWDER),
    GRAY(DyeColor.GRAY, Blocks.GRAY_CONCRETE_POWDER),
    LIGHT_GRAY(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_CONCRETE_POWDER),
    CYAN(DyeColor.CYAN, Blocks.CYAN_CONCRETE_POWDER),
    PURPLE(DyeColor.PURPLE, Blocks.PURPLE_CONCRETE_POWDER),
    BLUE(DyeColor.BLUE, Blocks.BLUE_CONCRETE_POWDER),
    BROWN(DyeColor.BROWN, Blocks.BROWN_CONCRETE_POWDER),
    GREEN(DyeColor.GREEN, Blocks.GREEN_CONCRETE_POWDER),
    RED(DyeColor.RED, Blocks.RED_CONCRETE_POWDER),
    BLACK(DyeColor.BLACK, Blocks.BLACK_CONCRETE_POWDER);

    private final String path;
    private final Block vanillaBlock;

    PowderColor(DyeColor color, Block vanillaBlock) {
        this.path = color.getName() + "_concrete_powder";
        this.vanillaBlock = vanillaBlock;
    }

    public String path() {
        return path;
    }

    public Block createBlock() {
        return new Block(BlockBehaviour.Properties.copy(vanillaBlock));
    }
}
