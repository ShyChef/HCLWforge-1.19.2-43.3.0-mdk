package net.shychef.hclw.sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shychef.hclw.HCLW;

import java.security.PublicKey;

public class modsounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HCLW.MOD_ID);
    public static final RegistryObject<SoundEvent> COIN_FLIP = registerSoundEvent("coin_flip");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(HCLW.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(HCLW.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
