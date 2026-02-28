package com.practicalunittesting;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MockitoReturningDesiredValuesTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testStubbing() {
        assertFalse("new test double should return false as boolean", myFerrari.needsFuel());
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue("after instructed test double should return what we want",
                myFerrari.needsFuel());

    }
}
