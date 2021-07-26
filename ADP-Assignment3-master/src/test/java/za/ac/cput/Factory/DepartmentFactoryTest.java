package za.ac.cput.Factory;
/*      DepartmentFactoryTest.java
        Test case for the department
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Department;
import za.ac.cput.factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentFactoryTest {
    Department department;

    @BeforeEach
    void setUp() {
        department = DepartmentFactory.buildDepartment("Architectural Technology and Interior Design "," Informatics & Design", """
                Diploma: Information & Communication Technology: Multimedia Applications\s
                Diploma: Information & Communication Technology: Communications Networks\s
                Diploma: Information & Communication Technology: Applications Development\s""", "Academic" +"Non-academic");
    }
    @Test
    void buildUser(){
        assertNotNull(department);
        System.out.println(department);
    }


}