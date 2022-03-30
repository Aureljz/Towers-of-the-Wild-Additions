package net.aurelj.totw_additions;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TowersAdditionsMain implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "totw_additions";

    @Override
    public void onInitialize() {

        TOTWAStructures.registerStructureFeatures();

    }
}

