package com.starshieldstudios.projectoutbreakbuckler.registry;

import java.util.function.Supplier;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;
import com.starshieldstudios.projectoutbreakbuckler.registry.ModItems;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(
                    Registries.CREATIVE_MODE_TAB,
                    ProjectOutbreakBuckler.MOD_ID
            );

    public static final Supplier<CreativeModeTab> POB_ITEMS_TAB =
            CREATIVE_MODE_TABS.register(
                    "pob_items_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.OUTBREAK_DISC.get()))
                            .title(Component.translatable(
                                    "creativetab.projectoutbreakbuckler.pob_items_tab"
                            ))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.OUTBREAK_DISC.get());
                                output.accept(ModItems.POCKET_RADAR.get());
                                output.accept(ModItems.PORTABLE_WEATHER_RADIO.get());
                            })
                            .build()
            );

    public static final Supplier<CreativeModeTab> POB_BLOCKS_TAB =
            CREATIVE_MODE_TABS.register(
                    "pob_blocks_tab",
                    () -> CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.OUTBREAK_DISC.get()))
                            .title(Component.translatable(
                                    "creativetab.projectoutbreakbuckler.pob_blockss_tab"
                            ))
                            .displayItems((parameters, output) -> {

                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}