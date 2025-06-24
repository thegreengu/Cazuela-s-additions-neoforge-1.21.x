package net.cazuelafria.cazuelasadditions.worldgen;

import net.cazuelafria.cazuelasadditions.CazuelasAdditions;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SALT_CRYSTAL_BLOCK = registerKey("add_salt_crystal_block");
    public static final ResourceKey<BiomeModifier> ADD_SALT_BLOCK = registerKey("add_salt_block");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        // ConfiguredFeature -> PlacedFeature -> BiomeModifier
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SALT_CRYSTAL_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SALT_CRYSTAL_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SALT_BLOCK, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.RIVER), biomes.getOrThrow(Biomes.OCEAN),
                        biomes.getOrThrow(Biomes.COLD_OCEAN), biomes.getOrThrow(Biomes.DEEP_COLD_OCEAN),
                        biomes.getOrThrow(Biomes.DEEP_OCEAN), biomes.getOrThrow(Biomes.DEEP_LUKEWARM_OCEAN),
                        biomes.getOrThrow(Biomes.LUKEWARM_OCEAN), biomes.getOrThrow(Biomes.FROZEN_OCEAN),
                        biomes.getOrThrow(Biomes.WARM_OCEAN), biomes.getOrThrow(Biomes.DEEP_FROZEN_OCEAN),
                        biomes.getOrThrow(Biomes.FROZEN_RIVER), biomes.getOrThrow(Biomes.BEACH),
                        biomes.getOrThrow(Biomes.SNOWY_BEACH)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SALT_BLOCK_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(CazuelasAdditions.MOD_ID, name));
    }
}