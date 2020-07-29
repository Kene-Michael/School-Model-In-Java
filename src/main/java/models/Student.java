package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{
    private School school;
    private final int studentId;
//    A List that will contain the course being taken by the Student.
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int age, String gender, int studentId) {
        super(name, age, gender, "student");
        this.studentId = studentId;
    }

    public Student(Applicant applicant,int id) {
        this(applicant.getName(),applicant.getAge(),applicant.getGender(), id);
    }

    public int getStudentId() {
        return studentId;
    }

    public void takeCourse(String courseId) {
        if(school.getCourses().containsKey(courseId)) {
            courses.add(courseId);
        } else {
            System.out.println("This course does not exist");
        }
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
