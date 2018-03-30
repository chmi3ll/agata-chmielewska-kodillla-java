package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World {

    final List<Continent> world = new ArrayList<>();

    public void addContinent (Continent continent)  {
        world.add(continent);
    }

    public List<Continent> getContinents() {
        return new ArrayList<>(world);
    }

    public List<BigDecimal> getPeopleQuantity() {
        return world.stream()
                .flatMap(w -> w.getContinents().stream())
                .map(w -> w.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}

