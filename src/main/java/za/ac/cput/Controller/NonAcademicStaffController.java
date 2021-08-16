package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.Service.NonAcademicStaffService;
import za.ac.cput.factory.NonAcademicStaffFactory;

import java.util.Set;

@RestController
@RequestMapping("/nonAcademicStaff")
public class NonAcademicStaffController {
    @Autowired
    private NonAcademicStaffService nonAcademicStaffService;

    //@RequestMapping(value = "/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public NonAcademicStaff create(@RequestBody NonAcademicStaff nonAcademicStaff){
        NonAcademicStaff newNAS = NonAcademicStaffFactory.createNonAcademicStaff(nonAcademicStaff.getNASname(), nonAcademicStaff.getNASposition(),
                nonAcademicStaff.getNASdepartment(), nonAcademicStaff.getNASid());
        return nonAcademicStaffService.create(newNAS);
    }

    @GetMapping("/read/{NASname}")
    public NonAcademicStaff read(@PathVariable String NASname){
        return nonAcademicStaffService.read(NASname);
    }

    @PostMapping("/update")
    public NonAcademicStaff update(@RequestBody NonAcademicStaff nonAcademicStaff){
        return nonAcademicStaffService.update(nonAcademicStaff);
    }

    @PostMapping("/delete/{NASname}")
    public boolean delete(@PathVariable String NASname){
        return nonAcademicStaffService.delete(NASname);
    }

    @GetMapping("/getall")
    public Set<NonAcademicStaff> getAll(){
        return nonAcademicStaffService.getAll();
    }
}
