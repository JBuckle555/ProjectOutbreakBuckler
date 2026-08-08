package com.starshieldstudios.projectoutbreakbuckler.registry;

import com.starshieldstudios.projectoutbreakbuckler.ProjectOutbreakBuckler;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, ProjectOutbreakBuckler.MOD_ID);
// DONT FORGET FILES AND FILE PATHS MUST BE LOWER CASE
    public static final DeferredHolder<SoundEvent, SoundEvent> EMS_TEST_SOUND_HOLDER =
            SOUNDS.register("ems_warning_us_siren_sound_event",
                    () -> SoundEvent.createVariableRangeEvent(
                            ResourceLocation.fromNamespaceAndPath(
                                    ProjectOutbreakBuckler.MOD_ID,
                                    "ems_warning_us_siren_sound_event"
                            )
                    ));
//    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
//            DeferredRegister.create(Registries.SOUND_EVENT, ProjectOutbreakBuckler.MOD_ID);
//    public static final DeferredHolder<SoundEvent, SoundEvent> EMS_TEST_SOUND_HOLDER =
//            SOUND_EVENTS.register("ems_test_sound_event",
//                    () -> SoundEvent.createVariableRangeEvent(
//                            ResourceLocation.fromNamespaceAndPath(ProjectOutbreakBuckler.MOD_ID, "ems_test_sound_event")
//                    )
//            );

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}