package net.aurelj.totw_additions;

import net.aurelj.totw_additions.structures.EndTowerStructure;
import net.aurelj.totw_additions.structures.NetherTowerStructure;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.fabricmc.fabric.mixin.structure.StructureFeatureAccessor;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.feature.StructurePoolFeatureConfig;

public class TOTWAStructures {
    public static StructureFeature<?> END_TOWER = new EndTowerStructure();
    public static StructureFeature<?> NETHER_TOWER = new NetherTowerStructure();

    public static void registerStructureFeatures() {
        StructureFeatureAccessor.callRegister(TowersAdditionsMain.MODID + ":end_tower", END_TOWER, GenerationStep.Feature.SURFACE_STRUCTURES);
        StructureFeatureAccessor.callRegister(TowersAdditionsMain.MODID + ":nether_tower", NETHER_TOWER, GenerationStep.Feature.SURFACE_STRUCTURES);
    }
}
