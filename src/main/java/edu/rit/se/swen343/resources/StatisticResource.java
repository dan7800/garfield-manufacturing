package edu.rit.se.swen343.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.rit.se.swen343.api.StatisticQuery;

@Path("/statistics")
public class StatisticResource {
    private final int numBasic;
    private final int numMidRange;
    private final int numHighEnd;

    public StatisticResource(int basic, int midRange, int highEnd) {
        this.numBasic = basic;
        this.numMidRange = midRange;
        this.numHighEnd = highEnd;
    }

    @GET
    public StatisticQuery getStatistics() {
        int total = this.numBasic + this.numMidRange + this.numHighEnd;

        // @formatter:off
        return StatisticQuery.builder()
                .basicProduced(this.numBasic)
                .midRangeProduced(this.numMidRange)
                .highEndProduced(this.numHighEnd)
                .totalProduced(total)
                .build();
        // @formatter:on
    }
}
