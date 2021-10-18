package za.ac.cput.Service;

/*
NonAcademicStaffService.java
Author: Tatum De Wet 218069227
 */

import org.springframework.stereotype.Service;
import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.Repository.NonAcademicStaffRepository;

import java.util.Set;

@Service
public class NonAcademicStaffService implements INASService{
    private static NonAcademicStaffService NASservice = null;
    private NonAcademicStaffRepository NASrepo;

    private NonAcademicStaffService(){
        this.NASrepo = NonAcademicStaffRepository.getRepository();
    }

    public static NonAcademicStaffService getService(){
        if(NASservice == null){
            NASservice = new NonAcademicStaffService();
        }
        return NASservice;
    }

    @Override
    public NonAcademicStaff create (NonAcademicStaff nonAcademicStaff){
        return this.NASrepo.create(nonAcademicStaff);
    }

    @Override
    public NonAcademicStaff read (String NASname){
        return this.NASrepo.read(NASname);
    }

    @Override
    public NonAcademicStaff update (NonAcademicStaff nonAcademicStaff){
        return this.NASrepo.update(nonAcademicStaff);
    }

    @Override
    public boolean delete (String NASname){
        return this.NASrepo.delete(NASname);
    }

    @Override
    public Set<NonAcademicStaff> getAll(){
        return this.NASrepo.getAll();
    }
}
