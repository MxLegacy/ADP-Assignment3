package za.ac.cput.Service;
/*      DepartmentServiceTest.java
        Entity for the departmentServiceTest
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import org.junit.jupiter.api.Test;

import za.ac.cput.Entity.Department;

import za.ac.cput.factory.DepartmentFactory;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentServiceTest {
    DepartmentService DeptSer =  DepartmentService.getService();
    Department department =  DepartmentFactory.buildDepartment("Electrical, Electronic and Computer Engineering", "Informatics & Design", "Diploma: Information & Communication Technology: Applications Development" , "Academic\" +\"Non-academic");


    @Test
    void create() {
        Department create = DeptSer.create(department);
        assertEquals(create.toString(), department.toString());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        Department read = DeptSer.read(department.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {Department update = DeptSer.update(department);
        System.out.println("Update: " + update);
    }

    @Test
    void delete() {
        boolean success = DeptSer.delete(department.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void getAll() {
        { System.out.println("Get all: " + DeptSer.getAll());
        }

    }
}