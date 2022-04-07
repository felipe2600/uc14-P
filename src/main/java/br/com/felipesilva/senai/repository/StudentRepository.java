package br.com.felipesilva.senai.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.felipesilva.senai.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByName(String name);
    
}
