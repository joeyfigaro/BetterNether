package org.betterx.datagen.betternether.worldgen.features;

import org.betterx.wover.core.api.ModCore;
import org.betterx.wover.datagen.api.provider.multi.WoverFeatureProvider;

import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class VineFeatureDataProvider extends WoverFeatureProvider {
    public VineFeatureDataProvider(
            ModCore modCore
    ) {
        super(modCore, modCore.id("vine"));
    }

    @Override
    protected void bootstrapConfigured(BootstapContext<ConfiguredFeature<?, ?>> context) {

    }

    @Override
    protected void bootstrapPlaced(BootstapContext<PlacedFeature> context) {

    }
}