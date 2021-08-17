package za.ac.cput.Service;
/*      CourseServiceTest.java
        Entity for the CourseServiceTest
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CourseServiceTest {
    CourseService CourseSer =  CourseService.getService();
    Course course =  CourseFactory.buildCourse(" MTech: Information Technology", "Thesis (R5IT01R)", "Information Technology");



    @Test
    void create() {
        Course create = CourseSer.create(course);
        assertEquals(create.toString(), course.toString());
        System.out.println("Created: " + create);
    }


    @Test
    void read() {
        Course read = CourseSer.read(course.toString());
        assertNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        Course update = CourseSer.update(course);
        System.out.println("Update: " + update);
    }

    @Test
    void delete() {
        boolean success = CourseSer.delete(course.toString());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void getAll() {
        { System.out.println("Get all: " + CourseSer.getAll());
        }

    }
}