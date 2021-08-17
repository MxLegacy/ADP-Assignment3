/* StudentRepository.java
Repository for student
Author: Umba joseph Djamba (218292694)
Date: 26 July 2021
*/

package za.ac.cput.Repository;
import java.util.HashSet;
import java.util.Set;

import za.ac.cput.Entity.Student;

public class StudentRepository implements IStudentRepository {
    public static StudentRepository repository = null; 
    private Set<Student> studentDB; 

    private StudentRepository() {
this.studentDB = new HashSet<>();}

        public static StudentRepository getRepository () {
            if (repository == null) {
                repository = new StudentRepository();
            }
            return repository; 
        }
 @Override
        public student create (Student student){
            this.studentDB.add(student);
            return student; 
        }
@Override
        public Student read( String studentNum ) {
            for (Student s: studentDB)
            if (s.getStudentNum().equals(studentNum)){
                return s; 
            }
            return null; 
        }
@Override
    public Student update(Student student) {
            Student student1 = read(student.getstudentNum());
            if (course != null) {
                studentDB.remove (student1);
                studentDB.add(student);
                return course; 
            } 
        return null;

        }
        @Override 
        public boolean delete (string s) {
            return false ; 
        }

    @Override
    public Student delete(Student student) {
        Student deleteStudent = read(student.getStudentNum());
        if (deleteStudent == null) {

            studentDB.remove(deleteCourse);
            System.out.println("Student was removed.");
        }
        return deleteStudent;
    }
    public Set <Student> getAll() {return studentDB; }
}
  
