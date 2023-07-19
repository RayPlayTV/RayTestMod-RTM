package net.rayplaytv.rtm;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RTMSoundEvents {
    private static final DeferredRegister<SoundEvent> SOUND_EVENTS;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_ANGEL_NEGRO_EVENT;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_ASPHYXIA_EVENT;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_BLOODLUST_EVENT;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_ITAMI_EVENT;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_TENNO_EVENT;
    public static final RegistryObject<SoundEvent> KAZAI_MUSIC_DISC_YORU_EVENT;

    public RTMSoundEvents() {
    }

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> {
            return new SoundEvent(new ResourceLocation("rtm", name), 75.0F);
        });
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }

    static {
        SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, RTM.MOD_ID);
        KAZAI_MUSIC_DISC_ANGEL_NEGRO_EVENT = registerSoundEvent("kazai_music_disc_angel_negro");
        KAZAI_MUSIC_DISC_ASPHYXIA_EVENT = registerSoundEvent("kazai_music_disc_asphyxia");
        KAZAI_MUSIC_DISC_BLOODLUST_EVENT = registerSoundEvent("kazai_music_disc_bloodlust");
        KAZAI_MUSIC_DISC_ITAMI_EVENT = registerSoundEvent("kazai_music_disc_itami");
        KAZAI_MUSIC_DISC_TENNO_EVENT = registerSoundEvent("kazai_music_disc_tenno");
        KAZAI_MUSIC_DISC_YORU_EVENT = registerSoundEvent("kazai_music_disc_yoru");
    }
}

