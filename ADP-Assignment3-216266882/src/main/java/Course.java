/*      Course.java
        Entity for the course
        Author: Devon Daniels (217299822)
        Date: 11 June 2021

 */
public class Course {
    private String courseName, courseSubjectList, courseDepartment;

    private Course(Builder builder) {
        this.courseName = builder.courseName;
        this.courseSubjectList = builder.courseSubjectList;
        this.courseDepartment = builder.courseDepartment;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", subjectList='" + courseSubjectList + '\'' +
                ", department='" + courseDepartment + '\'' +
                '}';
    }

    public static class Builder {
        private String courseName, courseSubjectList, courseDepartment;

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;

            return this;
        }

        public Builder setSubjectList(String courseSubjectList) {
            this.courseSubjectList = courseSubjectList;

            return this;
        }

        public Builder setDepartment(String courseDepartment) {
            this.courseDepartment = courseDepartment;

            return this;
        }


        public Course Build() {

            return new Course(this);
        }

        public Builder copy(Course course) {
            this.courseName = course.courseName;
            this.courseSubjectList = course.courseSubjectList;
            this.courseDepartment = course.courseDepartment;

            return this;
        }


    }

}