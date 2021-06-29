/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wladytb.apirest.webServices;

import com.wladytb.apirest.controlador.usuarioDAO;
import com.wladytb.apirest.modelo.usuarios;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author wladi
 */
@Path("usuario")
public class usuarioResources {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of usuarioResources
     */
    public usuarioResources() {
    }

//    @GET
//    @Consumes(MediaType.TEXT_PLAIN)
//    public String hola() {
//        return "holaa";
//    }
    /**
     * Retrieves representation of an instance of
     * com.wladytb.apirest.webServices.usuarioResources
     *
     * @param userName
     * @param password
     * @return an instance of java.lang.String
     */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ver(@QueryParam("userName") String userName, @QueryParam("password") String password) {
        usuarioDAO userDao = new usuarioDAO();
        return Response.ok().entity(userDao.verificar(userName, password)).build();
    }

    /**
     * PUT method for updating or creating an instance of usuarioResources
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
