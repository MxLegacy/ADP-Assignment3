package za.ac.cput.Repository;
/*      ICourseRepository.java
        Entity for the department
        Author: Devon Daniels (217299822)
        Date: 26 July 2021
 */
import za.ac.cput.Entity.Course;

import java.util.Set;



public interface ICourseRepository extends IRepository<Course, String>{
    Set<Course> getAll();
}

