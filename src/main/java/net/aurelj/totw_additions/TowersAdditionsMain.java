package net.aurelj.totw_additions;

import net.aurelj.totw_additions.config.TOTWAConfig;
import net.aurelj.totw_additions.util.BiomePredicateUtil;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;

public class TowersAdditionsMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "totw_additions";
    public static net.aurelj.totw_additions.config.TOTWAConfig CONFIG;

    @Override
    public void onInitialize() {

        AutoConfig.register(net.aurelj.totw_additions.config.TOTWAConfig.class, JanksonConfigSerializer::new);

        CONFIG = AutoConfig.getConfigHolder(net.aurelj.totw_additions.config.TOTWAConfig.class).getConfig();

        TOTWAStructures.setupAndRegisterStructureFeatures();
        TOTWAConfiguredStructures.registerConfiguredStructures();
        addStructureSpawningToDimensionsAndBiomes();
    }

    /**
     * used for spawning our structures in biomes.
     * You can move the BiomeModification API anywhere you prefer it to be at.
     * Just make sure you call BiomeModifications.addStructure at mod init.
     */
    public static void addStructureSpawningToDimensionsAndBiomes() {

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.THEEND).and(BiomePredicateUtil.booleanToPredicate(TowersAdditionsMain.CONFIG.endTowerGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(TOTWAConfiguredStructures.CONFIGURED_END_TOWER)));

        BiomeModifications.addStructure(
                BiomeSelectors.categories(
                        Biome.Category.NETHER).and(BiomePredicateUtil.booleanToPredicate(TowersAdditionsMain.CONFIG.netherTowerGenerates)),
                RegistryKey.of(
                        Registry.CONFIGURED_STRUCTURE_FEATURE_KEY,
                        BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(TOTWAConfiguredStructures.CONFIGURED_NETHER_TOWER)));
    }
}
