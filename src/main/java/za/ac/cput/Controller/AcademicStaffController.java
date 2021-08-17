package za.ac.cput.Controller;
/*      AcademicStaff.java

        Author: Tawfeeq Cupido (216266882)


 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.AcademicStaff;
import za.ac.cput.Service.AcademicStaffService;
import za.ac.cput.factory.AcademicStaffFactory;



import java.util.Set;

@RestController
@RequestMapping("/AcademicStaff")

public class AcademicStaffController {
    @Autowired
    private AcademicStaffService academicStaffService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public AcademicStaff create(@RequestBody AcademicStaff academicStaff){
        AcademicStaff newAS = AcademicStaffFactory.ASBuilder(academicStaff.getASname(), academicStaff.getASposition(),
                academicStaff.getASdepartment(), academicStaff.getAScourse());
        return academicStaffService.create(newAS);
    }

    @GetMapping("/read/{ASname}")
    public AcademicStaff read(@PathVariable String ASname){
        return academicStaffService.read(ASname);
    }

    @PostMapping("/update")
    public AcademicStaff update(@RequestBody AcademicStaff academicStaff){
        return academicStaffService.update(academicStaff);
    }

    @PostMapping("/delete/{ASname}")
    public boolean delete(@PathVariable String ASname){
        return academicStaffService.delete(ASname);
    }

    @GetMapping("/getall")
    public Set<AcademicStaff> getAll(){
        return academicStaffService.getAll();
    }
}



