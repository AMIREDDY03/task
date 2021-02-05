package info.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.microservie.enitty.Department;
import info.microservie.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmenById(Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId) ;
		
		
	}
}
