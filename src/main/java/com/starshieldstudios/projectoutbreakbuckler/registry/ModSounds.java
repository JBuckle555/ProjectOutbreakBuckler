package com.starshieldstudios.projectoutbreakbuckler.core.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, ProjectOutbreakBuckler.MOD_ID);

    public static final DeferredRegister.RegisteredSoundEvent EMS_WARNING_US_SIREN =
            SOUNDS.register("ems_warning_us_siren",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(
                                    ProjectOutbreakBuckler.MOD_ID,
                                    "ems_warning_us_siren"
                            )
                    ));

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}