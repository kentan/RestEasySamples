import javax.ws.rs.*;

@Path("/restful")
public class RestfulResponder {
    @GET
    @Path("/echo/{msg}")
    public String echoMessage(@PathParam("msg") String msg) {
       return "Echo :" + msg;
    }

    @GET
    @Path("/produceXml/{string}")
    @Produces("application/xml")
    public String produceXml() {
        return "<foo>bar</foo>";
    }

    @POST
    @Path("/post/")
    public String echoPostedMessage(String msg) {
        return msg;
    }

    @POST
    @Path("/echoIfXml/")
    @Consumes("application/xml")
    @Produces("application/xml")
    public String echoIfXml(String xmlMsg) {
        return xmlMsg;
    }

}
