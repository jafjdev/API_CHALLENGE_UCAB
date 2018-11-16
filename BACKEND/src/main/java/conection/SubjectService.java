package conection;

import models.Subject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubjectService {
  private static SubjectService subjectDAO = null;

  public static SubjectService getInstance() {
    if (subjectDAO == null) subjectDAO = new SubjectService();
    return subjectDAO;
  }

  public ArrayList<Subject> getAllSubjects() {
    Sql db = new Sql();
    ArrayList<Subject> subjects = new ArrayList<Subject>();
    try {
      ResultSet rs = db.sqlConn("SELECT mat_id, mat_nombre FROM materia");
      while (rs.next()) {
        int subjectId = rs.getInt("mat_id");
        String subjectName = rs.getString("mat_nombre");
        Subject s = new Subject(subjectId,subjectName);
        subjects.add(s);
      }
    } catch (SQLException ex) {
      System.err.println(ex.getStackTrace());
    }
    return subjects;
  }
}
