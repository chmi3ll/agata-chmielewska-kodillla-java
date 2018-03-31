package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;


public class WorldTestSuite {

@Test
        public void testGetPeopleQuantity() {

    Continent amerykaPn = new Continent();

    amerykaPn.addCountry((new Country(new BigDecimal("3400000"), "Stany Zjednoczone")));
    amerykaPn.addCountry((new Country(new BigDecimal("3400000"), "Stany Zjednoczone")));
    amerykaPn.addCountry((new Country(new BigDecimal("1600000"), "Kanada")));
    amerykaPn.addCountry((new Country(new BigDecimal("1000000"), "Meksyk")));
    amerykaPn.addCountry((new Country(new BigDecimal("1800000"), "Gwatemala")));
    amerykaPn.addCountry((new Country(new BigDecimal("1400000"), "Hawana")));
    amerykaPn.addCountry((new Country(new BigDecimal("5700000"), "Panama")));
    amerykaPn.addCountry((new Country(new BigDecimal("9900000"), "San Salvador")));

    Continent amerykaPd = new Continent();
    amerykaPd.addCountry((new Country(new BigDecimal ("8800000"), "Argentyna")));
    amerykaPd.addCountry((new Country(new BigDecimal ("7600000"), "Boliwia")));
    amerykaPd.addCountry((new Country(new BigDecimal ("2800000"), "Brazylia")));
    amerykaPd.addCountry((new Country(new BigDecimal ("2100000"), "Chile")));
    amerykaPd.addCountry((new Country(new BigDecimal ("6700000"), "Ekwador")));
    amerykaPd.addCountry((new Country(new BigDecimal ("8200000"), "Kolumbia")));
    amerykaPd.addCountry((new Country(new BigDecimal ("7400000"), "Peru")));

    Continent afryka = new Continent();
    afryka.addCountry((new Country(new BigDecimal ("2800000"), "Egipt")));
    afryka.addCountry((new Country(new BigDecimal ("1400000"), "Tunezja")));
    afryka.addCountry((new Country(new BigDecimal ("9800000"), "RPA")));
    afryka.addCountry((new Country(new BigDecimal ("5400000"), "Czad")));
    afryka.addCountry((new Country(new BigDecimal ("2600000"), "Sudan")));
    afryka.addCountry((new Country(new BigDecimal ("1200000"), "Kongo")));

    //When
    World world = new World();
        world.addContinent(amerykaPn);
        world.addContinent(amerykaPd);
        world.addContinent(afryka);


     //Then
    BigDecimal expectedSum = new BigDecimal("95000000");
    Assert.assertEquals(expectedSum, world.getPeopleQuantity());

    }
}
