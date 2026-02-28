package com.practicalunittesting;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MockitoDefaultValuesTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        assertFalse("new test double should return false as boolean", myFerrari.needsFuel());
        assertEquals("new test double should return 0.0 as double", 0.0,
                myFerrari.getEngineTemperature(), 0.0);
    }
}
