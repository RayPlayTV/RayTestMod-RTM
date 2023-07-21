package net.rayplaytv.rtm.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayplaytv.rtm.RTM;
import net.rayplaytv.rtm.RTMSoundEvents;
import net.rayplaytv.rtm.base.ModArmorMaterial;
import net.rayplaytv.rtm.item.custom.DiceItem;


public class ModItems {
    //create register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RTM.MOD_ID);

    //register an item
    public static final RegistryObject<Item> BLAPPLE = ITEMS.register("blapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB).food(
                    new FoodProperties.Builder().saturationMod(9.6f).nutrition(4).effect(
                            () -> new MobEffectInstance(MobEffects.JUMP,600,20),1.0f).effect(
                            () -> new MobEffectInstance(MobEffects.SLOW_FALLING,600,0),1.0f).effect(
                            () -> new MobEffectInstance(MobEffects.GLOWING,600,1),1.0f).effect(
                            () -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,5),1.0f)
                            .alwaysEat().build())));

    public static final RegistryObject<Item> BLINGOT = ITEMS.register("blingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));

    public static final RegistryObject<Item> HORSE_HALTER = ITEMS.register("horse_halter",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));

    public static final RegistryObject<Item> DICE = ITEMS.register("dice",
            () -> new DiceItem(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));


    public static final RegistryObject<Item> NOT_HELMET = ITEMS.register("not_helmet",
            () -> new ArmorItem(ArmorTiers.NOT, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));
    public static final RegistryObject<Item> NOT_CHESTPLATE = ITEMS.register("not_chestplate",
            () -> new ArmorItem(ArmorTiers.NOT, EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));
    public static final RegistryObject<Item> NOT_LEGGINGS = ITEMS.register("not_leggings",
            () -> new ArmorItem(ArmorTiers.NOT, EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));
    public static final RegistryObject<Item> NOT_BOOTS = ITEMS.register("not_boots",
            () -> new ArmorItem(ArmorTiers.NOT, EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));



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

    public static class ArmorTiers{
        public static final ArmorMaterial NOT = new ModArmorMaterial(
                "not",
                1,
                new int[]{20,40,50,10},
                300, SoundEvents.ARMOR_EQUIP_IRON,
                0.0f,
                0.0f,
                () -> Ingredient.EMPTY
        );
    }
}
