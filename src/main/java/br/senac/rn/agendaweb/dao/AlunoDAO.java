package br.senac.rn.agendaweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoDAO {

    private final EntityManagerFactory factory;
    private final EntityManager manager;       

    public AlunoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        
    }



    
}
