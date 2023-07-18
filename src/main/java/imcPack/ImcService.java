package imcPack;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/imc")
public class ImcService {
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String serviceHelloWorld() {
        return "Hello, World!";
    }

    @GET
    @Path("/calculimc/{p}/{t}")
    @Produces(MediaType.TEXT_PLAIN)
    public String calculImc(@PathParam("p") String p, @PathParam("t") String t) {
        return new Imc(Float.parseFloat(p), Float.parseFloat(t)).calcul() + "";
    }
}

