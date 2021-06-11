package za.ac.cput.Entity;

public class AcademicStaff {

    String name;
    String position;
    String department;
    String course;


    AcademicStaff(String name, String position, String department, String
            course) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.course = course;


    }


    public String toString() {

        return "Name = " + name + " \n Position = " + position + "\n za.ac.cput.Entity.Department = " + department + "" + "\n za.ac.cput.Entity.Course = " + course + "";


    }


    public static class AcademicStaffBuilder {

        String name;
        String position;
        String department;
        String course;

        public AcademicStaffBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AcademicStaffBuilder setPosition(String position) {
            this.position = position;
            return this;
        }

        public AcademicStaffBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public AcademicStaffBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public AcademicStaff build() {
            return new AcademicStaff( name, position, department, course);
        }

    }




}

