package com.spring.orm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.orm.dao.DeptDAO;
import com.spring.orm.model.Dept;

@Controller

public class DeptController {

	DeptDAO ddao;

	@Autowired

	public DeptController(DeptDAO dptdao) {

		ddao = dptdao;

	}

	/**
	 * 
	 * selects the Add New Employee view to render by returning its name.
	 * 
	 */

	@RequestMapping(value = "/deptlist", method = RequestMethod.GET)

	public String getAllDepts(Model model) {

		System.out.println("Departments List JSP Requested");

		// get all Departments from DAO

		List<Dept> deptList = ddao.findAll();

		// set it to the model

		model.addAttribute("dlist", deptList);
		System.out.println(deptList);
		// call the view

		return "deptlist";

	}

}
