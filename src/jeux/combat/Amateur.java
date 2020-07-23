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
public class Amateur extends Personnage {
     private String coupBasique = "coup de tête";
    private String couSpecial = "double coups de points";
    private int vieDepart = 0;

    public Amateur(String nom1, String nom, int typePersonnage, int niveau, int force, int agilite, int intelligence) {

        super(nom1, nom, typePersonnage, niveau, force, agilite, intelligence);
        vieDepart = getVie();
    }

     @Override
    public int attackBasique(){
        return getIntelligence();
    }

     @Override
    public int attackSpecial() {
        int vie = 0;
        if(getVie() + getIntelligence() * 2 <= vieDepart) {
            vie = getVie() + getIntelligence() * 2;
            setVie(vie);
            return getIntelligence() * 2;
        } else {
            int vieAvant = getVie();
            vie = vieDepart;
            setVie(vie);
            return vieDepart - vieAvant;
        }
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
