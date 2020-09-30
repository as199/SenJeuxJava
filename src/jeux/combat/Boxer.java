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
public class Boxer extends Personnage {
     @SuppressWarnings("FieldMayBeFinal")
     private String coupBasique = "Coup de point";
    private String couSpecial = "Coup de pied";
    private int viePerdu = 0;

    public Boxer(String prenom, String nom, int typePersonnage, int niveau, int force, int agilite, int intelligence) {

        super(prenom, nom, typePersonnage, niveau, force, agilite, intelligence);
    }

     @Override
    public int attackBasique(){
        return getForce();
    }

     @Override
    public int attackSpecial() {
        viePerdu = getForce() / 2;
        setVie(getVie() - viePerdu);
        return getForce() * 2;
    }

     @Override
    public String getCoupBasique() {
        return coupBasique;
    }

     @Override
    public String getCouSpecial() {
        return couSpecial;
    }

    public int getViePerdu() {
        return viePerdu;
    }
}
