package com.demo.resources;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.demo.Stormtrooper;
import com.demo.StormtrooperDao;

@Path("/troopers")
@Produces("application/json")
public class StormtrooperResource {

    @Inject
    private StormtrooperDao trooperDao;

    @Path("/{id}")
    @GET
    public Stormtrooper getTrooper(@PathParam("id") String id) throws NotFoundException {

        Stormtrooper stormtrooper = trooperDao.getStormtrooper(id);
        if (stormtrooper == null) {
            throw new NotFoundException();
        }
        return stormtrooper;
    }

    @POST
    public Stormtrooper createTrooper(Stormtrooper trooper) {
        return trooperDao.addStormtrooper(trooper);
    }

    @Path("/{id}")
    @POST
    public Stormtrooper updateTrooper(@PathParam("id") String id,
                                      Stormtrooper updatedTrooper) throws NotFoundException {
        return trooperDao.updateStormtrooper(id, updatedTrooper);
    }

    @Path("/{id}")
    @DELETE
    public void deleteTrooper(@PathParam("id") String id) {
        trooperDao.deleteStormtrooper(id);
    }

    @GET
    public Collection<Stormtrooper> listTroopers() {
        return trooperDao.listStormtroopers();
    }
    
}
