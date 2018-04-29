package com.kodilla.patterns.challenges.flights;

public class FlightRequest {
    private Flight flight;
    private Option option;

    public FlightRequest(Flight flight, Option option) {
        this.flight = flight;
        this.option = option;
    }

    public String getDeparture() {
        return flight.getDepartureAirport();
    }

    public String getArrival() {
        return flight.getArrivalAirport();
    }

    public Option getOption(){
        return option;
    }
}
