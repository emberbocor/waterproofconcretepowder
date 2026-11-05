package io.github.emberbocor.waterproofconcretepowder;

import java.util.EnumMap;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ForgeContent {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, WaterproofConcretePowder.MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, WaterproofConcretePowder.MODID);
    private static final EnumMap<PowderColor, RegistryObject<Block>> POWDERS = new EnumMap<>(PowderColor.class);

    static {
        for (PowderColor color : PowderColor.values()) {
            RegistryObject<Block> block = BLOCKS.register(color.path(), color::createBlock);
            POWDERS.put(color, block);
            ITEMS.register(color.path(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    private ForgeContent() {
    }

    static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }

    public static Block block(PowderColor color) {
        return POWDERS.get(color).get();
    }
}
