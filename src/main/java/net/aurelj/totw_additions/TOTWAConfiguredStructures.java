package net.aurelj.totw_additions;

import net.minecraft.structure.PlainsVillageData;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredStructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class TOTWAConfiguredStructures {
    /**
     * Static instance of our configured structure so we can reference it and add it to biomes easily.
     */
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_END_TOWER = TOTWAStructures.END_TOWER
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_NETHER_TOWER = TOTWAStructures.NETHER_TOWER
            .configure(new StructurePoolFeatureConfig(() -> PlainsVillageData.STRUCTURE_POOLS, 0));



    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new Identifier(TowersAdditionsMain.MODID, "configured_end_tower"), CONFIGURED_END_TOWER);
        Registry.register(registry, new Identifier(TowersAdditionsMain.MODID, "configured_nether_tower"), CONFIGURED_NETHER_TOWER);

    }
}
