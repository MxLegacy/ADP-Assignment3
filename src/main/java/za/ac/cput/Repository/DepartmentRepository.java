package za.ac.cput.Repository;
/*      Department.java
        Entity for the department
        Author: Devon Daniels (217299822)
        Date: 26 July 2021
 */

import za.ac.cput.Entity.Department;
import java.util.*;

public class DepartmentRepository implements IDepartmentRepository {
    private static DepartmentRepository Departmentreposit = null;
    private Set<Department> Deptdb;

    private DepartmentRepository(){
        Deptdb = new HashSet<>();
    }

    public static DepartmentRepository getRepo(){
        if (Departmentreposit == null){
            Departmentreposit = new DepartmentRepository();
        }
        return Departmentreposit;
    }

    @Override
    public Department create(Department department) {
        boolean success = Deptdb.add(department);
        if (!success){
            return null;
        }
        return department;
    }

    @Override
    public Department read(String departmentName) {
        for (Department d : Deptdb)
            if (d.toString().equals(departmentName)) {
                return d;
            }
        return null;
    }

    @Override
    public Department update(Department department) {
        Department old = read(department.toString());
        if (old != null) {
            Deptdb.remove(old);
            Deptdb.add(department);
            return department;
        }
        return null;
    }




    @Override
    public boolean delete(String Departmentname) {
        Department Ddelete = read(Departmentname);
        if (Ddelete == null)
            return false;
        Deptdb.remove(Ddelete);
        return true;
    }

    @Override
    public Set<Department> getAll() {
        return null;
    }
}


