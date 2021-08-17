package za.ac.cput.Service;
/*      CourseService.java
        Entity for the CourseService
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */


import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Course;
import za.ac.cput.Repository.CourseRepository;

import java.util.Set;

@Service
public class CourseService implements ICourseService {
    private static CourseService courseService;
    private CourseRepository courseRepository;

    private CourseService() {
        this.courseRepository = CourseRepository.getRepository();
    }

    public static CourseService getCourseService() {
        if (courseService == null) {
            courseService = new CourseService();
        }
        return courseService;
    }




    public Course create(Course course) {

        return this.courseRepository.create(course);
    }


    public Course read(String courseName) {
        return this.courseRepository.read(courseName);

    }

    public Course update(Course course)
    {return this.courseRepository.update(course);
    }

    public boolean delete(String course) {
        return this.courseRepository.delete(course);

    }
    @Override
    public Set<Course> getAll() {
        return this.courseRepository.getAll();

    }


}



