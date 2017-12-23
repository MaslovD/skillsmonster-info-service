package io.dmitr.skillsmonster.infoservice.repo;



import io.dmitr.skillsmonster.infoservice.model.Student;

import java.util.Map;

public interface StudentRepository {

    void saveStudent(Student person);

    void updateStudent(Student student);

    Student findStudent(String id);

    Map<Object, Object> findAllStudents();

    void deleteStudent(String id);
}
