package za.ac.cput.Service;

import za.ac.cput.Entity.AcademicStaff;


import java.util.Set;

public interface IASService extends iService<AcademicStaff, String>{
    Set<AcademicStaff> getAll();
}
