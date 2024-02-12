package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); // responsavel por inserir obj no banco de dados

    void update(Department obj);

    void deleteById(Integer id);

    // responsavel por pegar o um int Id, consultar no banco de dados um objeto com esse id
    Department findById(Integer id);

    List<Department> findAll();


}
