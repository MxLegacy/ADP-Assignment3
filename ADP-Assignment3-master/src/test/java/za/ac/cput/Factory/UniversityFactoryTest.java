package za.ac.cput.Factory;

/*
    UniversityFactoryTest.java
    Factory test for uiversity fatory
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.University;
import za.ac.cput.factory.UniversityFactory;

import static org.junit.jupiter.api.Assertions.*;

class UniversityFactoryTest {

    University university1, university2;

    @Test
    void createUniversity() {
        assertNotNull(university1);
        assertNotNull(university2);

        university1.toString();
        university2.toString();


    }

    @BeforeEach
    void testingInput()
    {

        university1 = UniversityFactory.createUniversity("CPUT", "IT");
        university2 = UniversityFactory.createUniversity("UWC", "ART");


    }
}