package com.kodilla.patterns.challenges.flights;

public class FlightRequest {
    private String flight;
    private Option option;

    public FlightRequest(String flight, Option option) {
        this.flight = flight;
        this.option = option;
    }

    public String getAirport() {
        return flight;
    }

    public Option getOption(){
        return option;
    }
}
