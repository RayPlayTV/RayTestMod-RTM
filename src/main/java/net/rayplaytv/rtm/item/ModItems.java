package net.rayplaytv.rtm.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayplaytv.rtm.RTM;

public class ModItems {
    //create register
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RTM.MOD_ID);

    //register an item
    public static final RegistryObject<Item> BLAPPLE = ITEMS.register("blapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));
    //register an item
    public static final RegistryObject<Item> ORAPPLE = ITEMS.register("orapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RTM_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
