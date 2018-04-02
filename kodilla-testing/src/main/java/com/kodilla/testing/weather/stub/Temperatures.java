package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    //first element of map is identifier
    //second element of the map is a temperature

    HashMap<Integer, Double> getTemperatures();
}
