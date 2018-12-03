package com.fmartinez.springCh.springChallenge.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.fmartinez.springCh.springChallenge.entities.User;
import com.fmartinez.springCh.springChallenge.repositories.UserDao;

@Component
public class Outputter implements CommandLineRunner {

    private Logger LOG = LoggerFactory.getLogger("Series");

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {

        // Checke combien d'objets se trouvent dans la BDD        
        LOG.info("******************");
        LOG.info("Objects in DB : " + userDao.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        User user1 = new User("Crown", "Andrew Eaton", 2);
        LOG.info("******************");
        LOG.info(user1 + " has been created !");
        userDao.save(user1);
        LOG.info(user1 + " has been saved !");
    
        // Crée un second utilisateur et l'enregistre dans la BDD
        User user2 = new User("House of Cards", "Beau Willimon", 6);
        LOG.info("******************");
        LOG.info(user2 + " has been created !");
        userDao.save(user2);
        LOG.info(user2 + " has been saved !");
        
        // Crée un troisième utilisateur et l'enregistre dans la BDD
        User user3 = new User("MindHunter", "David Fincher", 1);
        LOG.info("******************");
        LOG.info(user3 + " has been created !");
        userDao.save(user3);
        LOG.info(user3 + " has been saved !");
        
        // Crée un quatrième utilisateur et l'enregistre dans la BDD
        User user4 = new User("Narcos", "Carlo Bernard", 4);
        LOG.info("******************");
        LOG.info(user4 + " has been created !");
        userDao.save(user4);
        LOG.info(user4 + " has been saved !");
        
        // Crée un cinquième utilisateur et l'enregistre dans la BDD
        User user5 = new User("Stranger Things", "Matt Duffer", 2);
        LOG.info("******************");
        LOG.info(user5 + " has been created !");
        userDao.save(user5);
        LOG.info(user5 + " has been saved !");
        

        // Lit les informations correspondant au second utilisateur
        User tempUser = userDao.findById(2L).get(); /* On écrit "2L" car 
                                                       le type de l'id est Long */
        LOG.info("******************");
        LOG.info("Second user's titre is " + tempUser.getTitre());
        LOG.info("Second user's producteur is " + tempUser.getProducteur());
        LOG.info("Second user's nbSaison is " + tempUser.getNbSaison());

        // Liste les utilisateurs enregistrés dans la BDD
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(User myUser : userDao.findAll()) {
            LOG.info(myUser.toString());
        };

        // Supprime le second utilisateur de la BDD
        userDao.deleteById(2L); /* risque de provoquer une erreur si 
                                tu n'as pas vidé ta table avant de relancer 
                                ton application ! */

        /*     Liste les utilisateurs enregistrés dans la BDD
             (permet de vérifier que le second utilisateur
             a bien été supprimé de la BDD) */
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(User myUser : userDao.findAll()) {
            LOG.info(myUser.toString());
        };
    }
}
        