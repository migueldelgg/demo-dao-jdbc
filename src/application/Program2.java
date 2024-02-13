package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
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

        System.out.println("\n=== TEST 2: seller findAll ===");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }


    }
}
