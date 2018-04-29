package com.kodilla.patterns.challenges.flights;

public class Application {
    public static void main(String[] args) {
        FlightMap flightMap = new FlightMap();
        Option option = new Option("combined");
        try{
        FlightProcessor flightProcessor = new FlightProcessor();
        Flight flight = new Flight("Kraków", "Gdańsk");
        FlightRequest flightRequest = new FlightRequest(flight, option);
        flightProcessor.process(flightRequest);

        } catch (MyException e){
            System.out.println("airport was null");
        }
        System.out.println("processing other logic");

    }
}
