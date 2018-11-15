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
      ResultSet rs =
          db.sqlConn("SELECT su_id, su_code, su_type, su_Name, su_credits FROM subject");
      while (rs.next()) {
        Subject s = new Subject();
        int subjectId = rs.getInt("SU_id");
        int subjectCredits = rs.getInt("SU_credits");
        String subjectCode = rs.getString("SU_code");
        String subjectName = rs.getString("SU_name");
        String subjectType = rs.getString("SU_type");
        s.set_idSubject(subjectId);
        s.set_creditsSubject(subjectCredits);
        s.set_codeSubject(subjectCode);
        s.set_nameSubject(subjectName);
        subjects.add(s);
      }
    } catch (SQLException ex) {
      System.err.println(ex.getStackTrace());
    }
    return subjects;
  }
}
