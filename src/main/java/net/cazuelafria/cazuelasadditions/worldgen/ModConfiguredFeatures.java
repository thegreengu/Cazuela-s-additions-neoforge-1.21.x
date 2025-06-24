package net.cazuelafria.cazuelasadditions.worldgen;

import net.cazuelafria.cazuelasadditions.CazuelasAdditions;
import net.cazuelafria.cazuelasadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    //se declara una de estas por cada wea
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SALT_CRYSTAL_BLOCK_KEY = registerKey("salt_crystal_block");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SALT_BLOCK_KEY = registerKey("salt_block");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        //y estas
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest baseSandReplaceables = new TagMatchTest(BlockTags.SAND);

        //y estas
        register(context, OVERWORLD_SALT_CRYSTAL_BLOCK_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.SALT_CRYSTAL_BLOCK.get().defaultBlockState(), 9));
        register(context, OVERWORLD_SALT_BLOCK_KEY, Feature.ORE, new OreConfiguration(baseSandReplaceables, ModBlocks.SALT_BLOCK.get().defaultBlockState(), 13));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(CazuelasAdditions.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}