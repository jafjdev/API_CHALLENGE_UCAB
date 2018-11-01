package conection;

import models.Subject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/subjects")
public class SubjectServiceAPI {
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response listSubjects() {
    ArrayList<Subject> subjects = SubjectService.getInstance().getAllSubjects();
    return Response.ok().entity(subjects).build();
  }
}
