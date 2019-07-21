package com.decathlon.Controller;

import com.decathlon.Service.DecathlonCalculator;
import com.decathlon.DTO.ScoreSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@Controller
public class CalcController {

    @Autowired
    private DecathlonCalculator decathlonCalculator;

    private ScoreSet scoreSet = new ScoreSet();

    //Web interface
    @RequestMapping("/decathloncalculator")
    public String getPage(Model model){
        model.addAttribute("scoreSet",scoreSet);
        return "decathloncalculator";
    }

    @RequestMapping(value="/decathloncalculator", method = RequestMethod.POST)
    public String calculateScore(@ModelAttribute("scoreSet")  ScoreSet scoreSet, Model model ){
        model.addAttribute("result", decathlonCalculator.calculateScore(scoreSet.getScoresAsMap()));
        return "decathloncalculator";
    }

    //JSON request
    @PostMapping(value="/decathloncalculator/calculate", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HttpResponse calculateResult(@RequestBody Map<String, String> input) {
        return new HttpResponse(decathlonCalculator.calculateScore(input));
    }

}
