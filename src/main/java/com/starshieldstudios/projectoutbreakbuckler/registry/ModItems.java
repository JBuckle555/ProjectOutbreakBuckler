package com.starshieldstudios.projectoutbreakbuckler.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;

import com.starshieldstudios.projectoutbreakbuckler.item.audio.PortableWeatherRadio;
import com.starshieldstudios.projectoutbreakbuckler.item.radar.PocketRadar;

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

    public static final ResourceKey<JukeboxSong> OUTBREAK_MUSIC_DISC_SONG_KEY =
            ResourceKey.create(
                    Registries.JUKEBOX_SONG,
                    ResourceLocation.fromNamespaceAndPath(
                            ProjectOutbreakBuckler.MOD_ID,
                            "outbreak_disc"
                    )
            );

    public static final DeferredItem<Item> OUTBREAK_DISC =
            ITEMS.registerSimpleItem(
                    "outbreak_disc",
                    new Item.Properties()
                            .stacksTo(1)
                            .jukeboxPlayable(OUTBREAK_MUSIC_DISC_SONG_KEY)
            );

    public static final DeferredItem<PocketRadar> POCKET_RADAR =
            ITEMS.registerItem(
                    "pocket_radar",
                    PocketRadar::new,
                    new Item.Properties().stacksTo(1)
            );

    public static final DeferredItem<PortableWeatherRadio> PORTABLE_WEATHER_RADIO =
            ITEMS.registerItem(
                    "portable_weather_radio",
                    PortableWeatherRadio::new,
                    new Item.Properties().stacksTo(1)
            );
}