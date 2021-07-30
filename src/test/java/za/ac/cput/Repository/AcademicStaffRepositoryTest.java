package za.ac.cput.Repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.AcademicStaff;
import za.ac.cput.factory.AcademicStaffFactory;


import static org.junit.jupiter.api.Assertions.*;

class AcademicStaffRepositoryTest {
    AcademicStaffRepository ASrepo =  AcademicStaffRepository.getRepo();;
    AcademicStaff  academicStaff = AcademicStaffFactory.ASBuilder("Joshua Simmons","Professor", "Engineering", "Information Technology");

    @Test
    void testCreate() {
        AcademicStaff create = ASrepo.create(academicStaff);
        assertEquals(create.toString(), academicStaff.toString());
        System.out.println("Created: " + create);
    }

    @Test
    void testRead() {
        AcademicStaff read = ASrepo.read(academicStaff.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void testUpdate() {
        AcademicStaff update = ASrepo.update(academicStaff);
        System.out.println("Update: " + update);
    }

    @Test
    void testDelete() {
        boolean success = ASrepo.delete(academicStaff.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);

    }

    @Test
    void testGetAll() {
        System.out.println("Get all: " + ASrepo.getAll());
    }
}
