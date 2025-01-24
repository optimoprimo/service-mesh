package client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "serviceb")
public interface ServiceBClient {
    
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    String serviceB();
}
