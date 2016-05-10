package edu.rit.se.swen343.api;

import lombok.Value;

@Value
public class OrderRequest {
    private final String type;
    private final int amount;
}
