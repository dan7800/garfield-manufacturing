package edu.rit.se.swen343.api;

import lombok.Data;

/**
 * An OrderRequest contains a subset of the members of {@link Order} and is used
 * to receive data from external clients.
 *
 * @author Brian Besmanoff (bbesmanoff)
 */
@Data
public class OrderRequest {
    private String model;
}
