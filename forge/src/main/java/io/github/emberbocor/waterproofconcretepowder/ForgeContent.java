package io.github.emberbocor.waterproofconcretepowder;

import java.util.EnumMap;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ForgeContent {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, WaterproofConcretePowder.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, WaterproofConcretePowder.MODID);
    private static final EnumMap<PowderColor, RegistryObject<Block>> POWDERS = new EnumMap<>(PowderColor.class);

    static {
        for (PowderColor color : PowderColor.values()) {
            Identifier id = Identifier.fromNamespaceAndPath(WaterproofConcretePowder.MODID, color.path());
            RegistryObject<Block> block = BLOCKS.register(color.path(), () -> color.createBlock(ResourceKey.create(Registries.BLOCK, id)));
            POWDERS.put(color, block);
            ITEMS.register(color.path(), () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
        }
    }

    private ForgeContent() {
    }

    static void register(BusGroup modBusGroup) {
        BLOCKS.register(modBusGroup);
        ITEMS.register(modBusGroup);
    }

    public static Block block(PowderColor color) {
        return POWDERS.get(color).get();
    }
}
