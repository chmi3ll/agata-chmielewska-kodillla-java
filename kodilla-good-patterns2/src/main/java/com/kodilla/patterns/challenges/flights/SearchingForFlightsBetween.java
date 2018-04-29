package com.kodilla.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingForFlightsBetween {
    private final FlightMap flightMap;

    public SearchingForFlightsBetween(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public HashSet<Flight> airportCheck(String airport) throws MyException {
        if (airport!= null) {
            Set<Flight> temporaryCombinedDepartureSet = new HashSet<>();
            temporaryCombinedDepartureSet = flightMap.getSetOfFlights().stream()
                    .filter(m -> m.getDepartureAirport().equals(airport))
                    .collect(Collectors.toSet());
            System.out.println("# elements: " + temporaryCombinedDepartureSet.size());

            Set<Flight> temporaryCombinedArrivalSet = new HashSet<>();
            temporaryCombinedArrivalSet = flightMap.getSetOfFlights().stream()
                    .filter(m -> m.getArrivalAirport().equals(airport))
                    .collect(Collectors.toSet());
            System.out.println("# elements: " + temporaryCombinedArrivalSet.size());

            new HashSet<Flight>(temporaryCombinedDepartureSet).addAll(temporaryCombinedArrivalSet);
            System.out.println(temporaryCombinedDepartureSet + " " + temporaryCombinedArrivalSet);
            return new HashSet<Flight>(temporaryCombinedDepartureSet);
        }
        throw new MyException("airport was null");
    }
}

