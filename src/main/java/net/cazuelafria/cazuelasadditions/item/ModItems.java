package net.cazuelafria.cazuelasadditions.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.cazuelafria.cazuelasadditions.CazuelasAdditions;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CazuelasAdditions.MOD_ID);

    public static final DeferredItem<Item> SALT = ITEMS.register(
            "salt",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> SALT_CRYSTAL = ITEMS.register(
            "salt_crystal",
            () -> new Item(new Item.Properties())
    );

    public static final DeferredItem<Item> SALTY_STEAK = ITEMS.register(
            "salty_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_STEAK))
    );

    public static final DeferredItem<Item> SALTY_PORKCHOP = ITEMS.register(
            "salty_porkchop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_PORKCHOP))
    );

    public static final DeferredItem<Item> SALTY_CHICKEN = ITEMS.register(
            "salty_chicken",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_CHICKEN))
    );

    public static final DeferredItem<Item> SALTY_MUTTON = ITEMS.register(
            "salty_mutton",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_MUTTON))
    );

    public static final DeferredItem<Item> SALTY_RABBIT = ITEMS.register(
            "salty_rabbit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_RABBIT))
    );

    public static final DeferredItem<Item> SALTY_COD = ITEMS.register(
            "salty_cod",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_COD))
    );

    public static final DeferredItem<Item> SALTY_SALMON = ITEMS.register(
            "salty_salmon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_SALMON))
    );

    public static final DeferredItem<Item> SALTY_POTATO = ITEMS.register(
            "salty_potato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_POTATO))
    );

    public static final DeferredItem<Item> SALTY_GOLDEN_CARROT = ITEMS.register(
            "salty_golden_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALTY_GOLDEN_CARROT))
    );

    public static final DeferredItem<Item> SALT_SHAKER = ITEMS.register(
            "salt_shaker",
            () -> new SaltShakerItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
