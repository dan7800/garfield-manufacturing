package edu.rit.se.swen343;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import edu.rit.se.swen343.resources.OrderResource;

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
    public void run(GarfieldManufacturingConfiguration config, Environment env)
	    throws Exception {

	env.healthChecks().register("application",
		new GarfieldManufacturingHealthCheck());
	env.jersey().register(new OrderResource());
    }
}
