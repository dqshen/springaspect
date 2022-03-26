package com.example.springaspect;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = com.example.springaspect.ConcertConfig.class)
public class AudienceTests {

    @Autowired
    Performance performance;

    @Test
    public void pfShouldNotBeNull() {
        assertNotNull(performance);
    }

    @Test
    public void pfShouldBeEncoreable() {
        assertTrue(performance instanceof Encoreable);
    }

    @Test
    public void testAudience() {
        performance.perform();
    }
}
