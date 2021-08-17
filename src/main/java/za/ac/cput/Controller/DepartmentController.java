package za.ac.cput.Controller;
/*      DepartmentController.java
        Entity
        Author: Devon Daniels (217299822)

 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Department;
import za.ac.cput.Service.DepartmentService;
import za.ac.cput.factory.DepartmentFactory;

import java.util.Set;

@RestController
@RequestMapping("/Dept")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public Department create (@RequestBody Department department){
        Department newDepartment = DepartmentFactory.buildDepartment(department.getDeptName(), department.getDeptFaculty(), department.getDeptCourseList(), department.getDeptStaffType());
        return DepartmentService.getService().create(newDepartment);
    }

    @GetMapping("/read/{DeptName")
    public Department read(Department department){
        return departmentService.read(department.getDeptName());
    }

    @PostMapping("/delete/{DeptName")
    public String delete(@RequestBody Department department){
        if (departmentService.delete(department.getDeptName()))
            return "Success";
        else
            return "error";
    }

    @GetMapping("/getall")
    public Set<Department> getAll() {
        return departmentService.getAll();
    }
}





