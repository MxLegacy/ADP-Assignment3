package za.ac.cput.Service;
/*      CourseService.java
        Entity for the CourseService
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */


import za.ac.cput.Entity.Course;


import java.util.HashSet;
import java.util.Set;

public class CourseService implements ICourseService{
    private static CourseService CourseSer = null;
    private Set<Course> CSdB;
    private CourseService(){
        CSdB = new HashSet<>();
    }




    public static CourseService getService(){
        if (CourseSer == null ) {
            CourseSer = new CourseService();
        }
        return CourseSer;
    }

    public Course create(Course course){
        boolean success = CSdB.add(course);
        if (!success){
            return null;
        }
        return course;
    }

    public Course read(String courseName){

            for (Course c : CSdB)
                if (c.toString().equals(courseName)) {
                    return c;
                }
            return null;
        }

    public Course update(Course course){
        Course old = read(course.toString());
        if (old != null) {
            CSdB.remove(old);
            CSdB.add(course);
            return course;
        }
        return null;
    }

    public boolean delete(String courseName){
        Course Cdelete = read(courseName);
        if (Cdelete == null)
            return false;
        CSdB.remove(Cdelete);
        return true;
    }

    public Set<Course> getAll() {
        return null;
    }
}



