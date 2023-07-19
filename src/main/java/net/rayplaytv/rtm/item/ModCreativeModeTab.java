package net.rayplaytv.rtm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    //register new creative mode item tab
    public static final CreativeModeTab RTM_TAB = new CreativeModeTab("rtmtab") {
        @Override
        public ItemStack makeIcon() {
            //return item for tab icon
            return new ItemStack(ModItems.BLAPPLE.get());
        }
    };
}
