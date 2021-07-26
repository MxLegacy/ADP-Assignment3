package za.ac.cput.Entity;

/*
    University.java
    Entity for uiversity
    Author: Michael Alex Dirks (218306083)
    Date: 11 June 2021
*/

import za.ac.cput.Repository.IRepository;

public class University implements IRepository {



    String universityName = "My za.ac.cput.Entity.University";
    String[] facultyList = {"IT", "Art", "Marketing"};

    public University(Builder builder) {
        this.universityName = builder.universityName;
        this.facultyList = builder.facultyList;
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
        private String universityName;
        private String[] facultyList;

        public Builder setUniversityName(String universityName){
            this.universityName = universityName;

            return this;
        }

        public Builder setfacultyList(String setFacultyList){
            this.facultyList = facultyList;

            return this;
        }

        public University build() {
             return new University(this);
         }

        public Builder copy(University university){
            this.universityName = universityName;
            this.facultyList = facultyList;
            return this;

        }


    }

}
