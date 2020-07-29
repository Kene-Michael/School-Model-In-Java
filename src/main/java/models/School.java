package models;

import java.util.HashMap;
import java.util.Map;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    A Map that stores students based on their students ID
    private Map<Integer,Student> students = new HashMap<>();
//    A map that stores Staff based on their Staff ID
    private Map<Integer,Staff> staff = new HashMap<>();
//    A Map that stores Classes based on the Class ID
    private Map<String, Class> classes = new HashMap<>();
//    A Map that stores Courses based on the CourseCode
    private Map<String, Course> courses = new HashMap<>();
    public static int MINIMUM_AGE = 16;
    public static int MAXIMUM_AGE = 27;

    /**
     * A method that takes in the fields, creates a principal from the fields and adds the principal to Staff List.
     * @param name
     * @param age
     * @param gender
     * @param id
     * @return Principal
     */
    public Principal employPrincipal(String name, int age, String gender, int id) {
        Principal principal = new Principal(name, age, gender, id);
        principal.setSchool(this);
        staff.put(principal.getStaffId(), principal);
        return principal;
    }

    /**
     * A method that takes in an applicant and a student ID and creates a student from this and also adds the student to the Students List.
     * @param applicant
     * @param id
     * @return Student
     */
    public Student addStudent(Applicant applicant,int id) {
        Student student = new Student(applicant.getName(),applicant.getAge(),applicant.getGender(),id);
        student.setSchool(this);
        students.put(id, student);
        return student;
    }

    /**
     * A method that takes in a Teacher then adds the Teacher to the Staff List.
     * @param teacher
     * @return Teacher
     */
    public Teacher addTeacher(Teacher teacher) {
        staff.put(teacher.getStaffId(), teacher);
        teacher.setSchool(this);
        return teacher;
    }

    /**
     * A method that takes in a non academic staff and adds the non academic staff to the Staff List;
     * @param nonAcademicStaff
     * @return NonAcademicStaff
     */
    public NonAcademicStaff addNAS(NonAcademicStaff nonAcademicStaff) {
        staff.put(nonAcademicStaff.getStaffId(), nonAcademicStaff);
        return nonAcademicStaff;
    }

    /**
     * A method that takes fields and creates a class out of them then adds the class to the Classes List.
     * @param classId
     * @param className
     * @return Class
     */
    public Class addClass(String classId,String className) {
        Class myClass = new Class(classId, className);
        classes.put(myClass.getClassId(), myClass);
        return myClass;
    }

    /**
     * A method that takes fields and creates a course out of them then adds the course to the Courses List.
     * @param courseCode
     * @param courseName
     * @return Course
     */
    public Course addCourse(String courseCode,String courseName) {
        Course course = new Course(courseCode, courseName);
        courses.put(course.getCourseCode(), course);
        return course;
    }

    /**
     * A method that takes in an ID, looks for the student in the Students Lists and deletes the student.
     * @param id
     * @return Student
     */
    public Student removeStudent(int id) {
        Student student = students.get(id);
        students.remove(id);
        return student;
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public Map<Integer, Staff> getStaff() {
        return staff;
    }

    public Map<String, Class> getClasses() {
        return classes;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }
}
