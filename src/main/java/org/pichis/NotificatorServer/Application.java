package org.pichis.NotificatorServer;

import org.pichis.NotificatorServer.health.TemplateHealthCheck;
import org.pichis.NotificatorServer.resources.HelloWorld;

import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class Application extends io.dropwizard.Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        // nothing to do yet
    }
    
    @Override
    public void run(Configuration configuration,
                    Environment environment) {
        final HelloWorld resource = new HelloWorld(
            configuration.getTemplate(),
            configuration.getDefaultName()
        );
        
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
            environment.healthChecks().register("template", healthCheck);
            
        environment.jersey().register(resource);
    }

}
