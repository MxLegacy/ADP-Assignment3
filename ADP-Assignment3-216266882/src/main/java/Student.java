
/*
    Name : Umba joseph djamba
    Student Number: 218292694
    Description: Student Entity
 */

public class Student {
    private String studentName;
    private int studentNum;
    private String studentEmail;
    private String course;
    private String department;

    private Student(StudentBuilder builder){
        this.studentName = builder.studentName;
        this.studentNum = builder.studentNum;
        this.studentEmail = builder.studentEmail;
        this.course = builder.course;
        this.department = builder.department;
    }

    public static StudentBuilder bookAlertBuilder(Student copy){
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.studentName = copy.studentName;
        studentBuilder.studentNum = copy.studentNum;
        studentBuilder.studentEmail = copy.studentEmail;
        studentBuilder.course = copy.course;
        studentBuilder.department = copy.department;
        return studentBuilder;
    }


    public static class StudentBuilder{
        private String studentName;
        private int studentNum;
        private String studentEmail;
        private String course;
        private String department;

        public StudentBuilder withStudentName(String studentName) {
            this.studentName = studentName;
            return this;
        }

        public StudentBuilder withStudentNum(int studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public StudentBuilder withStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }

        public StudentBuilder withCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder withDepartment(String department) {
            this.department = department;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
