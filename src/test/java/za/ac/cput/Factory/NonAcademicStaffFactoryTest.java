/* NonAcademicStaffFactoryTest.java
   Test for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 11 June 2021
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.NonAcademicStaff;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class NonAcademicStaffFactoryTest {

    private NonAcademicStaff NAS1;
    private NonAcademicStaff NAS2;

    @BeforeEach
    public void createNonAcademicStaff(){
        NAS1 = NonAcademicStaffFactory.createNonAcademicStaff("Brenda Van Wyk", "Secretary",
                "IT Department");
        NAS2 = NonAcademicStaffFactory.createNonAcademicStaff("John De Lange", "Janitor",
                "Maintenance");
    }

    //equality
    @Test
    void testEquality(){
        assertNotEquals(NAS1, NAS2);
    }

    //identity
    @Test
    void testIdentity(){
        assertNotSame(NAS1, NAS2);
    }

    //timeouts
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){
      System.out.println("Timeout test: " + NAS1);
    }

    //disabling
    @Test
    @Disabled
    void testDisabling(){
        NAS2.print();
    }
}