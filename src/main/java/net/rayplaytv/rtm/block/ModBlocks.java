package net.rayplaytv.rtm.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rayplaytv.rtm.RTM;
import net.rayplaytv.rtm.item.ModCreativeModeTab;
import net.rayplaytv.rtm.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    //create block register
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS,RTM.MOD_ID);

    //register blocks
    public static final RegistryObject<Block> BLOCK = registerBlock("block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(6f)), ModCreativeModeTab.RTM_TAB);
    public static final RegistryObject<Block> BLORE = registerBlock("blore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.RTM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_BLORE = registerBlock("deepslate_blore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(7f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,7)), ModCreativeModeTab.RTM_TAB);



    //register block method
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    //register blockItem method
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}