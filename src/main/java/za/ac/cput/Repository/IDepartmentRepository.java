package za.ac.cput.Repository;
/*      IDepartmentRepository.java
        Entity for the department
        Author: Devon Daniels (217299822)
        Date: 26 July 2021
 */

import za.ac.cput.Entity.Department;

import java.util.Set;



public interface IDepartmentRepository extends IRepository<Department, String>{
    Set<Department> getAll();
}