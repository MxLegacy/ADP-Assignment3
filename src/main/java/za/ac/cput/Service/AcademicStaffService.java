package za.ac.cput.Service;
/*
Repository for Academic Staff
 Author: Tawfeeq Cupido (216266882)
Date: 1 August 2021
*/

import za.ac.cput.Entity.AcademicStaff;
import za.ac.cput.Repository.AcademicStaffRepository;



import java.util.Set;


public class AcademicStaffService implements IASService{
    private static AcademicStaffService ACS = null;
    private AcademicStaffRepository ASrepo;

    private AcademicStaffService(){
        this.ASrepo = AcademicStaffRepository.getRepo();
    }
    public static AcademicStaffService getService(){
        if(ACS == null){
            ACS = new AcademicStaffService();
        }
        return ACS;
    }


    @Override
    public AcademicStaff create (AcademicStaff academicStaff){
        return this.ASrepo.create(academicStaff);
    }

    @Override
    public AcademicStaff read (String ASname){
        return this.ASrepo.read(ASname);
    }

    @Override
    public AcademicStaff update (AcademicStaff academicStaff){
        return this.ASrepo.update(academicStaff);
    }


    @Override
    public boolean delete (String ASname){
        return this.ASrepo.delete(ASname);
    }

    @Override
    public Set<AcademicStaff> getAll(){
        return this.ASrepo.getAll();
    }
}

