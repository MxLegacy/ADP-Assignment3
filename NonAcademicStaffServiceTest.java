package za.ac.cput.Service;

/*
NonAcademicStaffServiceTest.java
Author: Tatum De Wet 218069227
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.factory.NonAcademicStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

public class NonAcademicStaffServiceTest {
    private static NonAcademicStaffService NASservice = NonAcademicStaffService.getService();
    private static NonAcademicStaff nonAcademicStaff = NonAcademicStaffFactory.createNonAcademicStaff("Belinda", "Clerk", "Accounting");

    @Test
    void testCreate(){
        NonAcademicStaff create = NASservice.create(nonAcademicStaff);
        assertNotNull(create);
        System.out.println("Create: " + create);
    }

    @Test
    void testRead() {
        NonAcademicStaff read = NASservice.read(nonAcademicStaff.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void testUpdate() {
        NonAcademicStaff update = NASservice.update(nonAcademicStaff);
        System.out.println("Update: " + update);
    }

    @Test
    void testDelete() {
        boolean success = NASservice.delete(nonAcademicStaff.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void testGetAll() {
        System.out.println("Get all: " + NASservice.getAll());
    }
}
