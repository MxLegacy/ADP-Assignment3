/* CourseRepository.java
Repository for Course
Author:Devon Daniels
Date: 26 July 2021
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Course;
import java.util.*;


public class CourseRepository implements ICourseRepository {
    private static CourseRepository repository = null;
    private Set<Course> courseDB;


    private CourseRepository() {
        this.courseDB = new HashSet<>();
    }

    public static CourseRepository getRepository() {
        if (repository == null) {
            repository = new CourseRepository();
        }
        return repository;
    }


    @Override
    public Course create(Course course) {
        this.courseDB.add(course);
        return course;
    }


    @Override
    public Course read(String courseName) {
        for (Course c : courseDB)
            if (c.getCourseName().equals(courseName)) {
                return c;
            }
        return null;
    }


    @Override
    public Course update(Course course) {
        Course course1 = read(course.getCourseName());
        if (course1 != null) {
            courseDB.remove(course1);
            courseDB.add(course);
            return course;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {

        return false;
    }


    @Override
    public Course delete(Course course) {
        Course deleteCourse = read(course.getCourseName());
        if (deleteCourse == null) {

            courseDB.remove(deleteCourse);
            System.out.println("Course removed.");
        }
        return deleteCourse;
    }


    public Set<Course> getAll() {
        return courseDB;
    }
}