package com.practicalunittesting;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockitoFailedVerificationTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerificationFailure() {
        myFerrari.needsFuel();
        verify(myFerrari).getEngineTemperature();
    }
}
