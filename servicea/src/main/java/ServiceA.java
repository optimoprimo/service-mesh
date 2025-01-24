import org.eclipse.microprofile.rest.client.inject.RestClient;

import client.ServiceBClient;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class ServiceA {
    
    @RestClient
    private ServiceBClient serviceBClient;

    @GET
    public String serviceA(){
        return "Service A";
    }

    @GET
    @Path("/serviceb")
    public String serviceB(){
        return serviceBClient.serviceB();
    }
}
