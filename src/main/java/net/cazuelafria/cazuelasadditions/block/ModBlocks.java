package net.cazuelafria.cazuelasadditions.block;

import net.cazuelafria.cazuelasadditions.CazuelasAdditions;
import net.cazuelafria.cazuelasadditions.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CazuelasAdditions.MOD_ID);

    //desde aca se definen los bloques
    //recordar poner .requiresCorrectToolForDrops() antes de .sound si se requiere
    //para añadir xp DropExperienceBlock(UniformInt.of(2, 4), antes de BlockBehaviour
    public static final DeferredBlock<Block> SALT_BLOCK = registerBlock(
            "salt_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.2F).sound(SoundType.GRAVEL)));

    public static final DeferredBlock<Block> SALT_CRYSTAL_BLOCK = registerBlock(
            "salt_crystal_block",
            () -> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(1.2F).sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
