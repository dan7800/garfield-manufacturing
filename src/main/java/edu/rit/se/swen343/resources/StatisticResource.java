package edu.rit.se.swen343.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.rit.se.swen343.api.StatisticQuery;

@Path("/statistics")
@Produces(MediaType.APPLICATION_JSON)
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
