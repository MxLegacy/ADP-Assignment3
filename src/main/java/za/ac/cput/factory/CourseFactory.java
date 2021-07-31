package za.ac.cput.factory;
/*      CourseFactory.java
        Factory class for the course
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
import za.ac.cput.Entity.Course;

public class CourseFactory {

    public static Course buildCourse(String courseName,
                                     String courseSubjectList,
                                     String courseDepartment
    )
    {
        return new Course.Builder()
                .setCourseName(courseName)
                .setSubjectList(courseSubjectList)
                .setDepartment(courseDepartment)

                .Build();
    }
}
