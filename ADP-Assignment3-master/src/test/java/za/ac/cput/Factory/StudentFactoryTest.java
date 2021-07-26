package za.ac.cput.Factory;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Student;
import za.ac.cput.factory.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

/*
    Name : Umba joseph djamba
    Student Number: 218292694
    Description: Student Entity
 */

class StudentFactoryTest {

    @Test
    public void testCreateStudent(){
        Student student = StudentFactory.createStudent("Ronald",211875465,"211875465@mycput.ac.za","ITS","ICT");
        Student student2 = student;
        assertEquals(student,student2);

    }
}