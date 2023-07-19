package net.rayplaytv.rtm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //register new creative mode item tab
    public static final CreativeModeTab RTM_TAB = new CreativeModeTab("rtm_tab") {
        @Override
        public ItemStack makeIcon() {
            //return item for tab icon
            return new ItemStack(ModItems.BLAPPLE.get());
        }
    };
    public static final CreativeModeTab KAZ_TAB = new CreativeModeTab("kaz_tab") {
        @Override
        public ItemStack makeIcon() {
            //return item for tab icon
            return new ItemStack(ModItems.KAZ.get());
        }
    };
}
