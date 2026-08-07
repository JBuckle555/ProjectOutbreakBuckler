package com.starshieldstudios.projectoutbreakbuckler.core.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectOutbreakBuckler.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final DeferredItem<Item> OUTBREAK_MUSIC_DISC =
            ITEMS.registerSimpleItem(
                    "outbreak_music_disc",
                    new Item.Properties().stacksTo(1)
            );

    public static final DeferredItem<Item> POCKET_RADAR =
            ITEMS.registerSimpleItem(
                    "pocket_radar",
                    new Item.Properties().stacksTo(1)
            );

    public static final DeferredItem<Item> PORTABLE_WEATHER_RADIO =
            ITEMS.registerSimpleItem(
                    "portable_weather_radio",
                    new Item.Properties().stacksTo(1)
            );
}