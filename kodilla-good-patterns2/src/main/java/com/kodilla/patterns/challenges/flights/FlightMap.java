package com.kodilla.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class FlightMap {

    private final Set<Flight> mapOfFlights = new HashSet<>();

    public FlightMap() {
        Flight flight1 = new Flight("Kraków", "Warszawa");
        Flight flight2 = new Flight("Warszawa", "Gdańsk");
        Flight flight3 = new Flight("Amsterdam", "Nowy Jork");
        Flight flight4 = new Flight("Gdańsk", "Warszawa");
        Flight flight5 = new Flight("Poznań", "Kraków");

        mapOfFlights.add(flight1);
        mapOfFlights.add(flight2);
        mapOfFlights.add(flight3);
        mapOfFlights.add(flight4);
        mapOfFlights.add(flight5);
        }

        public Set<Flight> getSetOfFlights() {
        return new HashSet<>(mapOfFlights);
    }
}
