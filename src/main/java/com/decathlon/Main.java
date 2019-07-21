package com.decathlon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Usage:
 * 1: Fill the form on via browser at: localhost:8080/decathloncalculator
 *
 * 2: make a POST request at: localhost:8080/decathloncalculator/calculate
 * data example:
 *  {
 *  	"hundredMeters": "11.5",
 * 	    "longJump": "400",
 * 	    "shotPut": "23",
 * 	    "highJump": "123",
 * 	    "fourHundredMeters": "50",
 * 	    "hurdles": "25",
 * 	    "discusThrow": "43",
 * 	    "poleVault": "200",
 * 	    "javelinThrow": "23",
 * 	    "fifteenHundredMeters": "234"
 *  }
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
