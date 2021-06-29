/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import matematicas.operaciones;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author wladi
 */
@Path("ejercicios")
public class EjerciciosResource {

    @Context
    private UriInfo context;

    public EjerciciosResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(String data) {
        throw new UnsupportedOperationException();
    }

    @Path("sumar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sumar(String data) {
        JSONObject datos = new JSONObject(data);
        operaciones op = new operaciones();
        op.setA(Integer.parseInt(datos.getString("a")));
        op.setB(Integer.parseInt(datos.getString("b")));
        JSONObject response = new JSONObject();
        response.put("resultado", op.sumar());
        return response.toString();
    }

    @Path("restar")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String restar(String data) {
        JSONObject datos = new JSONObject(data);
        operaciones op = new operaciones();
        op.setA(Integer.parseInt(datos.getString("a")));
        op.setB(Integer.parseInt(datos.getString("b")));
        JSONObject response = new JSONObject();
        response.put("resultado", op.restar());
        return response.toString();
    }

    @Path("multi")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String multiplicar(String data) {
        JSONObject datos = new JSONObject(data);
        operaciones op = new operaciones();
        op.setA(Integer.parseInt(datos.getString("a")));
        op.setB(Integer.parseInt(datos.getString("b")));
        JSONObject response = new JSONObject();
        response.put("resultado", op.multiplicar());
        return response.toString();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
