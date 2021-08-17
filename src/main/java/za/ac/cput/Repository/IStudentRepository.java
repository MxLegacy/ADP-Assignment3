/*     IStudentRepository.java
        The entity for student
        Author: Umba joseph Djamba (218292694)
        Date: 26 July 2021
 */
import za.ac.cput.Entity.Student;
import java.util.Set;
public class IStudentRepository {


    public interface IStudentRepository extends IStudent<Student, String>{
        Student create(Student student);

        Student delete(Student student);

        Set<Student> getAll();
    }

}