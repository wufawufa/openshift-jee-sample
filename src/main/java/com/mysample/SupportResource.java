package com.mysample;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped; import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@RequestScoped @Path("/support")
public class SupportResource {
    @GET()
    @Produces("application/json")
    public HashMap<String,String> getSupport() {
        HashMap<String, String> theSupport = new HashMap<String, String>(); theSupport.put("support this week", "Senthil"); return theSupport;

        
    }
}