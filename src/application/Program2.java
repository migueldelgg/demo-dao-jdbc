package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        System.out.print("Which ID do you want to search for? ");
        int responseId = sc.nextInt();
        Department department = departmentDao.findById(responseId);
        System.out.println(department);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list;
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        //System.out.println("\n=== TEST 3: deparment insert ===");
        //Department newDepartment = new Department(null, "D3");
        //departmentDao.insert(newDepartment);
        //System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findById(6);
        department.setName("Market");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department update ===");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
    }
}
