package net.aurelj.totw_additions.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.aurelj.totw_additions.TowersAdditionsMain;

@Config(name = TowersAdditionsMain.MODID)
public class TOTWAConfig implements ConfigData {

    @Comment("""
                        
                      
            [End Towers Spawning Settings]
            Basic configuration options for this structure""")
    public boolean endTowerGenerates = true;
    @Comment("Base distance between End Towers (in chunks). Must be higher than separation.")
    public int endTowerSpacing = 45;
    @Comment("Base distance between End Towers (in chunks)")
    public int endTowerSeparation = 35;
    @Comment("Whether this structure should integrate Waystones or not.")
    public boolean endTowerWaystones = true;

    @Comment("""
                        
                      
            [Nether Towers Spawning Settings]
            Basic configuration options for this structure""")
    public boolean netherTowerGenerates = true;
    @Comment("Base distance between Nether Towers (in chunks). Must be higher than separation.")
    public int netherTowerSpacing = 45;
    @Comment("Base distance between Nether Towers (in chunks)")
    public int netherTowerSeparation = 35;
    @Comment("Whether this structure should integrate Waystones or not.")
    public boolean netherTowerWaystones = true;
}