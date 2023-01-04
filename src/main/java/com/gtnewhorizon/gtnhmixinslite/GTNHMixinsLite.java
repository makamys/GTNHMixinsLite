package com.gtnewhorizon.gtnhmixinslite;

import static com.gtnewhorizon.gtnhmixins.core.GTNHMixinsCore.LOGGER;

import java.util.ArrayList;
import java.util.List;

public class GTNHMixinsLite {

    public static void init() {
        checkComponentIntegrity();
    }

    private static void checkComponentIntegrity() {
        List<String> missingComponents = new ArrayList<>();
        
        if(!classExists("org.spongepowered.asm.launch.MixinBootstrap")) {
            missingComponents.add("Mixin");
        }
        if(!classExists("ru.timeconqueror.spongemixins.SpongeMixins")) {
            missingComponents.add("SpongeMixins");
        }
        if(!classExists("com.llamalad7.mixinextras.MixinExtrasBootstrap") || classExists("com.gtnewhorizon.mixinextras.MixinExtrasBootstrap")) {
            missingComponents.add("MixinExtras");
        }
        
        if(!missingComponents.isEmpty()) {
            LOGGER.error("The following missing components were detected: " + missingComponents);
            LOGGER.error("Please obtain mods which provide them. See the readme inside the mod jar or the mod's GitHub page for more details.");
            throw new RuntimeException("Missing components detected");
        }
    }

    private static boolean classExists(String string) {
        return GTNHMixinsLite.class.getResource("/" + string.replaceAll("\\.", "/") + ".class") != null;
    }
    
    

}
