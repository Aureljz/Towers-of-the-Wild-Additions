package net.aurelj.totw_additions;

import net.aurelj.totw_additions.structures.EndTowerStructure;
import net.aurelj.totw_additions.structures.NetherTowerStructure;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class TOTWAStructures {
    public static StructureFeature<StructurePoolFeatureConfig> END_TOWER = new EndTowerStructure(StructurePoolFeatureConfig.CODEC);
    public static StructureFeature<StructurePoolFeatureConfig> NETHER_TOWER = new NetherTowerStructure(StructurePoolFeatureConfig.CODEC);



    public static void setupAndRegisterStructureFeatures() {

        FabricStructureBuilder.create(new Identifier(TowersAdditionsMain.MODID, "end_tower"), END_TOWER)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)

                .defaultConfig(new StructureConfig(
                        TowersAdditionsMain.CONFIG.endTowerSpacing,
                        TowersAdditionsMain.CONFIG.endTowerSeparation,
                        23734816))
                .adjustsSurface()
                .register();

        FabricStructureBuilder.create(new Identifier(TowersAdditionsMain.MODID, "nether_tower"), NETHER_TOWER)
                .step(GenerationStep.Feature.SURFACE_STRUCTURES)
                .defaultConfig(new StructureConfig(
                        TowersAdditionsMain.CONFIG.netherTowerSpacing,
                        TowersAdditionsMain.CONFIG.endTowerSeparation,
                        99933862))
                .register();



        // Add more structures here and so on
    }
}
