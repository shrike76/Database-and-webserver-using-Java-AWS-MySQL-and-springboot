package com.example.CIS3368Assignment4.Models;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Integer> {
    List<Student> findByFname(String fname);
}
