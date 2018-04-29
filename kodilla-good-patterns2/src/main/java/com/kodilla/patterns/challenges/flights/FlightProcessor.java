package com.kodilla.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightProcessor {
    private FlightMap flightMap;

    public HashSet<Flight> process(FlightRequest flightRequest) throws MyException {
        if (flightRequest.getOption().getOptionName().equals("departure")) {
        SearchingForDepartureAirport searchingForDepartureAirport = new SearchingForDepartureAirport(flightMap);
        return searchingForDepartureAirport.departureCheck(flightRequest.getDeparture());
        }
        else if (flightRequest.getOption().getOptionName().equals("arrival")) {
            SearchingForArrivalAirport searchingForArrivalAirport = new SearchingForArrivalAirport(flightMap);
            return searchingForArrivalAirport.arrivalCheck(flightRequest.getArrival());

        }
        else if (flightRequest.getOption().getOptionName().equals("combined")) {
            SearchingForFlightsBetween searchingForFlightsBetween = new SearchingForFlightsBetween(flightMap);
            return searchingForFlightsBetween.airportCheck(flightRequest.getDeparture());
        }
        return new HashSet<Flight>();
    }
}
