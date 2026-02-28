package com.practicalunittesting;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MockitoFailedVerificationArgumentsTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerificationFailureArguments() {
        myFerrari.driveTo("Sweet home Alabama");
        verify(myFerrari).driveTo("Sweet home Honolulu");
    }
}
