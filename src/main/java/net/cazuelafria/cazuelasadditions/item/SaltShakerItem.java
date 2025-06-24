package net.cazuelafria.cazuelasadditions.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class SaltShakerItem extends Item {
    public SaltShakerItem(Properties properties) {
        super(properties.durability(64));
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(@NotNull ItemStack stack) {
        // Only return remaining item if the shaker is used in food crafting,
        // NOT when it's being refilled
        ItemStack result = stack.copy();
        result.setDamageValue(stack.getDamageValue() + 1);

        // If empty, don't return it
        return result.getDamageValue() >= result.getMaxDamage() ? ItemStack.EMPTY : result;
    }

    @Override
    public boolean isBarVisible(@NotNull ItemStack stack) {
        return true;
    }
}
