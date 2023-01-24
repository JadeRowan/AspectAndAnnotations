package com;

import static org.junit.jupiter.api.Assertions.*;

import com.variant2.RunMe;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RunMeTest {

    @Test
    void testRunMe() {
        RunMe.someMethod("Testing in test class");
        assertTrue(1 > 0);
    }
}