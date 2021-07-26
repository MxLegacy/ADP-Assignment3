/* NonAcademicStaff.java
Repository for Non Academic Staff
Author:
Date: 25 July 2021
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;
import java.util.*;

public class CourseRepository implements ICourseRepository {
    private static CourseRepository Coursereposit = null;
    private Set<Course> Cdb;

    private CourseRepository(){
        Cdb = new HashSet<>();
    }

    public static CourseRepository getRepo(){
        if (Coursereposit == null){
            Coursereposit = new CourseRepository();
        }
        return Coursereposit;
    }

    @Override
    public Course create(Course course) {
        boolean success = Cdb.add(course);
        if (!success){
            return null;
        }
        return course;
    }

    @Override
    public Course read(String courseName) {
        for (Course c : Cdb)
            if (c.toString().equals(courseName)) {
                return c;
            }
        return null;
    }

    @Override
    public Course update(Course course) {
        Course old = read(course.toString());
        if (old != null) {
            Cdb.remove(old);
            Cdb.add(course);
            return course;
        }
        return null;
    }




    @Override
    public boolean delete(String Coursename) {
        Course Cdelete = read(Coursename);
        if (Cdelete == null)
            return false;
        Cdb.remove(Cdelete);
        return true;
    }

    @Override
    public Set<Course> getAll() {
        return null;
    }
}

