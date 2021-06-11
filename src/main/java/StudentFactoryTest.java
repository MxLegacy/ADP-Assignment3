import jdk.jfr.StackTrace;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    public void testCreateStudent(){
        Student student = StudentFactory.createStudent("Ronald",211875465,"211875465@mycput.ac.za","ITS","ICT");
        Student student2 = student;
        assertEquals(student,student2);

    }
}