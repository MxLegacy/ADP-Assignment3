package za.ac.cput.factory;

/*
    UniversityFactory.java
    entity for uiversity fatory
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/

import za.ac.cput.Entity.University;

public class UniversityFactory {

    public static University createUniversity(String universityName, String facultyList) {
        University university = new University.Builder()
                .setUniversityName(universityName)
                .setfacultyList(facultyList)
                .build();
        return university;

    }

    }
