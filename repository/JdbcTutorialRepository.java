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
        return jdbcTemplate.update("INSERT INTO dropadd( date, prefix, name, studentId, studentYear, studyField, advisor, addressNumber, moo, tumbol, amphur, province, " +
                "postalCode, mobilePhone, phone, nadd, ndrop, subjectCode, subjectName, subjectSection, subjectDate, subjectCredit, subjectTeacher, cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(),
                        tu.getMoo(), tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getNadd(), tu.getNdrop(),
                        tu.getSubjectCode(), tu.getSubjectName(), tu.getSubjectSection(), tu.getSubjectDate(), tu.getSubjectCredit(), tu.getSubjectTeacher(),
                        tu.getCause()});
    }

    public int save1(Tutorial tu){
        return jdbcTemplate.update("INSERT INTO quit1(date,prefix,name,studentId,studentYear,studyField,advisor,addressNumber,moo,tumbol,amphur,province,postalCode,mobilePhone," +
                "phone,term,year,reason,faculty,branch,university,faculty2,branch2,deptCause,grade,cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(), tu.getMoo(),
                tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getTerm(), tu.getYear(), tu.getReason(), tu.getFaculty(),
                tu.getBranch(), tu.getUniversity(), tu.getFaculty2(), tu.getBranch2(), tu.getDept_cause(), tu.getGrade(), tu.getCause()});
    }

    public int save2(Tutorial tu){
        return jdbcTemplate.update("INSERT INTO tuition(date,prefix,name,studentId,studentYear,studyField,advisor,addressNumber,moo,tumbol,amphur,province,postalCode,mobilePhone," +
                "phone,term,year,cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(), tu.getMoo(),
                        tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getTerm(), tu.getYear(), tu.getCause()});
    }

    public int save3(Tutorial tu){
        return jdbcTemplate.update("INSERT INTO other(date,prefix,name,studentId,studentYear,studyField,advisor,addressNumber,moo,tumbol,amphur,province,postalCode,mobilePhone," +
                "phone,otherCause,cause)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                new Object[]{tu.getDate(), tu.getPrefix(), tu.getName(), tu.getStudentId(), tu.getStudentYear(), tu.getStudyField(), tu.getAdvisor(), tu.getAddressnumber(), tu.getMoo(),
                        tu.getTumbol(), tu.getAmphur(), tu.getProvince(), tu.getPostalCode(), tu.getMobilePhone(), tu.getPhone(), tu.getOtherCause(), tu.getCause()});
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



