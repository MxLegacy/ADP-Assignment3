import java.util.Arrays;

public class University {

    String universityName = "My University";
    String[] facultyList = {"IT", "Art", "Marketing"};

    public University(Builder builder) {
        this.universityName = builder.universityName;
        this.facultyList = builder.facultyList;
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
