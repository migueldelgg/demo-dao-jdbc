package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj); // responsavel por inserir obj no banco de dados

    void update(Seller obj);

    void deleteById(Integer id);

    // responsavel por pegar o um int Id, consultar no banco de dados um objeto com esse id
    Seller findById(Integer id);

    List<Seller> findAll();
}
