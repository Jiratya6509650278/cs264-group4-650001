package th.ac.tu.cs.services.model;

public class Tutorial {

    public Tutorial(){

    }

    private String date;
    private String prefix;
    private String name;
    private String studentId;
    private String studentYear;
    private String studyField;
    private String advisor;
    private String addressnumber;
    private String moo;
    private String tumbol;
    private String amphur;
    private String province;
    private String postalCode;
    private String mobilePhone;
    private String phone;
    private String nadd;
    private String ndrop;
    private String subjectCode;
    private String subjectName;
    private String subjectSection;
    private String subjectDate;
    private String subjectCredit;
    private String subjectTeacher;
    //private String subjectTeacherCheck;
    private String cause;

    public String comment;

    public String approve;
    public String term;
    public String year;
    public String reason;
    public String faculty;
    public String branch;
    public String university;
    public String faculty2;
    public String branch2;
    public String deptCause;
    public String grade;
    public String otherCause;

    //เพิ่มถอน
    public Tutorial(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p,
                    String q, String r, String s, String t, String u, String v, String w, String y){
        this.date=a;
        this.prefix=b;
        this.name=c;
        this.studentId=d;
        this.studentYear=e;
        this.studyField=f;
        this.advisor=g;
        this.addressnumber=h;
        this.moo=i;
        this.tumbol=j;
        this.amphur=k;
        this.province=l;
        this.postalCode=m;
        this.mobilePhone=n;
        this.phone=o;
        this.nadd=p;
        this.ndrop=q;
        this.subjectCode=r;
        this.subjectName=s;
        this.subjectSection=t;
        this.subjectDate=u;
        this.subjectCredit=v;
        this.subjectTeacher=w;
        //this.subjectTeacherCheck=x;
        this.cause=y;
    }

    //ลาออก
    public Tutorial(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o,
                    String p, String q, String r, String s, String t, String u, String v, String w, String x, String y , String z){
        this.date=a;
        this.prefix=b;
        this.name=c;
        this.studentId=d;
        this.studentYear=e;
        this.studyField=f;
        this.advisor=g;
        this.addressnumber=h;
        this.moo=i;
        this.tumbol=j;
        this.amphur=k;
        this.province=l;
        this.postalCode=m;
        this.mobilePhone=n;
        this.phone=o;
        this.term=p;
        this.year=q;
        this.reason=r;
        this.faculty=s;
        this.branch=t;
        this.university=u;
        this.faculty2=v;
        this.branch2=w;
        this.deptCause=x;
        this.grade=y;
        this.cause=z;
    }

    //ผ่อนผัน
    public Tutorial(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p,
                    String q, String r){
        this.date=a;
        this.prefix=b;
        this.name=c;
        this.studentId=d;
        this.studentYear=e;
        this.studyField=f;
        this.advisor=g;
        this.addressnumber=h;
        this.moo=i;
        this.tumbol=j;
        this.amphur=k;
        this.province=l;
        this.postalCode=m;
        this.mobilePhone=n;
        this.phone=o;
        this.term=p;
        this.year=q;
        this.cause=r;
    }

    //คำร้องอื่นๆ
    public Tutorial(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m, String n, String o, String p,
                    String q){
        this.date=a;
        this.prefix=b;
        this.name=c;
        this.studentId=d;
        this.studentYear=e;
        this.studyField=f;
        this.advisor=g;
        this.addressnumber=h;
        this.moo=i;
        this.tumbol=j;
        this.amphur=k;
        this.province=l;
        this.postalCode=m;
        this.mobilePhone=n;
        this.phone=o;
        this.otherCause=p;
        this.cause=q;
    }

    public String getOtherCause() {
        return otherCause;
    }

    public void setOtherCause(String otherCause) {
        this.otherCause = otherCause;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty2() {
        return faculty2;
    }

    public void setFaculty2(String faculty2) {
        this.faculty2 = faculty2;
    }

    public String getBranch2() {
        return branch2;
    }

    public void setBranch2(String branch2) {
        this.branch2 = branch2;
    }

    public String getDeptCause() {
        return deptCause;
    }

    public void setDeptCause(String deptCause) {
        this.deptCause = deptCause;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentYear() {
        return studentYear;
    }

    public void setStudentYear(String studentYear) {
        this.studentYear = studentYear;
    }

    public String getStudyField() {
        return studyField;
    }

    public void setStudyField(String studyField) {
        this.studyField = studyField;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAddressnumber() {
        return addressnumber;
    }

    public void setAddressnumber(String addressnumber) {
        this.addressnumber = addressnumber;
    }

    public String getMoo() {
        return moo;
    }

    public void setMoo(String moo) {
        this.moo = moo;
    }

    public String getTumbol() {
        return tumbol;
    }

    public void setTumbol(String tumbol) {
        this.tumbol = tumbol;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNadd() {
        return nadd;
    }

    public void setNadd(String nadd) {
        this.nadd = nadd;
    }

    public String getNdrop() {
        return ndrop;
    }

    public void setNdrop(String ndrop) {
        this.ndrop = ndrop;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectSection() {
        return subjectSection;
    }

    public void setSubjectSection(String subjectSection) {
        this.subjectSection = subjectSection;
    }

    public String getSubjectDate() {
        return subjectDate;
    }

    public void setSubjectDate(String subjectDate) {
        this.subjectDate = subjectDate;
    }

    public String getSubjectCredit() {
        return subjectCredit;
    }

    public void setSubjectCredit(String subjectCredit) {
        this.subjectCredit = subjectCredit;
    }

    public String getSubjectTeacher() {
        return subjectTeacher;
    }

    public void setSubjectTeacher(String subjectTeacher) {
        this.subjectTeacher = subjectTeacher;
    }

    /*public String getSubjectTeacherCheck() {
        return subjectTeacherCheck;
    }

    public void setSubjectTeacherCheck(String subjectTeacherCheck) {
        this.subjectTeacherCheck = subjectTeacherCheck;
    }*/

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }
}