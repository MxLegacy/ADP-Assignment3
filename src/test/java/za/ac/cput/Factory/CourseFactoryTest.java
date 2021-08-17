package za.ac.cput.Factory;
/*      CourseFactoryTest.java
        Test case for the course
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseFactoryTest {
    Course course;

    @BeforeEach
    void setUp() {
        course = CourseFactory.buildCourse("MTech: Information Technology ","  Thesis (R5IT01R)","Information Technology");
    }
    @Test
    void buildUser(){
        assertNotNull(course);
        System.out.println(course);
    }


}