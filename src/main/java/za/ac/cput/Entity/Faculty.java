package za.ac.cput.Entity;

public class Faculty {

    String facultyName = "My za.ac.cput.Entity.Faculty";
    String[] departmentList = {"System Administration", "Application Development", "Multimedia", "Networking"};

    public Faculty(Faculty.Builder builder) {
        this.facultyName = builder.facultyName;
        this.departmentList = builder.departmentList;
    }

    public static class Builder{
        private String facultyName;
        private String[] departmentList;

        public Faculty.Builder setFacultyName(String facultyName){
            this.facultyName = facultyName;

            return this;
        }

        public Faculty.Builder setDepartmentyList(String setDepartmentList){
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
