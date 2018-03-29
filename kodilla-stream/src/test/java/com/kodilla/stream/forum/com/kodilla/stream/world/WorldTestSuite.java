package com.kodilla.stream.forum.com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class WorldTestSuite {

@Test
        public void testgetPeopleQuantity() {

    //Given
    World world = new World;
    List<Country> kontynenty = world.getContinents()
    Continent kontynent = new Continent;
    ArrayList panstwa = kontynent.getCountries();

    List<Country> swiat = new ArrayList<>();
    swiat.add(kontynenty);
    swiat.add(panstwa);

    //When //Then
    Assert.assertEquals(23, swiat.size());
    Assert.assertEquals(91600000, swiat.getPeopleQuantity());

    }

}
}
