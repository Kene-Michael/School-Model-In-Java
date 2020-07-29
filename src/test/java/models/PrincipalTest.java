package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    School decagon;
    Principal david;

    @BeforeEach
    void setUp() {
        decagon = new School("Decagon");
        david = decagon.employPrincipal("Odohi David", 29,"Male",100);
    }

    @Test
    void testingAdmitStudent() {
        david.admitStudent("Okafor Kenechukwu",21,"Male",419422,1000);
        boolean actual = decagon.getStudents().containsKey(1000);
        assertTrue(actual, "Should return true showing the student exists in the school");
    }

    @Test
    void testingEmployTeacher() {
        david.employTeacher("Gadibia Daro",30,"Male",101);
        boolean actual = decagon.getStaff().containsKey(101);
        assertTrue(actual, "Should return true showing that the teacher now exists in the school");
    }

    @Test
    void testingEmployNAS() {
        david.employNAS("Uju Eze",28,"Female",102);
        boolean actual = decagon.getStaff().containsKey(102);
        assertTrue(actual, "Should return true showing the Non Academic Staff now exists in the school");
    }

    @Test
    void testingExpelStudent() {
        david.admitStudent("Nwosu Michael",18,"Male",414423,1001);
        david.expelStudent(1001);
        boolean actual = decagon.getStudents().containsKey(1001);
        assertFalse(actual, "Should return false showing the student no longer exists in the school");
    }
}