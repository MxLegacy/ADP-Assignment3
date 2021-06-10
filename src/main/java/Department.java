/*      Department.java
        Entity for the Department
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
public class Department {
    private String deptName, deptFaculty, deptCourseList, deptStaffType;

    private Department(Builder builder) {
        this.deptName = builder.deptName;
        this.deptFaculty = builder.deptFaculty;
        this.deptCourseList = builder.deptCourseList;
        this.deptStaffType = builder.deptStaffType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptFaculty='" + deptFaculty + '\'' +
                ", deptCourseList='" + deptCourseList + '\'' +
                ", deptStaffType='" + deptStaffType + '\'' +
                '}';

}
    public static class Builder{
        private String deptName, deptFaculty, deptCourseList, deptStaffType;

        public Builder setDeptName(String deptName) {
            this.deptName = deptName;

            return this ;
        }

        public Builder setDeptFaculty(String deptFaculty) {
            this.deptFaculty = deptFaculty;
            return this;
        }

        public Builder setDeptCourseList(String deptCourseList) {
            this.deptCourseList = deptCourseList;

            return this;
        }

        public Builder setDeptStaffType(String deptStaffType) {
            this.deptStaffType = deptStaffType;

            return this;
        }

        public Department Build(){

            return new Department(this);
        }

        public Builder copy(Department department) {
            this.deptName = department.deptName;
            this.deptFaculty = department.deptFaculty;
            this.deptCourseList = department.deptCourseList;
            this.deptStaffType = department.deptStaffType;

            return this;
        }
    }
}
