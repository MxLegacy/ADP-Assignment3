public class StudentFactory {
    public static Student createStudent(String studentName,int studentNum,String studentEmail, String course, String department){
        Student student = Student.studentBuilder()
                .withStudentName(studentName)
                .withStudentNum(studentNum)
                .withStudentEmail(studentEmail)
                .withCourse(course)
                .withDepartment(department)
                .build();
        return student;

    }
}
