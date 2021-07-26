/*      AcademicStaffTest.java

        Author: Tawfeeq Cupido (216266882)
        Date: 11 June 2021

 */


package za.ac.cput.Factory;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.AcademicStaff;
import za.ac.cput.factory.AcademicStaffFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AcademicStaffTest {
    AcademicStaff academicstaff;
    @BeforeEach
    void setUp() {
        academicstaff = AcademicStaffFactory.ASBuilder("Joshua Simmons","Professor", "Engineering", "Information Technology");
    }
    @Test
    void buildUser(){
        assertNotNull(academicstaff);
        System.out.println(academicstaff);
    }


}
