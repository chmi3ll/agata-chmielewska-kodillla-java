package com.kodilla.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingForArrivalAirport {
    private final FlightMap flightMap;

    public SearchingForArrivalAirport(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public HashSet<Flight> arrivalCheck(String arrival) {

        Set<Flight> temporaryDepartureSet = new HashSet<>();
        temporaryDepartureSet = flightMap.getSetOfFlights().stream()
                .filter(m -> m.getArrivalAirport().equals(arrival))
                .collect(Collectors.toSet());
        System.out.println("# elements: " + temporaryDepartureSet.size());

        return new HashSet<Flight>(temporaryDepartureSet);
    }
}