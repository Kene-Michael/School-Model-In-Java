package models;

public class NonAcademicStaff extends Staff{
    public NonAcademicStaff(String name, int age, String gender, int staffId) {
        super(name, age, gender, staffId, "nonAcademicStaff");
    }
}
