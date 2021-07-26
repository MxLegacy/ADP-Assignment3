package za.ac.cput.Repository;

import java.util.Set;
import za.ac.cput.Entity.AcademicStaff;

public interface IASRepository extends IRepository<AcademicStaff, String>{
        Set<AcademicStaff> getAll();
}
