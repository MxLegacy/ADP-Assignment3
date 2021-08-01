package za.ac.cput.factory;
/*      DepartmentFactory.java
        Factory class for the department
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
import za.ac.cput.Entity.Department;

public class DepartmentFactory {

    public static Department buildDepartment(String deptName,
                                             String deptFaculty,
                                             String deptCourseList,
                                             String deptStaffType)
    {
        return new Department.Builder()
                .setDeptName(deptName)
                .setDeptFaculty(deptFaculty)
                .setDeptCourseList(deptCourseList)
                .setDeptStaffType(deptStaffType)

                .Build();
    }
}

