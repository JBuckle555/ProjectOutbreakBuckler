package com.starshieldstudios.projectoutbreakbuckler.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(ProjectOutbreakBuckler.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Define the ResourceKey for your custom JukeboxSong
    public static final ResourceKey<JukeboxSong> OUTBREAK_MUSIC_DISC_SONG_KEY =
            ResourceKey.create(
                    Registries.JUKEBOX_SONG,
                    ResourceLocation.fromNamespaceAndPath(ProjectOutbreakBuckler.MOD_ID, "outbreak_disc")
            );
    // Define Outbreak_music_disc Item and use custom Resource<JukeboxSong> OMDS as .jukeboxPlaybale
    public static final DeferredItem<Item> OUTBREAK_DISC =
            ITEMS.registerSimpleItem(
                    "outbreak_disc",
                    new Item.Properties()
                            .stacksTo(1)
                            .jukeboxPlayable(OUTBREAK_MUSIC_DISC_SONG_KEY)
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