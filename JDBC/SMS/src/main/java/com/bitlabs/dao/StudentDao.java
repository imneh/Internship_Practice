package com.bitlabs.dao;

import com.bitlabs.entity.Student;

public interface StudentDao {
public int addStudent(Student st);
public int getStudent();
public int updateStudentById(int id,String name);
public int deleteStudentById(int id);
public int getStudentById(int id);
}