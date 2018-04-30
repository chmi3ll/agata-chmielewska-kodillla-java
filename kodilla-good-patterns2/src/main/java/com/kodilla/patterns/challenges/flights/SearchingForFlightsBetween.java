package com.kodilla.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingForFlightsBetween {
    private final FlightMap flightMap;

    public SearchingForFlightsBetween(FlightMap flightMap) {
        this.flightMap = flightMap;
    }

    public Set<Flight> airportCheck(String airport) throws MyException {
        if (airport != null && flightMap != null) {
            Set<Flight> temporaryCombinedArrivalSet = new HashSet<>();
            temporaryCombinedArrivalSet = flightMap.getSetOfFlights().stream()
                    .filter(m -> m.getArrivalAirport().equals(airport))
                    .collect(Collectors.toSet());
            System.out.println("# elements: " + temporaryCombinedArrivalSet.size());

            Set<Flight> temporaryCombinedDepartureSet = new HashSet<>();
            temporaryCombinedDepartureSet = flightMap.getSetOfFlights().stream()
                    .filter(m -> m.getDepartureAirport().equals(airport))
                    .collect(Collectors.toSet());
            System.out.println("# elements: " + temporaryCombinedDepartureSet.size());

            temporaryCombinedArrivalSet.addAll(temporaryCombinedDepartureSet);
            System.out.println(temporaryCombinedArrivalSet);
            return temporaryCombinedArrivalSet;
        }
        throw new MyException("airport or flightMap was null");
    }
}

