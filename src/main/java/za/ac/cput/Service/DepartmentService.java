package za.ac.cput.Service;
/*      DepartmentService.java
        Entity for the departmentService
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import org.springframework.stereotype.Service;
import za.ac.cput.Entity.Department;
import za.ac.cput.Repository.CourseRepository;
import za.ac.cput.Repository.DepartmentRepository;

import java.util.HashSet;
import java.util.Set;
@Service
public class DepartmentService implements IDepartmentService{
    private static DepartmentService departmentService;
    private DepartmentRepository departmentRepository;

    private DepartmentService() {
        this.departmentRepository = DepartmentRepository.getRepository();
    }




    public static DepartmentService getService(){
        if (departmentService == null ) {
            departmentService = new DepartmentService();
        }
        return departmentService;
    }

    public Department create(Department department){
        return this.departmentRepository.create(department);}


    public Department read(String deptName){

        return this.departmentRepository.read(deptName);
    }

    public Department update(Department department){
        return this.departmentRepository.update(department);
    }

    public boolean delete(String deptName){
        return this.departmentRepository.delete(deptName);
    }

    public Set<Department> getAll() {
        return this.departmentRepository.getAll();}
}

