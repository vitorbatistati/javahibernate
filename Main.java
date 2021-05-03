package cadastrodeemail;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    private static EntityManagerFactory entityManagerFactory;

    public static void main(String args[]) {

        entityManagerFactory = Persistence.createEntityManagerFactory("hibernatejpa");



        Cadastro cadastros = new Cadastro();
       // cadastros.setCpf("09001444322");
        cadastros.setNome("vitor");
        cadastros.setEmail("vitorboliveira11@gmail.com");
        cadastros.setSenha("123456789");


        EntityManager em = entityManagerFactory.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(cadastros);
            em.getTransaction().commit();

        }catch (Exception e){
            em.getTransaction().rollback();
            System.out.println(("insert: "+ e.getMessage()));
        }finally {
            em.close();
        }


    }

}