package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== INSERT =====");
		
		Department department = new Department(null, "Testes");
	//departmentDao.insert(department);
		
		System.out.println("Inserted! New id = " + department.getId());
		
		System.out.println("===== UPDATE =====");
		
		department.setName("Jogos");
		department.setId(1);
		departmentDao.update(department);
		
		System.out.println("Updated!");
		
		System.out.println("===== DELETE =====");
		
//		departmentDao.deleteById(9);
		
		System.out.println("Deleted!!");
		
		System.out.println("===== FINDALL =====");
		
		List<Department> departmentAll = departmentDao.findAll();
		
		for(Department dep : departmentAll) {
			System.out.println(dep);
		}
		
		System.out.println("===== FINDBYID =====");
		
		Department departmentFind = departmentDao.findById(4);
		System.out.println(departmentFind);
	}
}
