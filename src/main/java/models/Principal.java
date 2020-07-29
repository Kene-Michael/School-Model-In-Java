package models;

public class Principal extends Staff{
    private School school;
    public Principal(String name, int age, String gender, int staffId) {
        super(name, age, gender, staffId, "principal");
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    /**
     * admitStudent takes in fields from applicant, and admits the applicant based on age.
     * @param name
     * @param age
     * @param gender
     * @param examNo
     * @throws Exception
     */
    public Applicant admitStudent(String name, int age, String gender, int examNo, int studentId)  {
        Applicant applicant = new Applicant(name,age,gender,examNo);
        if (applicant.getAge() < School.MINIMUM_AGE || applicant.getAge() > School.MAXIMUM_AGE) System.out.println("You are not to admit this student!");
        school.addStudent(applicant,studentId);
        return applicant;
    }

    /**
     * This method takes in fields, creates a Teacher from them and calls the School to add the teacher to Staff List.
     * @param name
     * @param age
     * @param gender
     * @param staffId
     */
    public Teacher employTeacher(String name, int age, String gender, int staffId) {
        Teacher teacher = new Teacher(name,age,gender,staffId);
        school.addTeacher(teacher);
        return teacher;
    }

    /**
     * This method takes in fields, creates a Non Academic Staff from them and calls the School to add the non academic staff to Staff List.
     * @param name
     * @param age
     * @param gender
     * @param staffId
     * @return NonAcademic Staff
     */
    public NonAcademicStaff employNAS(String name, int age, String gender, int staffId) {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff(name,age,gender,staffId);
        school.addNAS(nonAcademicStaff);
        return nonAcademicStaff;
    }

    /**
     * This method takes in a student ID and then calls the School to remove the student from Student List.
     * @param studentId
     */
    public void expelStudent(int studentId) {
        school.removeStudent(studentId);
    }

}
