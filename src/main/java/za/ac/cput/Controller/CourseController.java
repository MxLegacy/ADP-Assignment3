package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Course;
import za.ac.cput.Service.CourseService;
import za.ac.cput.factory.CourseFactory;

import java.util.Set;
/*      CourseController.java
        Entity
        Author: Devon Daniels (217299822)

 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public Course create (@RequestBody Course course){
        Course newCourse = CourseFactory.buildCourse(course.getCourseName(), course.getCourseSubjectList(), course.getCourseDepartment());
        return CourseService.getCourseService().create(newCourse);
    }

    @GetMapping("/read/{CourseName")
    public Course read(Course course){
        return courseService.read(course.getCourseName());
    }

    @PostMapping("/delete/{CourseName")
    public String delete(@RequestBody Course course){
        if (courseService.delete(course.getCourseName()))
            return "Success";
        else
            return "error";
    }

    @GetMapping("/getall")
    public Set<Course> getAll() {
        return courseService.getAll();
    }
    }





