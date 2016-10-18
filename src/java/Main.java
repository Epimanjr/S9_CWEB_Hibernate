
import metier.Abonne;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Maxime BLAISE
 */
public class Main {

    public static void main(String[] args) {
        // Connexion à Hibernate
        Session session = HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();

        // Création d'un abonné
        Abonne unAbonne = new Abonne();
        unAbonne.setLoginAbonne("Maxime");
        unAbonne.setMdpAbonne("bla");

        // Sauvegarde de l'abonné
        session.save(unAbonne);
        tx.commit();
        
         // Modifie l'abonné
        unAbonne.setMdpAbonne("bliblo");
        
        // Détache l'abonné
        session.evict(unAbonne);
        
        // Modifie l'abonnée
        unAbonne.setMdpAbonne("blublu");
        
        // Rattache l'abonné
        session.merge(unAbonne);
        session.update(unAbonne);
        
        // Affiche l'abonné
        System.out.println(unAbonne);
    }
}
