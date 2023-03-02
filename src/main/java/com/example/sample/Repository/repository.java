package com.example.sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.Table.student;

public interface repository extends JpaRepository<student,Integer>{

}
