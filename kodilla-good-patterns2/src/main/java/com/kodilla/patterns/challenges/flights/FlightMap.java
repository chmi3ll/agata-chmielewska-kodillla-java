package com.kodilla.patterns.challenges.flights;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class FlightMap {

    private final Set<Flight> setOfFlights = new HashSet<>();

    public FlightMap() {
        Flight flight1 = new Flight("Kraków", "Warszawa");
        Flight flight2 = new Flight("Warszawa", "Gdańsk");
        Flight flight3 = new Flight("Amsterdam", "Nowy Jork");
        Flight flight4 = new Flight("Gdańsk", "Warszawa");
        Flight flight5 = new Flight("Poznań", "Kraków");

        setOfFlights.add(flight1);
        setOfFlights.add(flight2);
        setOfFlights.add(flight3);
        setOfFlights.add(flight4);
        setOfFlights.add(flight5);
        }

        public Set<Flight> getSetOfFlights() {
        return new HashSet<>(setOfFlights);
    }
}
