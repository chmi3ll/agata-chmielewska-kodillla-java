package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class Continent {
        private final List<Country> countries = new ArrayList<>();

           public Continent() {

            countries.add(new Country(new BigDecimal(3400000), "Stany Zjednoczone"));
            countries.add(new Country(new BigDecimal(1600000), "Kanada"));
            countries.add(new Country(new BigDecimal(1000000), "Meksyk"));
            countries.add(new Country(new BigDecimal(1800000), "Gwatemala"));
            countries.add(new Country(new BigDecimal(1400000), "Hawana"));
            countries.add(new Country(new BigDecimal(5700000), "Panama"));
            countries.add(new Country(new BigDecimal(9900000), "San Salvador"));

            countries.add(new Country(new BigDecimal (8800000), "Argentyna"));
            countries.add(new Country(new BigDecimal (7600000), "Boliwia"));
            countries.add(new Country(new BigDecimal (2800000), "Brazylia"));
            countries.add(new Country(new BigDecimal (2100000), "Chile"));
            countries.add(new Country(new BigDecimal (6700000), "Ekwador"));
            countries.add(new Country(new BigDecimal (8200000), "Kolumbia"));
            countries.add(new Country(new BigDecimal (7400000), "Peru"));

            countries.add(new Country(new BigDecimal (2800000), "Egipt"));
            countries.add(new Country(new BigDecimal (1400000), "Tunezja"));
            countries.add(new Country(new BigDecimal (9800000), "RPA"));
            countries.add(new Country(new BigDecimal (5400000), "Czad"));
            countries.add(new Country(new BigDecimal (2600000), "Sudan"));
            countries.add(new Country(new BigDecimal (1200000), "Kongo"));
           }

           public List<Country> getCountries() {
               return new ArrayList<>(countries);
           }
}




