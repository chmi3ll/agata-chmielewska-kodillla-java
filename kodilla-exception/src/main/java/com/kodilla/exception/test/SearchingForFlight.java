package com.kodilla.exception.test;

import java.util.*;

public class SearchingForFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        SearchingForFlight searchingForFlight = new SearchingForFlight();
         Map<String, Boolean> status = searchingForFlight.getAirport();
             if (status.containsKey(flight.getDepartureAirport()) && status.get(flight.getDepartureAirport())) {
                 System.out.println("route avaiable");
             } else {
                 System.out.println(status.get(flight.getDepartureAirport()));
                 throw new RouteNotFoundException("route not found!");
             }
    }

    public Map<String, Boolean> getAirport() {
        Map<String, Boolean> airportStatus = new HashMap<>();
        airportStatus.put("Warszawa", true);
        airportStatus.put("Amsterdam", false);
        airportStatus.put("Frankfurt", true);
        airportStatus.put("Portland", true);
        return airportStatus; }

    public static void main(String[] args) {
    SearchingForFlight searchingForFlight = new SearchingForFlight();

        try {
            searchingForFlight.findFlight(new Flight("", "Kraków"));

        } catch (RouteNotFoundException e){
            System.out.println("route not found");
        }
        finally {
            System.out.println("choose from our 10000 flights");
        }

    }
}
