package edu.rit.se.swen343;

import com.codahale.metrics.health.HealthCheck;

/**
 * The {@link HealthCheck} for the application.
 * 
 * @author Brian Besmanoff (bbesmanoff)
 */
public class GarfieldManufacturingHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }

}
