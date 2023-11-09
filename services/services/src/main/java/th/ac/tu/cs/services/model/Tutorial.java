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
}