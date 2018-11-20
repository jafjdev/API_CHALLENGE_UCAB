package conection;

import models.Prelation;
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

    /*public ArrayList<Subject> getAllSubjects() {
        Sql db = new Sql();
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        try {
            ResultSet rs = db.sqlConn("SELECT mat_id, mat_nombre FROM materia");
            while (rs.next()) {
                int subjectId = rs.getInt("mat_id");
                String subjectName = rs.getString("mat_nombre");
                Subject s = new Subject(subjectId, subjectName);
                subjects.add(s);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getStackTrace());
        }
        return subjects;
    }*/

    /*
    public ArrayList<Subject> getSubjectByScholl(String query) {
        Sql db = new Sql();
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        try {
            ResultSet rs = db.sqlConn(query);
            while (rs.next()) {
                int subjectId = rs.getInt("mat_id");
                int creditsSubject = rs.getInt("m_m_uc");
                int prelationSubject = rs.getInt("m_m_restringe_fk");
                String subjectName = rs.getString("mat_nombre");
                Subject s = new Subject(subjectId, subjectName, creditsSubject,prelationSubject);
                subjects.add(s);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getStackTrace());
        }
        return subjects;
    }
*/
    public ArrayList<Subject> getSubjectBySchollSeparate(String query) {
        Sql db = new Sql();
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        try {
            ResultSet rs = db.sqlConn(query);
            while (rs.next()) {
                int subjectId = rs.getInt("mat_id");
                String creditsSubject = String.valueOf(rs.getInt("m_m_uc"));
                String subjectName = rs.getString("mat_nombre");
                Subject s = new Subject(subjectId, subjectName, creditsSubject);
                subjects.add(s);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getStackTrace());
            Sql.bdClose(db.getConn());
        }
        subjects = getSubjectBySchollPrelation(query,subjects,db);
        return subjects;
    }

    public ArrayList<Subject> getSubjectBySchollPrelation(String query, ArrayList<Subject> subjects,Sql db) {
        try {
            ResultSet rs = db.sqlConn(query);
            while (rs.next()) {
                int subjectId = rs.getInt("mat_id");
                int prelationId = rs.getInt("m_m_restringe_fk");
                Prelation s = new Prelation(subjectId,prelationId);
                subjects.add(s);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getStackTrace());
            Sql.bdClose(db.getConn());
        }
        return subjects;
    }
    /*public ArrayList<Subject> getSubjectBySchollPrelation(String query, ArrayList<Subject> subjects) {
        Sql db = new Sql();
        try {
            ResultSet rs = db.sqlConn(query);
            while (rs.next()) {
                int subjectId = rs.getInt("mat_id");
                int prelationId = rs.getInt("m_m_restringe_fk");
                Prelation s = new Prelation(subjectId,prelationId);
                subjects.add(s);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getStackTrace());
        }
        Sql.bdClose(db.getConn());
        return subjects;
    }*/


}
