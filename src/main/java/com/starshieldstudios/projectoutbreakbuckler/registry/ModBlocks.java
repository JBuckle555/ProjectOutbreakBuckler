package com.starshieldstudios.projectoutbreakbuckler.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ProjectOutbreakBuckler.MOD_ID);

    // Fixed: Removed 'name:', fixed spelling of 'Deferred', fixed spelling of 'requires'
    public static final DeferredBlock<Block> DEFLECTOR_BASE_T1 = registerBlock("deflector_base_t1",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(41f) // Add 'f' for float literal if needed, though 41 works as int
                    .requiresCorrectToolForDrops() // Fixed typo from 'requries'
                    .sound(SoundType.STONE))
    );

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}