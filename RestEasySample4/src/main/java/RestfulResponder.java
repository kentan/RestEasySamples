import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/restful")
public class RestfulResponder {
    @GET
    @Path("/getmessage")
    public String getMessage() {
        return "Message from Restful API Server";
    }
}
