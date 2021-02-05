package info.microservie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.microservice.service.DepartmentService;
import info.microservie.enitty.Department;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping
	public Department findDepartmentById(@PathVariable("id")Long departmentId) {
		
		return departmentService.findDepartmenById(departmentId);
	}
}
