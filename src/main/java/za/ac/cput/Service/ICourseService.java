package za.ac.cput.Service;
/*      ICourseServiceTest.java
        Entity for the ICourseServiceTest
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import za.ac.cput.Entity.Course;

import java.util.Set;


    public interface ICourseService extends iService<Course, String> {
        Set<Course> getAll();


}
