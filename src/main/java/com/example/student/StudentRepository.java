package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	

public Student findById(int id) {
    return jdbcTemplate.queryForObject("select * from student where id=?", new Object[] {
            id
        },
        new BeanPropertyRowMapper < Student > (Student.class));
}

public List<Student> list() {
    return jdbcTemplate.query("select * from student", new Object[] {
            
        },
        new BeanPropertyRowMapper < Student > (Student.class));
}

}
