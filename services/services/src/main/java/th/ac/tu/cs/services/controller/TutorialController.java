package th.ac.tu.cs.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import th.ac.tu.cs.services.model.Tutorial;
import th.ac.tu.cs.services.repository.JdbcTutorialRepository;
import th.ac.tu.cs.services.repository.TutorialRepository;

import java.util.List;


@RestController
public class TutorialController {

    @Autowired
    TutorialRepository tu;

    @GetMapping("/hello")
    public Tutorial dropadd(@RequestParam(value= "date") String a,
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
                            @RequestParam(value= "cause") String y){
    Tutorial p1=new Tutorial(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, y);
    tu.save(p1);
    return p1;

    }

}