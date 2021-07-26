package za.ac.cput.Repository;
/*      DepartmentRepositoryTest.java
        Entity for the department
        Author: Devon Daniels (217299822)
        Date: 26 July 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Department;
import za.ac.cput.factory.DepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;


public class DepartmentRepositoryTest {
    DepartmentRepository Departmentreposit =  DepartmentRepository.getRepo();;
    Department department =  DepartmentFactory.buildDepartment("Electrical, Electronic and Computer Engineering", "Informatics & Design", "Diploma: Information & Communication Technology: Applications Development" , "Academic\" +\"Non-academic");


    @Test
    void create() {
        Department create = Departmentreposit.create(department);
        assertEquals(create.toString(), department.toString());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        Department read = Departmentreposit.read(department.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Department update = Departmentreposit.update(department);
        System.out.println("Update: " + update);
    }

    @Test
    void delete() {
        boolean success = Departmentreposit.delete(department.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void getAll() {

        { System.out.println("Get all: " + Departmentreposit.getAll());
        }

    }
}