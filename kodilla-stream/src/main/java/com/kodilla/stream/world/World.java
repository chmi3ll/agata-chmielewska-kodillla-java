package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {

    final List<Country> continents = new ArrayList<>();
    public Country addCountry(Continent continent) {
        continents.add((new BigDecimal(1)), "Afryka");
        continents.add((new BigDecimal(2)), "Ameryka Polnocna");
        continents.add((new BigDecimal(3)), "Ameryka Poludniowa");
    }
    public List<Country> getContinents(){
        return new ArrayList<>(continents);
    }


    final List <Country> world = new ArrayList<>();
    public List<BigDecimal> getPeopleQuantity(){
    return world.stream()
            .map(Country::getPeopleQuantity)
            .flatMap(w -> w.getCountries().stream())
            .filter(w -> w.getPeopleQuantity() > 3)
            .reduce(BigDecimal.ZERO), (sum, current) -> sum = sum.add(current));
        }
}
