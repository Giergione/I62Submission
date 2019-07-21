package com.decathlon.Service;

import java.util.HashMap;
import java.util.Map;

class ScoreConfigurations {

    private Map<String, double[]> configurations = new HashMap<>();;

    //configurations taken from https://et.wikipedia.org/wiki/Kümnevõistlus
    //4th parameter: 0 - track, 1 - field
    ScoreConfigurations() {
        configurations.put("hundredMeters", new double[] {25.4347d, 18d, 1.81d, 0d});
        configurations.put("longJump", new double[] {0.14354d, 220d, 1.4d, 1d});
        configurations.put("shotPut", new double[] {51.39d, 1.5d, 1.05d, 1d});
        configurations.put("highJump", new double[] {0.8465d, 75d, 1.42d, 1d});
        configurations.put("fourHundredMeters", new double[] {1.53775d, 82d, 1.81d, 0d});
        configurations.put("hurdles", new double[] {5.74352d, 28.5d, 1.92d, 0d});
        configurations.put("discusThrow", new double[] {12.91d, 4d, 1.1d, 1d});
        configurations.put("poleVault", new double[] {0.2797d, 100d, 1.35d, 1d});
        configurations.put("javelinThrow", new double[] {10.14d, 7d, 1.08d, 1d});
        configurations.put("fifteenHundredMeters", new double[] {0.03768d, 480d, 1.85d, 0d});
    }

    Map<String, double[]> getConfigurations() {
        return configurations;
    }
}
