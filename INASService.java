package za.ac.cput.Service;

/*
iNASService.java
Author: Tatum De Wet 218069227
 */

import za.ac.cput.Entity.NonAcademicStaff;

import java.util.Set;

public interface INASService extends iService<NonAcademicStaff, String>{
    Set<NonAcademicStaff> getAll();
}
