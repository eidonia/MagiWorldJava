package main;

public class Guerrier extends Personnage {
    int degats = force;

    public Guerrier(String nomPerso, int niv, int vie, int force, int agilite, int intelligence, String nomAttBase, String nomAttSpe) {
        super(nomPerso, niv, vie, force, agilite, intelligence, nomAttBase, nomAttSpe);
        System.out.println("Je m'appelle " + this.nomPerso + " et je suis un Guerrier de niveau " + this.niv + ", mes carac sont " + this.vie + " pv, " + this.force + " force, " + this.agilite + " agilite, " + this.intelligence + " intelligence");
    }

    @Override
    public void attaqueDeBase(Personnage persoDef) {
        persoDef.vie -= degats;
    }

    @Override
    public void attaqueSpecial(Personnage persoDef) {
        int currentdegats = degats + (niv/2);
        persoDef.vie -= currentdegats;
        System.out.println("Vous assénez " + nomAttSpe + " à " + persoDef.nomPerso);

    }
}
