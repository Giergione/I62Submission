package com.decathlon.Service;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class DecathlonCalculator {


    private Map<String, double[]> configurations = new ScoreConfigurations().getConfigurations();

    public int calculateScore(Map<String, String> input) {

        int sum = 0;

        for (Map.Entry<String, String> entry : input.entrySet()) {

            double[] configurationValues = configurations.get(entry.getKey());
            Double fieldType = configurations.get(entry.getKey())[3];
            double A = configurationValues[0];
            double B = configurationValues[1];
            double C = configurationValues[2];
            try {
                double P = Double.parseDouble(entry.getValue());
                switch (fieldType.intValue()) {
                    case 0:
                        //A*(B-P)**C
                        double trackScore =  A * Math.pow((B-P), C);
                        sum += (int) trackScore;
                        break;
                    case 1:
                        //A*(P-B)**C
                        double fieldScore =  A * Math.pow((P-B), C);
                        sum += (int) fieldScore;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + fieldType.intValue());
                }
            } catch (Exception e) {
                //System.out.println("Invalid input for: " + entry.getKey());
            }
        }
        return sum;
    }
}