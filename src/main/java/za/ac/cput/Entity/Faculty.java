package za.ac.cput.Entity;

/*
    Entity for faculty
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/

import za.ac.cput.Repository.FacultyRepository;

public class Faculty implements FacultyRepository {



    String facultyName = "My Faculty";
    String[] departmentList = {"System Administration", "Application Development", "Multimedia", "Networking"};

    public Faculty(Faculty.Builder builder) {
        this.facultyName = builder.facultyName;
        this.departmentList = builder.departmentList;
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

    public static class Builder{
        private String facultyName;
        private String[] departmentList;

        public Faculty.Builder setFacultyName(String facultyName){
            this.facultyName = facultyName;

            return this;
        }

        public Faculty.Builder setDepartmentList(String setDepartmentList){
            this.departmentList = departmentList;

            return this;
        }

        public Faculty build() {
            return new Faculty(this);
        }

        public Faculty.Builder copy(Faculty faculty){
            this.facultyName = facultyName;
            this.departmentList = departmentList;
            return this;

        }


    }


}
