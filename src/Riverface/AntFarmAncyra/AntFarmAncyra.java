package Riverface.AntFarmAncyra;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.PlanetAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.impl.campaign.ids.Abilities;
import com.fs.starfarer.campaign.econ.Economy;

public class AntFarmAncyra extends BaseModPlugin {
    // currently deprecated, may come back to
    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();

        // Test that the .jar is loaded and working, using the most obnoxious way possible.
    }

    @Override
    public void onNewGame() {
        super.onNewGame();

        // The code below requires that Nexerelin is added as a library (not a dependency, it's only needed to compile the mod).
//        boolean isNexerelinEnabled = Global.getSettings().getModManager().isModEnabled("nexerelin");

//        if (!isNexerelinEnabled || SectorManager.getManager().isCorvusMode()) {
//                    new MySectorGen().generate(Global.getSector());
            // Add code that creates a new star system (will only run if Nexerelin's Random (corvus) mode is disabled).
//        }
    }
    @java.lang.Override
    public void onNewGameAfterEconomyLoad() {

        super.onNewGameAfterEconomyLoad();
        float economyValue = -200;
        final String[] jumpPointNames = {"galatia_jump_point_alpha","galatia_jump_point_fringe"};
        for (String jumpPoint : jumpPointNames) {
            Global.getSector().getEntityById(jumpPoint);
        }
    }
}
