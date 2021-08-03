package za.ac.cput.Repository;

import java.util.*;
import za.ac.cput.Entity.University;

public class UniversityRepository implements IUniversityRepository{

    private static UniversityRepository repository = null;
    private Set<University> universityDB = null;

    private UniversityRepository(){
        universityDB = new HashSet<University>();

    }

    public static UniversityRepository getRepository(){
        if(repository == null){
            repository = new UniversityRepository();
        }
        return repository;

    }


    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public Object read(Object o) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}
