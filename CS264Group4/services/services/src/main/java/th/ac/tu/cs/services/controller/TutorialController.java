package th.ac.tu.cs.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/*import org.springframework.ui.Model;*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.services.model.Tutorial;
import th.ac.tu.cs.services.repository.TutorialRepository;

import java.util.List;


@Controller
public class TutorialController {
    String user_id;

    @Autowired
    TutorialRepository tu;

    @GetMapping("/hello")
    public String dropadd(@RequestParam(value= "date") String a,
                            @RequestParam(value= "prefix") String b,
                            @RequestParam(value= "displayNameTH") String c,
                            @RequestParam(value= "username1") String d,
                            @RequestParam(value= "studentYear") String e,
                            @RequestParam(value= "studyField") String f,
                            @RequestParam(value= "advisor") String g,
                            @RequestParam(value= "addressNumber") String h,
                            @RequestParam(value= "moo") String i,
                            @RequestParam(value= "tumbol") String j,
                            @RequestParam(value= "amphur") String k,
                            @RequestParam(value= "province") String l,
                            @RequestParam(value= "postalCode") String m,
                            @RequestParam(value= "mobilePhone") String n,
                            @RequestParam(value= "phone") String o,
                            @RequestParam(value= "nadd") String p,
                            @RequestParam(value= "ndrop") String q,
                            @RequestParam(value= "subjectCode") String r,
                            @RequestParam(value= "subjectName") String s,
                            @RequestParam(value= "subjectSection") String t,
                            @RequestParam(value= "subjectDate") String u,
                            @RequestParam(value= "subjectCredit") String v,
                            @RequestParam(value= "subjectTeacher") String w,
                            //@RequestParam(value= "subjectTeacherCheck") String x,
                            @RequestParam(value= "cause") String y){
        Tutorial p1=new Tutorial(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, y);
        tu.save(p1);
        this.user_id = d;
        System.out.println(user_id);
        return "redirect:/success.html";
    }

    @GetMapping("/hello2")
    public String quit(@RequestParam(value = "date")String a,
                       @RequestParam(value = "prefix")String b,
                       @RequestParam(value = "displayNameTH")String c,
                       @RequestParam(value = "username1")String d,
                       @RequestParam(value = "studentYear")String e,
                       @RequestParam(value = "studyField")String f,
                       @RequestParam(value = "advisor")String g,
                       @RequestParam(value = "addressNumber")String h,
                       @RequestParam(value = "moo")String i,
                       @RequestParam(value = "tumbol")String j,
                       @RequestParam(value = "amphur")String k,
                       @RequestParam(value = "province")String l,
                       @RequestParam(value = "postalCode")String m,
                       @RequestParam(value = "mobilePhone")String n,
                       @RequestParam(value = "phone")String o,
                       @RequestParam(value = "term")String p,
                       @RequestParam(value = "year")String q,
                       @RequestParam(value = "reason")String r,
                       @RequestParam(value = "faculty")String s,
                       @RequestParam(value = "branch")String t,
                       @RequestParam(value = "university")String u,
                       @RequestParam(value = "faculty2")String v,
                       @RequestParam(value = "branch2")String w,
                       @RequestParam(value = "deptCause")String x,
                       @RequestParam(value = "grade")String y,
                       @RequestParam(value = "cause")String z){
        Tutorial p1=new Tutorial(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
        tu.save1(p1);
        this.user_id=d;
        System.out.println(user_id);
        return "redirect:/success.html";
    }

    @GetMapping("/hello3")
    public String tuition(@RequestParam(value = "date")String a,
                          @RequestParam(value = "prefix")String b,
                          @RequestParam(value = "displayNameTH")String c,
                          @RequestParam(value = "username1")String d,
                          @RequestParam(value = "studentYear")String e,
                          @RequestParam(value = "studyField")String f,
                          @RequestParam(value = "advisor")String g,
                          @RequestParam(value = "addressNumber")String h,
                          @RequestParam(value = "moo")String i,
                          @RequestParam(value = "tumbol")String j,
                          @RequestParam(value = "amphur")String k,
                          @RequestParam(value = "province")String l,
                          @RequestParam(value = "postalCode")String m,
                          @RequestParam(value = "mobilePhone")String n,
                          @RequestParam(value = "phone")String o,
                          @RequestParam(value = "term")String p,
                          @RequestParam(value = "year")String q,
                          @RequestParam(value = "cause")String r){
        Tutorial p1=new Tutorial(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r);
        tu.save2(p1);
        this.user_id=d;
        System.out.println(user_id);
        return "redirect:/success.html";
    }

    @GetMapping("/hello4")
    public String other(@RequestParam(value = "date")String a,
                        @RequestParam(value = "prefix")String b,
                        @RequestParam(value = "displayNameTH")String c,
                        @RequestParam(value = "username1")String d,
                        @RequestParam(value = "studentYear")String e,
                        @RequestParam(value = "studyField")String f,
                        @RequestParam(value = "advisor")String g,
                        @RequestParam(value = "addressNumber")String h,
                        @RequestParam(value = "moo")String i,
                        @RequestParam(value = "tumbol")String j,
                        @RequestParam(value = "amphur")String k,
                        @RequestParam(value = "province")String l,
                        @RequestParam(value = "postalCode")String m,
                        @RequestParam(value = "mobilePhone")String n,
                        @RequestParam(value = "phone")String o,
                        @RequestParam(value = "otherCause")String p,
                        @RequestParam(value = "cause")String q){
        Tutorial p1=new Tutorial(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q);
        tu.save3(p1);
        this.user_id=d;
        System.out.println(user_id);
        return "redirect:/success.html";
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") String id) {
        Tutorial tutorial = tu.findById(id);
        if (tutorial != null) {
            return new ResponseEntity<>(tutorial, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<Tutorial>> findAll(){
        List<Tutorial> list = tu.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

/*    @GetMapping("/find-all")
    public List<Tutorial> findAll(){
        List<Tutorial> findall = tu.findAll();
        return findall;
    }*/

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllTutorials() {
        try {
            int numRows = tu.deleteAll();
            return new ResponseEntity<>("Deleted " + numRows + " AddDrop(s) successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Cannot delete AddDrop.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

/*
    @PutMapping("/update/{id}")
*/
    @RequestMapping(value = "/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public ResponseEntity<String> updateTutorial(@PathVariable("id") String id,
                                                 /*@RequestParam(value= "date") String a,
                                                 @RequestParam(value= "prefix") String b,
                                                 @RequestParam(value= "name") String c,
                                                 @RequestParam(value= "studentId") String d,
                                                 @RequestParam(value= "studentYear") String e,
                                                 @RequestParam(value= "studyField") String f,
                                                 @RequestParam(value= "advisor") String g,
                                                 @RequestParam(value= "addressNumber") String h,
                                                 @RequestParam(value= "moo") String i,
                                                 @RequestParam(value= "tumbol") String j,
                                                 @RequestParam(value= "amphur") String k,
                                                 @RequestParam(value= "province") String l,
                                                 @RequestParam(value= "postalCode") String m,
                                                 @RequestParam(value= "mobilePhone") String n,
                                                 @RequestParam(value= "phone") String o,
                                                 @RequestParam(value= "nadd") String p,
                                                 @RequestParam(value= "ndrop") String q,
                                                 @RequestParam(value= "subjectCode") String r,
                                                 @RequestParam(value= "subjectName") String s,
                                                 @RequestParam(value= "subjectSection") String t,
                                                 @RequestParam(value= "subjectDate") String u,
                                                 @RequestParam(value= "subjectCredit") String v,
                                                 @RequestParam(value= "subjectTeacher") String w,
                                                 //@RequestParam(value= "subjectTeacherCheck") String x,
                                                 @RequestParam(value= "cause") String y,*/
                                                 @RequestParam(value= "comment") String comment,
                                                 @RequestParam(value = "approve") String approve) {
        Tutorial _pUpdate = tu.findById(id);
        if (_pUpdate != null) {
            /*_pUpdate.setDate(a);
            _pUpdate.setPrefix(b);
            _pUpdate.setName(c);
            _pUpdate.setStudentId(d);
            _pUpdate.setStudentYear(e);
            _pUpdate.setStudyField(f);
            _pUpdate.setAdvisor(g);
            _pUpdate.setAddressnumber(h);
            _pUpdate.setMoo(i);
            _pUpdate.setTumbol(j);
            _pUpdate.setAmphur(k);
            _pUpdate.setProvince(l);
            _pUpdate.setPostalCode(m);
            _pUpdate.setMobilePhone(n);
            _pUpdate.setPhone(o);
            _pUpdate.setNadd(p);
            _pUpdate.setNdrop(q);
            _pUpdate.setSubjectCode(r);
            _pUpdate.setSubjectName(s);
            _pUpdate.setSubjectSection(t);
            _pUpdate.setSubjectDate(u);
            _pUpdate.setSubjectCredit(v);
            _pUpdate.setSubjectTeacher(w);
            _pUpdate.setCause(y);*/

            _pUpdate.setComment(comment);
            _pUpdate.setApprove(approve);

            tu.update(_pUpdate);
            return new ResponseEntity<>("Updated successfully.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Cannot find Contact with studentId=" + id, HttpStatus.NOT_FOUND);
        }
    }

}