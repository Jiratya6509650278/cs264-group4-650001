package th.ac.tu.cs.services.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import th.ac.tu.cs.services.model.Tutorial;

@Repository
public class JdbcTutorialRepository implements TutorialRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Tutorial tu){
        return jdbcTemplate.update("INSERT INTO project( date, prefix, name, studentId, studentYear, studyField, advisor, addressNumber, moo, tumbol, amphur, province, " +
                "postalCode, mobilePhone, phone, nadd, ndrop, subjectCode, subjectName, subjectSection, subjectDate, subjectCredit, subjectTeacher, cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(),
                        tu.getMoo(), tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getNadd(), tu.getNdrop(),
                        tu.getSubjectCode(), tu.getSubjectName(), tu.getSubjectSection(), tu.getSubjectDate(), tu.getSubjectCredit(), tu.getSubjectTeacher(),
                        tu.getCause()});
    }
}

