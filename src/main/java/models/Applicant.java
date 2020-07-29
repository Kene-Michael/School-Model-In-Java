package models;

public class Applicant extends Person{
    private final int examNo;


    public Applicant(String name, int age, String gender, int examNo) {
        super(name, age, gender, "applicant");
        this.examNo = examNo;
    }

    public int getExamNo() {
        return examNo;
    }
}
