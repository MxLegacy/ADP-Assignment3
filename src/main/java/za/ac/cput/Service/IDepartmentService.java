package za.ac.cput.Service;
/*      IDepartmentService.java
        Entity for the IdepartmentService
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import za.ac.cput.Entity.Department;

import java.util.Set;

public interface IDepartmentService extends iService<Department, String> {
    Set<Department> getAll();
}
