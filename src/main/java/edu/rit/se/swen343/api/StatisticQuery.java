package edu.rit.se.swen343.api;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class StatisticQuery {
    private final int totalProduced;
    private final int basicProduced;
    private final int midRangeProduced;
    private final int highEndProduced;
}
