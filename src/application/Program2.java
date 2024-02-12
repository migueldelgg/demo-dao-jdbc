package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById ===");
        System.out.print("Which ID do you want to search for? ");
        int responseId = sc.nextInt();
        Department department = departmentDao.findById(responseId);
        System.out.println(department);


    }
}
