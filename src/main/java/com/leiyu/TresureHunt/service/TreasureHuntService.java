package com.leiyu.TresureHunt.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("treasureHuntService")
public class TreasureHuntService {
    private List<String> countries = Arrays.asList("China","Australia","USA","Ireland");
    private List<String> treasures = Arrays.asList("Gold","Money","GemStone");
    private Map<String,String> treasureOfCountry = new HashMap<String,String>();
    private int findNumber=0;

    public TreasureHuntService() {

        treasureOfCountry.put(countries.get(0),treasures.get(0));
        treasureOfCountry.put(countries.get(1),treasures.get(1));
        treasureOfCountry.put(countries.get(2), treasures.get(2));
    }

    public List getCountries() {
        return countries;
    }

    public List getTreasures() {
        return treasures;
    }

    public String getTreasureOfCountry(String country) {
        String treasure = treasureOfCountry.get(country);
        return treasure;
    }


    public void addTreasure(String country) {
        treasureOfCountry.remove(country);
        countFindNumber();
    }

    public Map<String, String> getTreasureOfCountry() {
        return treasureOfCountry;
    }

    private void countFindNumber(){
        findNumber++;
    }

    public int getFindNumber(){
        return findNumber;
    }

    public double getScore(){
        double score = treasures.size()/findNumber*100;
        return score;
    }
}
