package edu.rit.se.swen343.resources;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.rit.se.swen343.api.StatisticQuery;

public class StatisticResourceTest {

    @Test
    public void testGetStatistics() {
        StatisticResource resource = new StatisticResource(1, 2, 3);

        // @formatter:off
        StatisticQuery expected = StatisticQuery.builder()
                .basicProduced(1)
                .midRangeProduced(2)
                .highEndProduced(3)
                .totalProduced(6)
                .build();
        // @formatter:on

        assertEquals(resource.getStatistics(), expected);
    }

}
