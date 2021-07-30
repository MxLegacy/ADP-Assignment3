package za.ac.cput.Repository;
/*      CourseRepositoryTest.java
        Entity for the department
        Author: Devon Daniels (217299822)
        Date: 26 July 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Course;
import za.ac.cput.factory.CourseFactory;
import static org.junit.jupiter.api.Assertions.*;


public class CourseRepositoryTest {
    CourseRepository Coursereposit =  CourseRepository.getRepo();;
    Course course =  CourseFactory.buildCourse(" MTech: Information Technology", "Thesis (R5IT01R)", "Information Technology");


    @Test
    void create() {
        Course create = Coursereposit.create(course);
        assertEquals(create.toString(), course.toString());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        Course read = Coursereposit.read(course.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Course update = Coursereposit.update(course);
        System.out.println("Update: " + update);
    }

    @Test
    void delete() {
        boolean success = Coursereposit.delete(course.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void getAll() {

        { System.out.println("Get all: " + Coursereposit.getAll());
        }

    }
}