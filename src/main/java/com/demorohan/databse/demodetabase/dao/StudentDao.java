package com.demorohan.databse.demodetabase.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.demorohan.databse.demodetabase.model.StudentModel;

@Repository
@Transactional
public class StudentDao {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<StudentModel> FindAll(){
		TypedQuery<StudentModel> namedQuery = entityManager.createNamedQuery("Find_all_Students",StudentModel.class);
		return namedQuery.getResultList();
		
		
	}
	
	public StudentModel insert(StudentModel studentModel) {
		return entityManager.merge(studentModel);
		
	}

	public StudentModel FindById(int id) {
		return entityManager.find(StudentModel.class,id);
		
	}
	
	public void DeleteById(int id) {
		StudentModel studentModel=FindById(id);
		entityManager.remove(studentModel);
	}
}
