package net.rayplaytv.rtm.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayplaytv.rtm.RTM;
import net.rayplaytv.rtm.RTMSoundEvents;


public class ModItems {
    //create register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RTM.MOD_ID);

    //register an item
    public static final RegistryObject<Item> BLAPPLE = ITEMS.register("blapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));

    public static final RegistryObject<Item> BLINGOT = ITEMS.register("blingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_ANGEL_NEGRO = ITEMS.register("kazai_music_disc_angel_negro",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_ANGEL_NEGRO_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_ASPHYXIA = ITEMS.register("kazai_music_disc_asphyxia",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_ASPHYXIA_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_BLOODLUST = ITEMS.register("kazai_music_disc_bloodlust",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_BLOODLUST_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_ITAMI = ITEMS.register("kazai_music_disc_itami",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_ITAMI_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_TENNO = ITEMS.register("kazai_music_disc_tenno",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_TENNO_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZAI_MUSIC_DISC_YORU = ITEMS.register("kazai_music_disc_yoru",
            () -> new RecordItem(1, RTMSoundEvents.KAZAI_MUSIC_DISC_YORU_EVENT,
                (new Item.Properties()).tab(ModCreativeModeTab.KAZ_TAB).stacksTo(1), 8000));

    public static final RegistryObject<Item> KAZ = ITEMS.register("kaz",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
