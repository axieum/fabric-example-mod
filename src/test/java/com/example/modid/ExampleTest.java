package com.example.modid;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Example")
public class ExampleTest
{
    @Test
    @DisplayName("A logger is available")
    @Disabled("for demonstration purposes only")
    void shouldHaveLogger()
    {
        assertNotNull(Example.LOGGER);
    }
}
