package za.ac.cput.Repository;
/*

 Author: Tawfeeq Cupido (216266882)
Date: 24 July 2021
*/

import java.util.Set;
import za.ac.cput.Entity.AcademicStaff;

public interface IASRepository extends IRepository<AcademicStaff, String>{
    Set<AcademicStaff> getAll();
}