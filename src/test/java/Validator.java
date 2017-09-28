package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Validator {
    @Test
    public void testGeoCoordination() {
        GeoCoordination geoCoordination = new GeoCoordination("Tallinn");
        String result = geoCoordination.getCity();

        assertEquals("T", result);
    }

    @Test
    public void testCurrentWeather() {
        fail();
    }

    @Test
    public void test3DayHighestAndLowestTemperature() {
        fail();
    }
}
