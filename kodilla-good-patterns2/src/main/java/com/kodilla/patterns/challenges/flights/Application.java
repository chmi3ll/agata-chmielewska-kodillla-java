package com.kodilla.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();
        flightMap.getSetOfFlights();

        Option option = new Option("combined");
        try{
        FlightProcessor flightProcessor = new FlightProcessor(flightMap);
        FlightRequest flightRequest = new FlightRequest("Warszawa", option);
        flightProcessor.process(flightRequest);

        } catch (MyException e){
            System.out.println("airport was null");
        }

    }
}
