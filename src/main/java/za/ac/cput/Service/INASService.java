package za.ac.cput.Service;

import za.ac.cput.Entity.NonAcademicStaff;

import java.util.Set;

public interface INASService extends iService<NonAcademicStaff, String>{
    Set<NonAcademicStaff> getAll();
}
