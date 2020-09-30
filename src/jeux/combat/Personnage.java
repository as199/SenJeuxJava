/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeux.combat;

/**
 *
 * @author Assane Dione
 */
public abstract class Personnage {
    
    private String prenom;
    @SuppressWarnings("FieldMayBeFinal")
    private String nom;
    @SuppressWarnings("FieldMayBeFinal")
    private int typePersonnage;
    @SuppressWarnings("FieldMayBeFinal")
    private int niveau;
    @SuppressWarnings("FieldMayBeFinal")
    private int vie;
    @SuppressWarnings("FieldMayBeFinal")
    private int force;
    @SuppressWarnings("FieldMayBeFinal")
    private int agilite;
    @SuppressWarnings("FieldMayBeFinal")
    private int intelligence;

    public Personnage(String prenom, String nom, int typePersonnage, int niveau,int force, int agilite, int intelligence) {

        this.prenom = prenom;
        this.nom = nom;
        this.typePersonnage = typePersonnage;
        this.niveau = niveau;
        this.vie = niveau * 5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

    public abstract int attackBasique();
    public abstract int attackSpecial();
    public abstract String getCoupBasique();
    public abstract String getCouSpecial();

    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getTypePersonnage() {
        return typePersonnage;
    }

    public String getNom() {
        return nom;
    }


    public String getprenom() {
        return prenom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
}
