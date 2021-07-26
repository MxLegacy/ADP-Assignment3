package za.ac.cput.factory;

/*
    FactoryFaculty.java
    Entity for faculty fatory
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/

import za.ac.cput.Entity.Faculty;
public class FactoryFaculty {

    public static Faculty createFaculty(String facultyName,  String departmentList)
    {
        Faculty faculty = new Faculty.Builder()
        .setFacultyName(facultyName)
        .setDepartmentList(departmentList)
            .build();

        return faculty;
    }

}
