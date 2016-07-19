import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class MyApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();

    public MyApplication() {
        singletons.add(new RestfulResponder());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}

