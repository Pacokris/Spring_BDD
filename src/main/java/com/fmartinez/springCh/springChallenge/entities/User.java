package com.fmartinez.springCh.springChallenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    public User() {
    }

    public User(String titre, String producteur, int nbSaison) {
        this.titre = titre;
        this.producteur = producteur;
        this.nbSaison = nbSaison;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String titre;

    private String producteur;

    private int nbSaison;

    @Override
    public String toString() { 
        return "User [id=" + id + ", titre=" + titre + 
                ", producteur=" + producteur + ", nbSaison=" + nbSaison + "]";
    } 

	    public Long getId() {
	        return id;
	    }

	    /* On ne définit pas de setId() car l'id sera généré automatiquement */

	    public String getTitre() {
	        return titre;
	    }

	    public void setTitre(String titre) {
	        this.titre = titre;
	    }

	    public String getProducteur() {
	        return producteur;
	    }

	    public void setProducteur(String producteur) {
	        this.producteur = producteur;
	    }

	    public int getNbSaison() {
	        return nbSaison;
	    }

	    public void setNbSaison(int nbSaison) {
	        this.nbSaison = nbSaison;
	    }    
}

