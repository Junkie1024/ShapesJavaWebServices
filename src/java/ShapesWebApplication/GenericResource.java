/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapesWebApplication;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * REST Web Service
 *
 * @author 1894082
 */
@Path("findArea")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ShapesWebApplication.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("shapesList")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText() {

        JSONArray mainArray = new JSONArray();

        JSONObject Object = new JSONObject();

        Object.accumulate("name", "Circle");
        Object.accumulate("NumberofParam", 1);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Rectangle");
        Object.accumulate("NumberofParam", 2);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Square");
        Object.accumulate("NumberofParam", 1);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Trapezoid");
        Object.accumulate("NumberofParam", 3);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Triangle");
        Object.accumulate("NumberofParam", 2);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Parallelogram");
        Object.accumulate("NumberofParam", 2);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Ellipse");
        Object.accumulate("NumberofParam", 2);
        mainArray.add(Object);
        Object.clear();
        Object.accumulate("name", "Sector");
        Object.accumulate("NumberofParam", 2);

        mainArray.add(Object);
        //TODO return proper representation object
        return mainArray.toString();
    }

    @GET
    @Path("shapeThree&{shapeName}&{base1}&{base2}&{base3}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText1(@PathParam("shapeName") String Shapename, @PathParam("base1") int base1, @PathParam("base2") int base2, @PathParam("base3") int base3) {

        JSONObject Obj1 = new JSONObject();

        if (Shapename.equals("Trapezoid")) {

            Obj1.accumulate("Status", "OK");
            Obj1.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj1.accumulate("Shape", Shapename);
            Obj1.accumulate("Base 1", base1);
            Obj1.accumulate("Base 2", base2);
            Obj1.accumulate("Base 3", base3);
            Obj1.accumulate("Area", (0.5 * (base1 + base2) * base3));

        } else {

            Obj1.accumulate("Status", "ERROR");
            Obj1.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj1.accumulate("Shape", Shapename);
            Obj1.accumulate("Message", "Not the good shape");
        }

        return Obj1.toString();
    }

    @GET
    @Path("shapeTwo&{shapeName}&{base1}&{base2}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText1(@PathParam("shapeName") String Shapename, @PathParam("base1") int base1, @PathParam("base2") int base2) {

        JSONObject Obj2 = new JSONObject();

        if (Shapename.equals("Rectangle")) {

            Obj2.accumulate("Status", "OK");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Base 1", base1);
            Obj2.accumulate("Base 2", base2);
            Obj2.accumulate("Area", base1 * base2);

        } else if (Shapename.equals("Triangle")) {

            Obj2.accumulate("Status", "OK");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Base 1", base1);
            Obj2.accumulate("Base 2", base2);
            Obj2.accumulate("Area", 0.5 * base1 * base2);

        } else if (Shapename.equals("Parallelogram")) {

            Obj2.accumulate("Status", "OK");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Base 1", base1);
            Obj2.accumulate("Base 2", base2);
            Obj2.accumulate("Area", base1 * base2);

        } else if (Shapename.equals("Ellipse")) {

            Obj2.accumulate("Status", "OK");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Base 1", base1);
            Obj2.accumulate("Base 2", base2);
            Obj2.accumulate("Area", 3.15 * base1 * base2);

        } else if (Shapename.equals("Sector")) {

            Obj2.accumulate("Status", "OK");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Base 1", base1);
            Obj2.accumulate("Base 2", base2);
            Obj2.accumulate("Area", 0.5 * base1 * base1 * base2);

        } else {

            Obj2.accumulate("Status", "ERROR");
            Obj2.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj2.accumulate("Shape", Shapename);
            Obj2.accumulate("Message", "Not the good shape");
        }

        return Obj2.toString();
    }

    @GET
    @Path("shapeOne&{shapeName}&{base1}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText1(@PathParam("shapeName") String Shapename, @PathParam("base1") int base1) {

        JSONObject Obj3 = new JSONObject();

        if (Shapename.equals("Square")) {

            Obj3.accumulate("Status", "OK");
            Obj3.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj3.accumulate("Shape", Shapename);
            Obj3.accumulate("Base 1", base1);
            Obj3.accumulate("Area", base1 * base1);

        } else if (Shapename.equals("Circle")) {

            Obj3.accumulate("Status", "OK");
            Obj3.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj3.accumulate("Shape", Shapename);
            Obj3.accumulate("Base 1", base1);
            Obj3.accumulate("Area", 3.14 * base1 * base1);

        } else {

            Obj3.accumulate("Status", "ERROR");
            Obj3.accumulate("TimeStamp",System.currentTimeMillis()/1000);
            Obj3.accumulate("Shape", Shapename);
            Obj3.accumulate("Message", "Not the good shape");
        }

        return Obj3.toString();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
