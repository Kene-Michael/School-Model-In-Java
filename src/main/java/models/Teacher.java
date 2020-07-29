package models;

import java.util.ArrayList;

public class Teacher extends Staff{
    private School school;
//    A list that will contain all the courses being taught by the teacher.
    private ArrayList<String> coursesToTeach = new ArrayList<>();


    public Teacher(String name, int age, String gender, int staffId) {
        super(name, age, gender, staffId, "teacher");
    }

    public void teachCourse(String courseId) {
        if(school.getCourses().containsKey(courseId)) {
            coursesToTeach.add(courseId);
        } else {
            System.out.println("This course does not exist");
        }
    }

    public ArrayList<String> getCoursesToTeach() {
        return coursesToTeach;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
