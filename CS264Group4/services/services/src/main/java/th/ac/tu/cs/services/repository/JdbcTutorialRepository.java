package th.ac.tu.cs.services.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import th.ac.tu.cs.services.model.Tutorial;

@Repository
public class JdbcTutorialRepository implements TutorialRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Tutorial tu){
        return jdbcTemplate.update("INSERT INTO TestCS264Groupv2( date, prefix, name, studentId, studentYear, studyField, advisor, addressNumber, moo, tumbol, amphur, province, " +
                "postalCode, mobilePhone, phone, nadd, ndrop, subjectCode, subjectName, subjectSection, subjectDate, subjectCredit, subjectTeacher, cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(),
                        tu.getMoo(), tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getNadd(), tu.getNdrop(),
                        tu.getSubjectCode(), tu.getSubjectName(), tu.getSubjectSection(), tu.getSubjectDate(), tu.getSubjectCredit(), tu.getSubjectTeacher(),
                        tu.getCause()});
    }

    public Tutorial findById(String id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM TestCS264Groupv2 WHERE studentId=?",
                    BeanPropertyRowMapper.newInstance(Tutorial.class), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    public List<Tutorial> findAll() {
        return jdbcTemplate.query("SELECT * from TestCS264Groupv2", BeanPropertyRowMapper.newInstance(Tutorial.class));
    }

    public int deleteAll() {
        return jdbcTemplate.update("DELETE from TestCS264Groupv2");
    }

@Override
public int update(Tutorial tu) {
    return jdbcTemplate.update("UPDATE TestCS264Groupv2 SET date=?, prefix=?, name=?, studentYear=?, studyField=?, advisor=?, addressNumber=?, moo=?, tumbol=?, amphur=?," +
                    "province=?, postalCode=?, mobilePhone=?, phone=?, nadd=?, ndrop=?, subjectCode=?, subjectName=?, subjectSection=?, subjectDate=?, subjectCredit=?, subjectTeacher=?," +
                    "cause=?, comment=?, approve=? WHERE studentId=?",
                 new Object[] {tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(),
                         tu.getMoo(), tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getNadd(), tu.getNdrop(),
                         tu.getSubjectCode(), tu.getSubjectName(), tu.getSubjectSection(), tu.getSubjectDate(), tu.getSubjectCredit(), tu.getSubjectTeacher(),
                         tu.getCause(), tu.getComment(), tu.getApprove(), tu.getStudentId()});
}


}



