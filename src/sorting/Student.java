package sorting;

public class Student {
    String sName;
    int rollNo, grade;
    String firstLang, secondLang;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFirstLang() {
        return firstLang;
    }

    public void setFirstLang(String firstLang) {
        this.firstLang = firstLang;
    }

    public String getSecondLang() {
        return secondLang;
    }

    public void setSecondLang(String secondLang) {
        this.secondLang = secondLang;
    }

    Student(String sName, int rollNo, int grade, String firstLang, String secondLang){
        this.sName=sName;
        this.rollNo=rollNo;
        this.grade=grade;
        this.firstLang=firstLang;
        this.secondLang=secondLang;
    }

}
