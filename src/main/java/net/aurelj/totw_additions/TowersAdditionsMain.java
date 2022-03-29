package net.aurelj.totw_additions;

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

    @Override
    public void onInitialize() {

        TOTWAStructures.registerStructureFeatures();

    }
}

