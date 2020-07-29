package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    School decagon;
    Principal david;

    @BeforeEach
    void setUp() {
        decagon = new School("Decagon");
        david = decagon.employPrincipal("Odohi David", 29,"Male",100);
    }

    @Test
    void testingTeachCourse() {
        david.employTeacher("Gadibia Daro",30,"Male",101);
        decagon.addCourse("MCE221","Thermodynamics");
        Teacher daro  = (Teacher) decagon.getStaff().get(101);
        daro.teachCourse("MCE221");
        List<String> expected = new ArrayList<>();
        expected.add("MCE221");
        assertIterableEquals(expected,daro.getCoursesToTeach(),"Should return a List containing the courses a teacher is to teach");
    }
}