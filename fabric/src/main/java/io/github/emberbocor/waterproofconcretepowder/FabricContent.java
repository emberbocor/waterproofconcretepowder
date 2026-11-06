package io.github.emberbocor.waterproofconcretepowder;

import java.util.EnumMap;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class FabricContent {
    private static final EnumMap<PowderColor, Block> POWDERS = new EnumMap<>(PowderColor.class);

    private FabricContent() {
    }

    static void register() {
        for (PowderColor color : PowderColor.values()) {
            ResourceLocation id = new ResourceLocation(WaterproofConcretePowder.MODID, color.path());
            Block block = Registry.register(BuiltInRegistries.BLOCK, id, color.createBlock());
            Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties()));
            POWDERS.put(color, block);
        }
    }

    public static Block block(PowderColor color) {
        return POWDERS.get(color);
    }
}
