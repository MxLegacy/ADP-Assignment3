package za.ac.cput.Controller;
/*      DepartmentController.java
        Entity
        Author: Devon Daniels (217299822)

 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Department;
import za.ac.cput.Service.CourseService;
import za.ac.cput.Service.DepartmentService;
import za.ac.cput.factory.CourseFactory;
import za.ac.cput.factory.DepartmentFactory;

import java.util.Set;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    //@PostMapping("/create")
    public Department create(@RequestBody Department department){
        Department newDepartment = DepartmentFactory.buildDepartment("Architectural Technology and Interior Design "," Informatics & Design", """
                Diploma: Information & Communication Technology: Multimedia Applications\s
                Diploma: Information & Communication Technology: Communications Networks\s
                Diploma: Information & Communication Technology: Applications Development\s""", "Academic" +"Non-academic");
        return departmentService.create(newDepartment);


    }
    @GetMapping("/read")
    public Department read(@PathVariable String id){
        return departmentService.read(id);
    }



    @PostMapping("/delete")
    public String delete(@RequestBody Department department){
        if (departmentService.delete(department.getDeptName()))
            return "Deleted";
        else
            return "Request unsuccessful";
    }

    @GetMapping("/getall")
    public Set<Department> getall() {
        return departmentService.getAll();
    }
}







