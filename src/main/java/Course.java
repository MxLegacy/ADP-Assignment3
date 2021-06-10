
public class Course {
    private String courseName, subjectList, department;

    private Course(Builder builder) {
        this.courseName = builder.courseName;
        this.subjectList = builder.subjectList;
        this.department = builder.department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", subjectList='" + subjectList + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static class Builder {
        private String courseName, subjectList, department;

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;

            return this;
        }

        public Builder setSubjectList(String subjectList) {
            this.subjectList = subjectList;

            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;

            return this;
        }


        public Course Build() {

            return new Course(this);
        }

        public Builder copy(Course course) {
            this.courseName = course.courseName;
            this.subjectList = course.subjectList;
            this.department = course.department;

            return this;
        }


    }

}