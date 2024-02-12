package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    // Classe com operações estáticas para instanciar/inicializar os Daos

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
