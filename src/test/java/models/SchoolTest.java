package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School decagon;

    @BeforeEach
    void setUp() {
        decagon = new School("Decagon");
    }

    @Test
    void testingEmployPrincipal() {
        decagon.employPrincipal("Odohi David", 29,"Male",100);
        boolean actual = decagon.getStaff().containsKey(100);
        assertTrue(actual, "Should return true showing the Principal now exists in the Staff List");
    }

    @Test
    void testingAddStudent() {
        Principal david = decagon.employPrincipal("Odohi David", 29,"Male",100);
        decagon.addStudent(david.admitStudent("Okafor Kenechukwu",21,"Male",419422,1000),1000);
        boolean actual = decagon.getStudents().containsKey(1000);
        assertTrue(actual, "Should return true showing the student now exists in the students List");
    }

    @Test
    void testingAddTeacher() {
        Principal david = decagon.employPrincipal("Odohi David", 29,"Male",100);
        decagon.addTeacher(david.employTeacher("Gadibia Daro",30,"Male",101));
        boolean actual = decagon.getStaff().containsKey(101);
        assertTrue(actual, "Should return true showing the teacher now exists in the Staff List ");
    }

    @Test
    void testingAddNAS() {
        Principal david = decagon.employPrincipal("Odohi David", 29,"Male",100);
        decagon.addNAS(david.employNAS("Uju Eze",28,"Female",102));
        boolean actual = decagon.getStaff().containsKey(102);
        assertTrue(actual, "Should return true showing the Non Academic Staff now exists in the Staff List");
    }

    @Test
    void testingAddClass() {
        decagon.addClass("MCE","Mechanical Engineering");
        boolean actual = decagon.getClasses().containsKey("MCE");
        assertTrue(actual,"Should return true showing this class now exists in the Classes List");
    }

    @Test
    void testingAddCourse() {
        decagon.addCourse("MCE221","Thermodynamics");
        boolean actual = decagon.getCourses().containsKey("MCE221");
        assertTrue(actual,"Should return true showing this course now exists in the Courses List");
    }
}