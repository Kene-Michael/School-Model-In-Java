package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    School decagon;
    Principal david;

    @BeforeEach
    void setUp() {
        decagon = new School("Decagon");
        david = decagon.employPrincipal("Odohi David", 29,"Male",100);
    }

    @Test
    void testingTakeCourse() {
        david.admitStudent("Okafor Kenechukwu",21,"Male",419422,1000);
        decagon.addCourse("MCE221","Thermodynamics");
        decagon.addCourse("MCE201","Fluid Mechanics");
        decagon.getStudents().get(1000).takeCourse("MCE221");
        decagon.getStudents().get(1000).takeCourse("MCE201");
        List<String> expected = new ArrayList<>();
        expected.add("MCE221");
        expected.add("MCE201");
        assertIterableEquals(expected, decagon.getStudents().get(1000).getCourses(),"Should return a List containing the courses the student is taking");
    }
}