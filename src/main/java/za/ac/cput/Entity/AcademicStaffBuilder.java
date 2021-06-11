package za.ac.cput.Entity;

public class AcademicStaffBuilder extends AcademicStaff {

    AcademicStaffBuilder(String name, String position, String department, String course) {
        super(name, position, department, course);
    }

    public static void main (String[] args) {

        AcademicStaff academicstaffobj = new AcademicStaffBuilder()
                .setName("Tawfeeq Cupido")
                .setPosition("Intern")
                .setDepartment("Engineering")
                .setCourse("Information Technology")
                .build();

        System.out.println(academicstaffobj);
    }
}

