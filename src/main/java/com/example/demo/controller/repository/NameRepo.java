package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.NameList;

@Repository
public interface NameRepo extends JpaRepository<NameList,Integer>{

}
