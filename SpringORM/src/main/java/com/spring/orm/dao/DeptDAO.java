package com.spring.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.spring.orm.model.Dept;

@Service
public class DeptDAO {

	@PersistenceContext
	private EntityManager em;

	public void persist(Dept dpt) {
		em.persist(dpt);
	}

	public List<Dept> findAll() {
		return em.createNativeQuery("SELECT * FROM Dept", Dept.class).getResultList();
	}
}
