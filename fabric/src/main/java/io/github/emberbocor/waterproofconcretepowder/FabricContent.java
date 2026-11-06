package io.github.emberbocor.waterproofconcretepowder;

import java.util.EnumMap;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class FabricContent {
    private static final EnumMap<PowderColor, Block> POWDERS = new EnumMap<>(PowderColor.class);

    private FabricContent() {
    }

    static void register() {
        for (PowderColor color : PowderColor.values()) {
            Identifier id = Identifier.fromNamespaceAndPath(WaterproofConcretePowder.MODID, color.path());
            Block block = Registry.register(BuiltInRegistries.BLOCK, id, color.createBlock(ResourceKey.create(Registries.BLOCK, id)));
            Registry.register(BuiltInRegistries.ITEM, id, new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
            POWDERS.put(color, block);
        }
    }

    public static Block block(PowderColor color) {
        return POWDERS.get(color);
    }
}
