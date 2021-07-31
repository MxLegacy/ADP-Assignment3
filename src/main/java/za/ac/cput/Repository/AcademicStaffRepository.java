package za.ac.cput.Repository;

/*
Repository for Academic Staff
 Author: Tawfeeq Cupido (216266882)
Date: 24 July 2021
*/


import za.ac.cput.Entity.AcademicStaff;

import java.util.HashSet;
import java.util.Set;

public class AcademicStaffRepository implements IASRepository {

    private static AcademicStaffRepository ASrepo = null;
    private Set<AcademicStaff> ASdb;

    private AcademicStaffRepository(){
        ASdb = new HashSet<>();
    }

    public static AcademicStaffRepository getRepo(){
        if (ASrepo == null){
            ASrepo = new AcademicStaffRepository();
        }
        return ASrepo;
    }

    @Override
    public AcademicStaff create(AcademicStaff academicStaff) {
        boolean success = ASdb.add(academicStaff);
        if (!success){
            return null;
        }
        return academicStaff;
    }

    @Override
    public AcademicStaff read(String ASname) {
        for (AcademicStaff as : ASdb)
            if (as.toString().equals(ASname)) {
                return as;
            }
        return null;
    }

    @Override
    public AcademicStaff update(AcademicStaff academicStaff) {

        AcademicStaff old = read(academicStaff.toString());

        if (old != null) {
            ASdb.remove(old);
            ASdb.add(academicStaff);
            return academicStaff;
        }
        return null;
    }

    @Override
    public boolean delete(String ASname) {
        AcademicStaff ASdelete = read(ASname);
        if (ASdelete == null)
            return false;
        ASdb.remove(ASdelete);
        return true;
    }

    @Override
    public Set<AcademicStaff> getAll() {
        return null;
    }
}
