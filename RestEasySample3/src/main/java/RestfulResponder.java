import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/restful")
public class RestfulResponder {
    @GET
    @Path("/jaxb/getxml")
    public SampleXmlClass getMessage() {
        SampleXmlClass xml = new SampleXmlClass();
        xml.elem1 = "elem1";
        xml.elem2 = "elem2";
        xml.elem3 = "elem3";

        return xml;
    }

    @POST
    @Path("/jaxb/injextxml")
    public String getMessage(SampleXmlClass xml) {
        return xml.elem1 + xml.elem2 + xml.elem3;

    }
}
