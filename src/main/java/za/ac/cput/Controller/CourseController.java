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

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    //@PostMapping("/create")
    public Course create(@RequestBody Course course){
        Course newCourse = CourseFactory.buildCourse(course.getCourseName(), course.getCourseDepartment(), course.getCourseSubjectList());
        return courseService.create(newCourse);


    }
    @GetMapping("/read")
    public Course read(@PathVariable String id){
        return courseService.read(id);
    }



    @PostMapping("/delete")
    public String delete(@RequestBody Course course){
        if (courseService.delete(course.getCourseName()))
            return "Deleted";
        else
            return "Request unsuccessful";
    }

    @GetMapping("/getall")
    public Set<Course> getall() {
        return courseService.getAll();
    }
}







