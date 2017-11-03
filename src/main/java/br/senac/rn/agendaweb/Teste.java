package br.senac.rn.agendaweb;

import br.senac.rn.agendawebservice.model.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Vinicius");
        aluno.setEndereco("rua dos caiacos  36");
        aluno.setFone("3232-3232");
        aluno.setSite("www.site.com.be");
        aluno.setNota(10.0);
        
        
        
        
        
        
        
        
        
     //   EntityManagerFactory factory = Persistence.createEntityManagerFactory("ConexaoDB");
       
        
//        EntityManager manager = factory.createEntityManager();
//        
//        try {
//        manager.getTransaction().begin();
//        manager.persist(aluno);
//        manager.getTransaction().commit();
   //     manager.close();
//        } catch (Exception error) {
//            System.out.println("Não pode haver fones iguais");
//            manager.getTransaction().rollback(); // voltar e fazer denovo
//        }
        

        
        System.exit(0);
        
       
        
    }
    
}
