package com.leiyu.TresureHunt.service;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class TreasureHuntTest {

    private TreasureHuntService treasureHuntServiceTest;

    @Before
    public void setUp() throws Exception {
        treasureHuntServiceTest = new TreasureHuntService();
    }

    @Test
    public void shouldGetNumberOfCountries() throws Exception {
        assertThat(treasureHuntServiceTest.getCountries().size(),is(4));

    }

    @Test
    public void shouldGetTreasureNumber() throws Exception {
        assertThat(treasureHuntServiceTest.getTreasures().size(),is(3));

    }

    @Test
    public void shouldGetTreasureOfCountry() throws Exception {
        assertThat(treasureHuntServiceTest.getTreasureOfCountry("China"),is("Gold"));

    }

    @Test
    public void shouldDeleteTreasureFromMap() throws Exception {
        treasureHuntServiceTest.addTreasure("China");

       assertNull(treasureHuntServiceTest.getTreasureOfCountry("China"));
    }

    @Test
    public void shouldGetFindTimes() throws Exception {
       treasureHuntServiceTest.addTreasure("");
        treasureHuntServiceTest.addTreasure("");
        treasureHuntServiceTest.addTreasure("");
        assertThat(treasureHuntServiceTest.getFindNumber(),is(3));
    }
}
