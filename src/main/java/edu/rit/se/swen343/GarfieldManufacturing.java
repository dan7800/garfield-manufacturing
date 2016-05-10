package edu.rit.se.swen343;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

import edu.rit.se.swen343.resources.OrderResource;
import edu.rit.se.swen343.resources.StatisticResource;

/**
 * Basic configuration for the application.
 * 
 * @author Brian Besmanoff (bbesmanoff)
 */
public class GarfieldManufacturing extends
        Application<GarfieldManufacturingConfiguration> {

    /**
     * Runs the Dropwizard application by calling
     * {@link Application#run(String...)}.
     *
     * @param args
     *            arguments from the command line
     * @throws Exception
     *             if the application couldn't be run
     */
    public static void main(String[] args) throws Exception {
        new GarfieldManufacturing().run(args);
    }

    @Override
    public String getName() {
        return "garfield-manufacturing";
    }

    @Override
    public void initialize(Bootstrap<GarfieldManufacturingConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle());
    }

    @Override
    public void run(GarfieldManufacturingConfiguration config, Environment env)
            throws Exception {

        env.getObjectMapper().registerModule(new Jdk8Module());

        env.healthChecks().register("application",
                new GarfieldManufacturingHealthCheck());

        env.jersey().register(new OrderResource());
        env.jersey().register(new StatisticResource(0, 0, 0));
    }
}
