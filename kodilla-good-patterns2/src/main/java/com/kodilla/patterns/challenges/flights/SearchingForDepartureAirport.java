package com.kodilla.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingForDepartureAirport {
    private final FlightMap flightMap;

    public SearchingForDepartureAirport(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public HashSet<Flight> departureCheck(String departure) {

        Set<Flight> temporaryArrivalSet = new HashSet<>();
        temporaryArrivalSet = flightMap.getSetOfFlights().stream()
                .filter(m -> m.getDepartureAirport().equals(departure))
                .collect(Collectors.toSet());
        System.out.println("# elements: " + temporaryArrivalSet.size());

        return new HashSet<Flight>(temporaryArrivalSet);
    }
}

