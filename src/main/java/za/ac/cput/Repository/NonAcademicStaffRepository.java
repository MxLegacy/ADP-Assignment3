/* NonAcademicStaff.java
Repository for Non Academic Staff
Author: Tatum De Wet (218069227)
Date: 25 July 2021
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.NonAcademicStaff;
import java.util.*;

public class NonAcademicStaffRepository implements INASRepository {
    private static NonAcademicStaffRepository NASrepo = null;
    private Set<NonAcademicStaff> NASdb;

    private NonAcademicStaffRepository(){
        NASdb = new HashSet<>();
    }

    public static NonAcademicStaffRepository getRepo(){
        if (NASrepo == null){
            NASrepo = new NonAcademicStaffRepository();
        }
        return NASrepo;
    }

    @Override
    public NonAcademicStaff create(NonAcademicStaff nonAcademicStaff) {
        boolean success = NASdb.add(nonAcademicStaff);
        if (!success){
            return null;
        }
        return nonAcademicStaff;
    }

    @Override
    public NonAcademicStaff read(String NASname) {
        for (NonAcademicStaff nas : NASdb)
            if (nas.toString().equals(NASname)) {
                return nas;
            }
        return null;
    }

    @Override
    public NonAcademicStaff update(NonAcademicStaff nonAcademicStaff) {
        NonAcademicStaff old = read(nonAcademicStaff.toString());
        if (old != null) {
             NASdb.remove(old);
             NASdb.add(nonAcademicStaff);
             return nonAcademicStaff;
        }
        return null;
    }

    @Override
    public boolean delete(String NASname) {
        NonAcademicStaff NASdelete = read(NASname);
        if (NASdelete == null)
            return false;
        NASdb.remove(NASdelete);
        return true;
    }

    @Override
    public Set<NonAcademicStaff> getAll() {
        return null;
    }
}
