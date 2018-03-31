package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public final class World {

    final List<Continent> world = new ArrayList<>();

    public void addContinent (Continent continent)  {
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
      //  return
        return world.stream()
                .flatMap(w -> w.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}

