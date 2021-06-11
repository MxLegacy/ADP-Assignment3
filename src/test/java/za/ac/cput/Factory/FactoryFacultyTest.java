package za.ac.cput.Factory;

/*
    FactoryFacultyTest.java
    Factory test for faculty fatory
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Faculty;
import za.ac.cput.factory.FactoryFaculty;

import static org.junit.jupiter.api.Assertions.*;

class FactoryFacultyTest {

    Faculty faculty1, faculty2;

    @Test
    void createFaculty() {
        assertNotNull(faculty1);
        assertNotNull(faculty2);

        faculty1.toString();
        faculty2.toString();


    }

    @BeforeEach
    void testingInput()
    {

        faculty1 = FactoryFaculty.createFaculty("Design", "Engineering");
        faculty2 = FactoryFaculty.createFaculty("Business", "Economics");


    }

}