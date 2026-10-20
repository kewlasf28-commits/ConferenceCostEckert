/*
 * Student: Allison Eckert
 * Course: CIS 171 - Java
 * Assignment: Conference Cost JUnit Testing
 *
 * Source: Conference rates provided by Karen Lentz-O'Loughlin.
 * OpenAI ChatGPT assisted with JUnit test development.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConferenceCostEckertTest {

    // Test all Tier 1 prices
    @Test
    void testTier1() {
        assertEquals(100, ConferenceCostEckert.determineConferenceCost(1, 1));
        assertEquals(190, ConferenceCostEckert.determineConferenceCost(2, 1));
        assertEquals(270, ConferenceCostEckert.determineConferenceCost(3, 1));
        assertEquals(340, ConferenceCostEckert.determineConferenceCost(4, 1));
        assertEquals(400, ConferenceCostEckert.determineConferenceCost(5, 1));
    }

    // Test all Tier 2 prices
    @Test
    void testTier2() {
        assertEquals(90, ConferenceCostEckert.determineConferenceCost(1, 2));
        assertEquals(170, ConferenceCostEckert.determineConferenceCost(2, 2));
        assertEquals(250, ConferenceCostEckert.determineConferenceCost(3, 2));
        assertEquals(320, ConferenceCostEckert.determineConferenceCost(4, 2));
        assertEquals(380, ConferenceCostEckert.determineConferenceCost(5, 2));
    }

    // Test all Tier 3 prices
    @Test
    void testTier3() {
        assertEquals(85, ConferenceCostEckert.determineConferenceCost(1, 3));
        assertEquals(160, ConferenceCostEckert.determineConferenceCost(2, 3));
        assertEquals(240, ConferenceCostEckert.determineConferenceCost(3, 3));
        assertEquals(310, ConferenceCostEckert.determineConferenceCost(4, 3));
        assertEquals(370, ConferenceCostEckert.determineConferenceCost(5, 3));
    }

    // Test all Tier 4 prices
    @Test
    void testTier4() {
        assertEquals(75, ConferenceCostEckert.determineConferenceCost(1, 4));
        assertEquals(150, ConferenceCostEckert.determineConferenceCost(2, 4));
        assertEquals(230, ConferenceCostEckert.determineConferenceCost(3, 4));
        assertEquals(300, ConferenceCostEckert.determineConferenceCost(4, 4));
        assertEquals(360, ConferenceCostEckert.determineConferenceCost(5, 4));
    }

    // Test invalid number of days
    @Test
    void testInvalidDays() {
        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(0, 1));

        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(6, 1));

        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(-1, 1));
    }

    // Test invalid tier levels
    @Test
    void testInvalidTiers() {
        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(1, 0));

        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(1, 5));

        assertThrows(IllegalArgumentException.class,
                () -> ConferenceCostEckert.determineConferenceCost(1, -1));
    }
}

