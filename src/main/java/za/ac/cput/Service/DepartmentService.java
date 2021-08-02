package za.ac.cput.Service;
/*      DepartmentService.java
        Entity for the departmentService
        Author: Devon Daniels (217299822)
        Date: 02 August 2021
 */

import za.ac.cput.Entity.Department;

import java.util.HashSet;
import java.util.Set;

public class DepartmentService implements IDepartmentService{
    private static DepartmentService DeptSer = null;
    private Set<Department> DdB;
    private DepartmentService(){
        DdB = new HashSet<>();
    }




    public static DepartmentService getService(){
        if (DeptSer == null ) {
            DeptSer = new DepartmentService();
        }
        return DeptSer;
    }

    public Department create(Department department){
        boolean success = DdB.add(department);
        if (!success){
            return null;
        }
        return department;
    }

    public Department read(String deptName){

        for (Department d : DdB)
            if (d.toString().equals(deptName)) {
                return d;
            }
        return null;
    }

    public Department update(Department department){
        Department old = read(department.toString());
        if (old != null) {
            DdB.remove(old);
            DdB.add(department);
            return department;
        }
        return null;
    }

    public boolean delete(String deptName){
        Department Ddelete = read(deptName);
        if (Ddelete == null)
            return false;
        DdB.remove(Ddelete);
        return true;
    }

    public Set<Department> getAll() {
        return null;
    }
}

