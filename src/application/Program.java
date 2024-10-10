package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		SellerDao sellerDao = DaoFactory.createSellerDao();
//		
//		System.out.println("=== TEST 1: seller findById ===");
//		Seller seller = sellerDao.findById(2);
//		System.out.println(seller);
//		
//		System.out.println("=== TEST 2: seller findByDepartment ===");
//		List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("=== TEST 3: seller findAll ===");
//		list = sellerDao.findAll();
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("=== TEST 4: seller insert ===");
//		Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0, new Department(2,null));
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//
//		System.out.println("=== TEST 5: seller update ===");
//		seller = sellerDao.findById(1);
//		seller.setName("Marta waine");
//		sellerDao.update(seller);
//		System.out.println("seller Updated");
//		
//		System.out.println("=== TEST 6: seller delete ===");
//		System.out.println("Enter id for delete test:");
//		int id = sc.nextInt();
//		sellerDao.deleteById(id);
//		System.out.println("Delete completed");
//		sc.close();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
		System.out.println("=== TEST 3: Department insert ===");
        dep = new Department(null,"GAMES");
        departmentDao.insert(dep);
		System.out.println("Departamento " + dep.getName() + " adicionado com o id = "+ dep.getId());
		
		System.out.println("=== TEST 4: Department update ===");
        departmentDao.update(new Department(8,"Games"));
        dep = departmentDao.findById(8);
		System.out.println("Departamento " + dep.getId() + " Foi atualizado com o nome " + dep.getName());
		
		System.out.println("=== TEST 5: Department delete ===");
        departmentDao.deleteById(8);
		System.out.println("Departamento 8 Foi deletado");
		
		
		
	}
}
