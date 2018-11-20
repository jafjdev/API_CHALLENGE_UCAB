package conection;

import models.Subject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/subjects")
public class SubjectServiceAPI {
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listSubjects() {
        ArrayList<Subject> subjects = SubjectService.getInstance().getAllSubjects();
        return Response.ok().entity(subjects).build();
    }*/

    /*@Path("/{id}")
    @GET
    @Produces
    public Response getSubjectsBycholl(@PathParam("id") int id) {
        String query = "SELECT mat_id,mat_nombre,m_m_uc" +
                " FROM mat_mat,materia,escuela" +
                " WHERE m_m_materia_fk = mat_id and esc_id = m_m_escuela_fk and esc_id =" + id +
                " GROUP BY esc_nombre,mat_id,mat_nombre,m_m_uc" +
                " ORDER BY mat_id ASC";
        ArrayList<Subject> subjects = SubjectService.getInstance().getSubjectByScholl(query);
        return Response.ok().entity(subjects).build();
    }*/

    @Path("/{id}")
    @GET
    @Produces
    public Response getSubjectsBycholl(@PathParam("id") int id) {
        String query = "SELECT mat_id,mat_nombre,m_m_uc,m_m_restringe_fk" +
                " FROM mat_mat,materia,escuela" +
                " WHERE m_m_materia_fk = mat_id and esc_id = m_m_escuela_fk and esc_id =" + id +
                " ORDER BY mat_id ASC";
        ArrayList<Subject> subjects = SubjectService.getInstance().getSubjectBySchollSeparate(query);
        return Response.ok().entity(subjects).build();
    }
}

