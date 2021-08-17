package za.ac.cput.Entity;

/*      AcademicStaff.java

        Author: Tawfeeq Cupido (216266882)
        Date: 8 June 2021

 */

public class AcademicStaff {

    String ASname;
    String ASposition;
    String ASdepartment;
    String AScourse;

    private AcademicStaff(AcademicStaff.ASBuilder builder) {
        this.ASname = builder.ASname;
        this.ASposition = builder.ASposition;
        this.ASdepartment = builder.ASdepartment;
        this.AScourse = builder.AScourse;
    }

    @Override
    public  String toString() {
        return "AcademicStaff: " +
                "Name='" + ASname + '\'' +
                ", Position='" + ASposition + '\'' +
                ", Department='" + ASdepartment + '\'' +
                ", Courses='" + AScourse + '\'' +
                '}';
    }

    public String getASname() {
        return ASname;
    }

    public String getASposition() {
        return ASposition;
    }

    public String getASdepartment() {
        return ASdepartment;
    }

    public String getAScourse() {
        return AScourse;
    }

    public static class ASBuilder{
        private String ASname, ASposition, ASdepartment, AScourse;

        public AcademicStaff.ASBuilder setASname(String ASname) {
            this.ASname = ASname;
            return this;
        }

        public AcademicStaff.ASBuilder setASposition(String ASposition) {
            this.ASposition = ASposition;
            return this;
        }

        public AcademicStaff.ASBuilder setASdepartment(String ASdepartment) {
            this.ASdepartment = ASdepartment;
            return this;
        }

        public AcademicStaff.ASBuilder setAScourse(String AScourse) {
            this.AScourse = AScourse;
            return this;
        }

        //return constructed object
        public AcademicStaff build(){
            return new AcademicStaff(this);
        }

        public ASBuilder copy(AcademicStaff AcademicStaff){
            this.ASname = AcademicStaff.ASname;
            this.ASposition = AcademicStaff.ASposition;
            this.ASdepartment = AcademicStaff.ASdepartment;
            this.AScourse = AcademicStaff.AScourse;
            return this;
        }
    }
}

