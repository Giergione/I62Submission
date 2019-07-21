package com.decathlon.DTO;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ScoreSet {

    private String hundredMeters;
    private String longJump;
    private String shotPut;
    private String highJump;
    private String fourHundredMeters;
    private String hurdles;
    private String discusThrow;
    private String poleVault;
    private String javelinThrow;
    private String fifteenHundredMeters;

    public ScoreSet() {
    }

    public Map<String, String> getScoresAsMap() {
        Map<String, String> scores = new HashMap<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                String strValue = (String) field.get (this);
                scores.put(field.getName(), strValue);
            } catch (Exception e) {}
        }
        return scores;
    }

    public String getHundredMeters() {
        return hundredMeters;
    }

    public void setHundredMeters(String hundredMeters) {
        this.hundredMeters = hundredMeters;
    }

    public String getLongJump() {
        return longJump;
    }

    public void setLongJump(String longJump) {
        this.longJump = longJump;
    }

    public String getShotPut() {
        return shotPut;
    }

    public void setShotPut(String shotPut) {
        this.shotPut = shotPut;
    }

    public String getHighJump() {
        return highJump;
    }

    public void setHighJump(String highJump) {
        this.highJump = highJump;
    }

    public String getFourHundredMeters() {
        return fourHundredMeters;
    }

    public void setFourHundredMeters(String fourHundredMeters) {
        this.fourHundredMeters = fourHundredMeters;
    }

    public String getHurdles() {
        return hurdles;
    }

    public void setHurdles(String hurdles) {
        this.hurdles = hurdles;
    }

    public String getDiscusThrow() {
        return discusThrow;
    }

    public void setDiscusThrow(String discusThrow) {
        this.discusThrow = discusThrow;
    }

    public String getPoleVault() {
        return poleVault;
    }

    public void setPoleVault(String poleVault) {
        this.poleVault = poleVault;
    }

    public String getJavelinThrow() {
        return javelinThrow;
    }

    public void setJavelinThrow(String javelinThrow) {
        this.javelinThrow = javelinThrow;
    }

    public String getFifteenHundredMeters() {
        return fifteenHundredMeters;
    }

    public void setFifteenHundredMeters(String fifteenHundredMeters) {
        this.fifteenHundredMeters = fifteenHundredMeters;
    }
}
