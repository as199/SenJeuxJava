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
public class Professionnel extends Personnage {
     private String coupBasique = "coup de point";
    private String couSpecial = "Concentration";

    public Professionnel(String prenom, String nom, int typePersonnage, int niveau, int force, int agilite, int intelligence) {

        super(prenom, nom, typePersonnage, niveau, force, agilite, intelligence);
    }

     @Override
    public int attackBasique(){
        return getAgilite();
    }

     @Override
    public int attackSpecial() {
        int agiliteDepart = getAgilite();
        int agiliteGagne = getNiveau() / 2;
        setAgilite(agiliteDepart + agiliteGagne);

        return agiliteGagne;
    }

     @Override
    public String getCoupBasique() {
        return coupBasique;
    }

     @Override
    public String getCouSpecial() {
        return couSpecial;
    }
}
