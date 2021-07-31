/* NonAcademicStaff.java
   Test Repository for Non Academic Staff
   Author: Tatum De Wet (218069227)
   Date: 25 July 2021
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.*;
import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.factory.NonAcademicStaffFactory;
import static org.junit.jupiter.api.Assertions.*;

public class NonAcademicStaffRepositoryTest {
    NonAcademicStaffRepository NASrepo =  NonAcademicStaffRepository.getRepo();;
    NonAcademicStaff nonAcademicStaff =  NonAcademicStaffFactory.createNonAcademicStaff("Greg", "Manager", "Accounting");

    @Test
    void testCreate() {
        NonAcademicStaff create = NASrepo.create(nonAcademicStaff);
        assertEquals(create.toString(), nonAcademicStaff.toString());
        System.out.println("Created: " + create);
    }

    @Test
    void testRead() {
        NonAcademicStaff read = NASrepo.read(nonAcademicStaff.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void testUpdate() {
        NonAcademicStaff update = NASrepo.update(nonAcademicStaff);
        System.out.println("Update: " + update);
    }

    @Test
    void testDelete() {
        boolean success = NASrepo.delete(nonAcademicStaff.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void testGetAll() {
        System.out.println("Get all: " + NASrepo.getAll());
    }
}

