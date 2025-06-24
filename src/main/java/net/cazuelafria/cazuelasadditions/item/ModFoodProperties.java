package net.cazuelafria.cazuelasadditions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SALTY_STEAK = new FoodProperties.Builder().nutrition (8). saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_PORKCHOP = new FoodProperties.Builder().nutrition (8). saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_CHICKEN = new FoodProperties.Builder().nutrition (6). saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_MUTTON = new FoodProperties.Builder().nutrition (6). saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_RABBIT = new FoodProperties.Builder().nutrition (5). saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_COD = new FoodProperties.Builder().nutrition (5). saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_SALMON = new FoodProperties.Builder().nutrition (6). saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_POTATO = new FoodProperties.Builder().nutrition (5). saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();

    public static final FoodProperties SALTY_GOLDEN_CARROT = new FoodProperties.Builder().nutrition (6). saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400), 1).build();
}
