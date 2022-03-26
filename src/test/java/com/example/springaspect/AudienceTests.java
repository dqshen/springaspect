package com.example.springaspect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

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
    public void testAudience() throws Exception {
        String text = tapSystemOut(() -> {
            performance.perform(true);
        }).trim();

        assertTrue(text.endsWith(
                "CLAP!CLAP!CLAP!"));
    }

    @Test
    public void testAudienceRefund() throws Exception {
        String text = "";
        try {
            text = tapSystemOut(() -> {
                performance.perform(false);
            }).trim();
        } catch (Exception e) {

        } finally {
            assertEquals("",text);
        }
    }

    @Test
    public void testEncore() throws Exception {
        Encoreable encoreable = (Encoreable) performance;
        String text = tapSystemOut(() -> {
            encoreable.performEncore();
        }).trim();

        assertTrue(text.endsWith(
                "Encore!"));
    }
}
