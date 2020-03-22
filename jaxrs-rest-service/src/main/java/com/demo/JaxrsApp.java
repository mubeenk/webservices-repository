package com.demo;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class JaxrsApp  extends ResourceConfig {

    public JaxrsApp() {

        // scan the resources package for our resources
        packages(getClass().getPackage().getName() + ".resources");

        // use @Inject to bind the StormtrooperDao
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(stormtrooperDao()).to(StormtrooperDao.class);
            }
        });
    }

    private StormtrooperDao stormtrooperDao() {
        return new DefaultStormtrooperDao();
    }
}
