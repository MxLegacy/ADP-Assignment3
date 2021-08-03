package za.ac.cput.Service;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.AcademicStaff;
import za.ac.cput.factory.AcademicStaffFactory;


import static org.junit.jupiter.api.Assertions.*;

public class AcademicStaffServiceTest {
    private static AcademicStaffServiceTest ACS = AcademicStaffServiceTest.getService();
    private static AcademicStaff academicStaff = AcademicStaffFactory.ASBuilder("Mac Miller","Professor", "Engineering", "Information Technology");



    @Test
    void testCreate(){
    AcademicStaff create = ACS.create(academicStaff);
    assertNotNull(create);
        System.out.println("Create: " + create);
}

    @Test
    void testRead() {
        AcademicStaff read = ACS.read(academicStaff.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void testUpdate() {
        AcademicStaff update = ACS.update(academicStaff);
        System.out.println("Update: " + update);
    }

    @Test
    void testDelete() {
        boolean success = ACS.delete(academicStaff.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void testGetAll() {
        System.out.println("Get all: " + ACS.getAll());
    }
}
