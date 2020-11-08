package com.ns;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMysqlRepository extends JpaRepository<Student, String> {

    List<Student> findByFirstNameContaining(String title);
}
