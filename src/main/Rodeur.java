package main;

public class Rodeur extends Personnage{
     public int degats = agilite;


    public Rodeur(String nomPerso, int niv, int vie, int force, int agilite, int intelligence, String nomAttBase, String nomAttSpe) {
        super(nomPerso, niv, vie, force, agilite, intelligence, nomAttBase, nomAttSpe);
        System.out.println("Je m'appelle " + this.nomPerso + " et je suis un Rodeur de niveau " + this.niv + ", mes carac sont " + this.vie + " pv, " + this.force + " force, " + this.agilite + " agilite, " + this.intelligence + " intelligence");
    }

    @Override
    public void attaqueDeBase(Personnage persoDef) {
        persoDef.vie -= degats;
    }

    @Override
    public void attaqueSpecial( Personnage persoDef) {
        degats = agilite + (niv/2);
        System.out.println("Vous utilisez " + nomAttSpe + " vous augmentez vos dégats");
    }
}
